package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize sharedPref if it doesn't have any value yet
        SharedPreferences sharedPref = getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        if (!sharedPref.contains(getString(R.string.preference_coins_num))) {
            editor.putInt(getString(R.string.preference_coins_num), 25);
            editor.commit();
        }
        /*if (!sharedPref.contains(getString(R.string.preference_current_continent))) {
            editor.putInt(getString(R.string.preference_current_continent), 0);
            editor.commit();
        }
        if (!sharedPref.contains(getString(R.string.preference_current_flag_num))) {
            editor.putInt(getString(R.string.preference_current_flag_num), 0);
            editor.commit();
        }*/

        //sharedPref is continent locked
        if (!sharedPref.contains(getString(R.string.preference_south_america_islocked))) {
            editor.putBoolean(getString(R.string.preference_south_america_islocked), false);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_north_america_islocked))) {
            editor.putBoolean(getString(R.string.preference_north_america_islocked), true);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_europe_islocked))) {
            editor.putBoolean(getString(R.string.preference_europe_islocked), true);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_asia_islocked))) {
            editor.putBoolean(getString(R.string.preference_asia_islocked), true);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_africa_islocked))) {
            editor.putBoolean(getString(R.string.preference_africa_islocked), true);
            editor.commit();
        }

        // sharedPref current flag num
        if (!sharedPref.contains(getString(R.string.preference_south_america_currentflag))) {
            editor.putInt(getString(R.string.preference_south_america_currentflag), 0);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_north_america_currentflag))) {
            editor.putInt(getString(R.string.preference_north_america_currentflag), 0);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_europe_currentflag))) {
            editor.putInt(getString(R.string.preference_europe_currentflag), 0);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_asia_currentflag))) {
            editor.putInt(getString(R.string.preference_asia_currentflag), 0);
            editor.commit();
        }

        if (!sharedPref.contains(getString(R.string.preference_africa_currentflag))) {
            editor.putInt(getString(R.string.preference_africa_currentflag), 0);
            editor.commit();
        }



        // initialize userData 1st time
        userData = UserData.getInstance(this);

        /*userData.setCoinsNum(sharedPref.getInt(getString(R.string.preference_coins_num), 25));
        int currentContinent = sharedPref.getInt(getString(R.string.preference_current_continent), 0);
        userData.setCurrentContinent(Continent.values()[currentContinent]);
        userData.setCurrentFlagNum(sharedPref.getInt(getString(R.string.preference_current_flag_num), 0));*/

    }

    @Override
    protected void onResume() {
        super.onResume();
        Utils.hideSystemUI(this);
    }


    public void startClicked(View view) {
        Intent myIntent = new Intent(MainActivity.this, StagesActivity.class);
        startActivity(myIntent);
    }
}


