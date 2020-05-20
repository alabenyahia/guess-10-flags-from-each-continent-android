package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView flagNumTv;
    TextView coinsNumTv;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Utils.hideSystemUI(this);

        flagNumTv = findViewById(R.id.flag_num_tv);
        coinsNumTv = findViewById(R.id.coins_num_tv);
        userData = UserData.getInstance();

        // set the flag number and the coins number textviews
        flagNumTv.setText(String.valueOf(userData.getCurrentFlagNum()+1) + "/10");
        coinsNumTv.setText(String.valueOf(userData.getCoinsNum()));

        // get the continent that we're playing it
        Intent intent = getIntent();
        String continent = intent.getStringExtra("continent");

    }

    public void backBtnClicked(View view) {
        finish();
    }
}
