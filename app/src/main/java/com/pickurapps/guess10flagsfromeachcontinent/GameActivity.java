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
    String[] tags = {"", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    int tagsNextPos;
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

        // set answer textviews first line
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

        // set answer textviews second line
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

        // if correct answer is less than 6 then delete answer second line
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
            tv.setTag(tags[i]);

        }

        LinearLayout answerSl = findViewById(R.id.answer_sl);
        for (int i=0,j=answerFl.getChildCount(); i< answerSl.getChildCount(); i++,j++) {
            TextView tv = (TextView) answerSl.getChildAt(i);
            tv.setText(String.valueOf(writtenAnswer[j]));
            tv.setTag(tags[j]);
        }
    }

    // click on a random character textview
    private void randomCharClicked(View view){
        int nextPos = searchWrittenAnswerNextPos();
        if (nextPos != -1 && nextPos < userData.getCurrentContinent().getStages()[userData
                .getCurrentContinent().getCurrentFlagNum()].getCorrectAnswer().length) {
            writtenAnswer[nextPos] = ((TextView)view).getText().toString().charAt(0);
            tags[nextPos] = ((TextView)view).getTag().toString();
            /*tagsNextPos++;
            writtenAnswerNextPos++;*/
            fillAnswerTextViews();
            view.setVisibility(View.INVISIBLE);
        }

    }

    public void a1(View view) {
        answerCharClicked(view, 0);
    }

    public void a2(View view) {
        answerCharClicked(view, 1);
    }

    public void a3(View view) {
        answerCharClicked(view, 2);
    }

    public void a4(View view) {
        answerCharClicked(view, 3);
    }

    public void a5(View view) {
        answerCharClicked(view, 4);
    }

    public void a6(View view) {
        answerCharClicked(view, 5);
    }

    public void a7(View view) {
        answerCharClicked(view, 6);
    }

    public void a8(View view) {
        answerCharClicked(view, 7);
    }

    public void a9(View view) {
        answerCharClicked(view, 8);
    }

    public void a10(View view) {
        answerCharClicked(view, 9);
    }

    public void a11(View view) {
        answerCharClicked(view, 10);
    }

    public void a12(View view) {
        answerCharClicked(view, 11);
    }

    // fired when answer char clicked
    private void answerCharClicked(View view, int pos) {
        ((TextView)view).setText(" ");
        writtenAnswer[pos] = ' ';
        tags[pos] = "";

        LinearLayout pickFl = findViewById(R.id.pick_fl);
        for (int i=0; i < pickFl.getChildCount(); i++) {
            TextView tv = (TextView) pickFl.getChildAt(i);
            if (((TextView)view).getTag().equals(tv.getTag())) {
                tv.setVisibility(View.VISIBLE);
            }
        }

        LinearLayout pickSl = findViewById(R.id.pick_sl);
        for (int i=0, j=7; i < pickFl.getChildCount(); i++, j++) {
            TextView tv = (TextView) pickSl.getChildAt(i);
            if (((TextView)view).getTag().equals(tv.getTag())) {
                tv.setVisibility(View.VISIBLE);
            }
        }
    }

    // search for the next position to use in the written answer array
    private int searchWrittenAnswerNextPos() {
        for (int i=0; i<writtenAnswer.length ; i++) {
            if (writtenAnswer[i] == ' ') return i;
        }
        return -1;
    }
}
