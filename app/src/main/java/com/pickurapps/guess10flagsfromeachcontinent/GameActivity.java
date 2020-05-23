package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView flagNumTv;
    TextView coinsNumTv;
    UserData userData;
    char[] writtenAnswer = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    int writtenAnswerNextPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        flagNumTv = findViewById(R.id.flag_num_tv);
        coinsNumTv = findViewById(R.id.coins_num_tv);
        userData = UserData.getInstance(this);


        // get the continent that we're playing it
        Intent intent = getIntent();
        int continent = intent.getIntExtra("continent", 0);
        userData.setCurrentContinent(userData.getContinents()[continent]);

        // set the flag number and the coins number textviews
        flagNumTv.setText(String.valueOf(userData.getCurrentContinent().getCurrentFlagNum()+1) + "/10");
        coinsNumTv.setText(String.valueOf(userData.getCoinsNum()));

        // set flag picture
        ImageView flagIv = findViewById(R.id.flag_iv);
        flagIv.setImageResource(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].
                                        getImageId());

        // set answer textviews
        LinearLayout answerFl = findViewById(R.id.answer_fl);
        boolean done = false;
        for (int i=0; i< answerFl.getChildCount(); i++) {
            if(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length<=i) {
                done = true;
            }
            TextView tv = (TextView) answerFl.getChildAt(i);

            if (!done) {
                tv.setText("");
            }else{
                tv.setVisibility(View.GONE);
            }
        }

        LinearLayout answerSl = findViewById(R.id.answer_sl);
        done = false;
        if (userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length > 6) {
            for (int i=0, j=6; i< answerSl.getChildCount(); i++, j++) {
                if(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length<=j) {
                    done = true;
                }
                TextView tv = (TextView) answerSl.getChildAt(i);

                if (!done) {
                    tv.setText("");
                }else{
                    tv.setVisibility(View.GONE);
                }
            }
        }

        if (userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length <= 6) {
            answerSl.setVisibility(View.GONE);
        }

        // set random chars textviews
        LinearLayout pickFl = findViewById(R.id.pick_fl);
        for (int i=0; i < pickFl.getChildCount(); i++) {
            TextView tv = (TextView) pickFl.getChildAt(i);
            tv.setText(String.valueOf(userData.getCurrentContinent().getStages()[userData.getCurrentContinent().getCurrentFlagNum()]
                                        .getRandomChars()[i]));
        }

        LinearLayout pickSl = findViewById(R.id.pick_sl);
        for (int i=0, j=7; i < pickFl.getChildCount(); i++, j++) {
            TextView tv = (TextView) pickSl.getChildAt(i);
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

    // fill the answer textviews with the chosen chars
    private void fillAnswerTextViews() {
        LinearLayout answerFl = findViewById(R.id.answer_fl);
        for (int i=0; i< answerFl.getChildCount(); i++) {
            TextView tv = (TextView) answerFl.getChildAt(i);
            tv.setText(String.valueOf(writtenAnswer[i]));

        }

        LinearLayout answerSl = findViewById(R.id.answer_sl);
        for (int i=0,j=answerFl.getChildCount(); i< answerSl.getChildCount(); i++,j++) {
            TextView tv = (TextView) answerSl.getChildAt(i);
            tv.setText(String.valueOf(writtenAnswer[j]));
        }
    }

    // click on a random character textview
    private void randomCharClicked(View view){
        if (writtenAnswerNextPos < userData.getCurrentContinent().getStages()[userData
                .getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length) {
            writtenAnswer[writtenAnswerNextPos] = ((TextView)view).getText().toString().charAt(0);
            writtenAnswerNextPos++;
            fillAnswerTextViews();
            view.setVisibility(View.INVISIBLE);
        }

    }
}
