package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    UserData mUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.hideSystemUI(this);

        SharedPreferences sharedPref = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        if (!sharedPref.contains(getString(R.string.preference_coins_num))) {
            editor.putInt(getString(R.string.preference_coins_num), 25);
            editor.commit();
        }
        if (!sharedPref.contains(getString(R.string.preference_current_continent))) {
            editor.putInt(getString(R.string.preference_current_continent), 0);
            editor.commit();
        }
        if (!sharedPref.contains(getString(R.string.preference_current_flag_num))) {
            editor.putInt(getString(R.string.preference_current_flag_num), 0);
            editor.commit();
        }

        mUserData = UserData.getInstance();

        mUserData.setCoinsNum(sharedPref.getInt(getString(R.string.preference_coins_num), 25));
        int currentContinent = sharedPref.getInt(getString(R.string.preference_current_continent), 0);
        mUserData.setCurrentContinent(Continent.values()[currentContinent]);
        mUserData.setCurrentFlagNum(sharedPref.getInt(getString(R.string.preference_current_flag_num), 0));

    }


    public void startClicked(View view) {
        Intent myIntent = new Intent(MainActivity.this, StagesActivity.class);
        startActivity(myIntent);
    }
}
