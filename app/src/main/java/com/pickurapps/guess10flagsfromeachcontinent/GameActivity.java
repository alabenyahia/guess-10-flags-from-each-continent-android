package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {
    TextView flagNumTv;
    TextView coinsNumTv;
    UserData userData;
    char[] writtenAnswer = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    String[] tags = {"", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    int continent;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        flagNumTv = findViewById(R.id.flag_num_tv);
        coinsNumTv = findViewById(R.id.coins_num_tv);
        userData = UserData.getInstance(this);


        // get and set the continent that we're playing it
        Intent intent = getIntent();
        continent = intent.getIntExtra("continent", 0);
        userData.setCurrentContinent(userData.getContinents()[continent]);

        setupNextFlag();

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6185803298667574/6301369335");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

    }
    private void resetWrittenAnswerAndTag() {
        for(int i=0;i<14;i++){
            writtenAnswer[i]= ' ';
            tags[i]= "";
        }
    }

    // TODO : length of answer text views stay same of before it
    private void setupNextFlag() {
        resetWrittenAnswerAndTag();
        // set the flag number and the coins number textviews
        flagNumTv.setText(String.valueOf(userData.getCurrentContinent().getCurrentFlagNum()+1) + "/10");
        coinsNumTv.setText(String.valueOf(userData.getCoinsNum()));

        // set flag picture
        ImageView flagIv = findViewById(R.id.flag_iv);
        flagIv.setImageResource(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].
                getImageId());
        //set answer textview to empty string
        TextView answerTv = findViewById(R.id.answer_tv);
        answerTv.setText("");
        // set random chars textviews
        LinearLayout pickFl = findViewById(R.id.pick_fl);
        for (int i=0; i < pickFl.getChildCount(); i++) {
            TextView tv = (TextView) pickFl.getChildAt(i);
            tv.setVisibility(View.VISIBLE);
            tv.setText(String.valueOf(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()]
                    .getRandomChars()[i]));
        }

        LinearLayout pickSl = findViewById(R.id.pick_sl);
        for (int i=0, j=7; i < pickFl.getChildCount(); i++, j++) {
            TextView tv = (TextView) pickSl.getChildAt(i);
            tv.setVisibility(View.VISIBLE);
            tv.setText(String.valueOf(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()]
                    .getRandomChars()[j]));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utils.hideSystemUI(this);
    }

    public void backBtnClicked(View view) {
        finish();
    }

    public void p1Clicked(View view) {
        randomCharClicked(view);
    }

    public void p2Clicked(View view) {
        randomCharClicked(view);
    }

    public void p3Clicked(View view) {
        randomCharClicked(view);
    }

    public void p4Clicked(View view) {
        randomCharClicked(view);
    }

    public void p5Clicked(View view) {
        randomCharClicked(view);
    }

    public void p6Clicked(View view) {
        randomCharClicked(view);
    }

    public void p7Clicked(View view) {
        randomCharClicked(view);
    }

    public void p8Clicked(View view) {
        randomCharClicked(view);
    }

    public void p9Clicked(View view) {
        randomCharClicked(view);
    }

    public void p10Clicked(View view) {
        randomCharClicked(view);
    }

    public void p11Clicked(View view) {
        randomCharClicked(view);
    }

    public void p12Clicked(View view) {
        randomCharClicked(view);
    }

    public void p13Clicked(View view) {
        randomCharClicked(view);
    }

    public void p14Clicked(View view) {
        randomCharClicked(view);
    }

    // fill the answer textview with the chosen chars
    private void fillAnswerTextView() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<writtenAnswer.length;i++) {
            stringBuilder.append(writtenAnswer[i]);
        }
        TextView tv = findViewById(R.id.answer_tv);
        tv.setText(stringBuilder.toString());
    }

    // click on a random character textview
    private void randomCharClicked(View view){
        int nextPos = searchWrittenAnswerNextPos();
        if (nextPos == -1) {
            Toast.makeText(view.getContext(), "Wrong Answer",
                    Toast.LENGTH_SHORT).show();
            setupNextFlag();
        }
        else if (nextPos < userData.getCurrentContinent().getStages()[userData
                .getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length) {
            writtenAnswer[nextPos] = ((TextView)view).getText().toString().charAt(0);
            tags[nextPos] = view.getTag().toString();
            fillAnswerTextView();
            view.setVisibility(View.INVISIBLE);
            nextPos = searchWrittenAnswerNextPos();
            if (isFlagCompleted()) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                //show dialog
                showNextCountryDialog(this, userData.getCurrentContinent().getStages()[userData
                        .getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length);
                // add coins to coins num
                userData.setCoinsNum(userData.getCoinsNum()+userData.getCurrentContinent().getStages()[userData
                        .getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length);
                // save new coins num to shared pref
                SharedPreferences sharedPref = getSharedPreferences(
                        getString(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt(getString(R.string.preference_coins_num), userData.getCoinsNum());
                editor.commit();
                // set new coins num value to textview
                coinsNumTv.setText(String.valueOf(userData.getCoinsNum()));

                // set current flag num to the next
                if (userData.getCurrentContinent().getCurrentFlagNum()<9) {
                    userData.getCurrentContinent().setCurrentFlagNum(userData
                        .getCurrentContinent().getCurrentFlagNum()+1);
                    // save current flag num to shared pref
                    switch (continent) {
                        case 0: editor.putInt(getString(R.string.preference_south_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 1: editor.putInt(getString(R.string.preference_north_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 2: editor.putInt(getString(R.string.preference_europe_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 3: editor.putInt(getString(R.string.preference_asia_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 4: editor.putInt(getString(R.string.preference_africa_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                    }
                    setupNextFlag();
                }
                // if continent completed
                else {
                    userData.getCurrentContinent().setCurrentFlagNum(0);
                    // save current flag num to shared pref
                    switch (continent) {
                        case 0: editor.putInt(getString(R.string.preference_south_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 1: editor.putInt(getString(R.string.preference_north_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 2: editor.putInt(getString(R.string.preference_europe_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 3: editor.putInt(getString(R.string.preference_asia_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                        case 4: editor.putInt(getString(R.string.preference_africa_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                            editor.commit();
                            break;
                    }
                    //unlock next continent
                    userData.getContinents()[continent+1].setLocked(false);
                    switch (continent+1) {
                        case 0: editor.putBoolean(getString(R.string.preference_south_america_islocked), false);
                            editor.commit();
                            break;
                        case 1: editor.putBoolean(getString(R.string.preference_north_america_islocked), false);
                            editor.commit();
                            break;
                        case 2: editor.putBoolean(getString(R.string.preference_europe_islocked), false);
                            editor.commit();
                            break;
                        case 3: editor.putBoolean(getString(R.string.preference_asia_islocked), false);
                            editor.commit();
                            break;
                        case 4: editor.putBoolean(getString(R.string.preference_africa_islocked), false);
                            editor.commit();
                            break;
                    }


                    endOfStageDialog(this);

                }

            }
            // recheck if the answer is wrong
            else if (nextPos == -1) {
                Toast.makeText(view.getContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }

        }
    }


    // search for the next position to use in the written answer array
    private int searchWrittenAnswerNextPos() {
        for (int i=0; i<userData.getCurrentContinent().getStages()[userData.getCurrentContinent()
                .getCurrentFlagNum()].getCorrectAnswer().length ; i++) {
            if (writtenAnswer[i] == ' ') return i;
        }
        return -1;
    }

    private boolean isFlagCompleted() {
        int answerLength = userData.getCurrentContinent().getStages()[
                userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length;
        char[] wrtnAnswer = new char[answerLength];
        for (int i=0; i<answerLength;i++) {
            wrtnAnswer[i] = writtenAnswer[i];
        }


        if (Arrays.equals(wrtnAnswer, userData.getCurrentContinent().getStages()
                [userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer())) {
            return true;
        }
        else return false;
    }

    private void showNextCountryDialog(final Activity activity, int coinsNum){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (dialog.getWindow()!= null)
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        dialog.setCancelable(false);
        dialog.setContentView(R.layout.nextcountry_dialog);

        TextView coinsTv = dialog.findViewById(R.id.nextcountry_dialog_coins_tv);
        coinsTv.setText("+"+String.valueOf(coinsNum));

        Button continueButton = dialog.findViewById(R.id.nextcountry_dialog_continue_btn);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Utils.hideSystemUI(activity);
            }
        });

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        dialog.show();
        dialog.getWindow().setAttributes(lp);

    }

    private void endOfStageDialog(final Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (dialog.getWindow()!= null)
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        dialog.setCancelable(false);
        dialog.setContentView(R.layout.endofstage_dialog);



        Button continueButton = dialog.findViewById(R.id.end_of_stage_ok_btn);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Utils.hideSystemUI(activity);
                Intent myIntent = new Intent(GameActivity.this, StagesActivity.class);
                startActivity(myIntent);
            }
        });

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        dialog.show();
        dialog.getWindow().setAttributes(lp);

    }

    public void skipToNextFlagClicked(View view) {
        if (userData.getCoinsNum() >= 50 && userData.getCurrentContinent().getCurrentFlagNum()<9) {
            SharedPreferences sharedPref = getSharedPreferences(
                    getString(R.string.preference_file_key), Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            // set current flag num to the next
            if (userData.getCurrentContinent().getCurrentFlagNum() < 9) {
                userData.getCurrentContinent().setCurrentFlagNum(userData
                        .getCurrentContinent().getCurrentFlagNum() + 1);
                // save current flag num to shared pref
                switch (continent) {
                    case 0:
                        editor.putInt(getString(R.string.preference_south_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 1:
                        editor.putInt(getString(R.string.preference_north_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 2:
                        editor.putInt(getString(R.string.preference_europe_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 3:
                        editor.putInt(getString(R.string.preference_asia_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 4:
                        editor.putInt(getString(R.string.preference_africa_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                }

                setupNextFlag();
                // remove used amount of coins
                userData.setCoinsNum(userData.getCoinsNum()-50);
                editor.putInt(getString(R.string.preference_coins_num), userData.getCoinsNum());
                editor.commit();
            }
            // if continent completed
            else {
                userData.getCurrentContinent().setCurrentFlagNum(0);
                // save current flag num to shared pref
                switch (continent) {
                    case 0:
                        editor.putInt(getString(R.string.preference_south_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 1:
                        editor.putInt(getString(R.string.preference_north_america_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 2:
                        editor.putInt(getString(R.string.preference_europe_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 3:
                        editor.putInt(getString(R.string.preference_asia_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                    case 4:
                        editor.putInt(getString(R.string.preference_africa_currentflag), userData
                                .getCurrentContinent().getCurrentFlagNum());
                        editor.commit();
                        break;
                }
                //unlock next continent
                userData.getContinents()[continent + 1].setLocked(false);
                switch (continent + 1) {
                    case 0:
                        editor.putBoolean(getString(R.string.preference_south_america_islocked), false);
                        editor.commit();
                        break;
                    case 1:
                        editor.putBoolean(getString(R.string.preference_north_america_islocked), false);
                        editor.commit();
                        break;
                    case 2:
                        editor.putBoolean(getString(R.string.preference_europe_islocked), false);
                        editor.commit();
                        break;
                    case 3:
                        editor.putBoolean(getString(R.string.preference_asia_islocked), false);
                        editor.commit();
                        break;
                    case 4:
                        editor.putBoolean(getString(R.string.preference_africa_islocked), false);
                        editor.commit();
                        break;
                }
            }

        } else {
            Toast.makeText(view.getContext(), "50 coins needed",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void resetClicked(View view) {
        setupNextFlag();
    }
}
