package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;


public class MainActivity extends AppCompatActivity {
    UserData userData;
    private RewardedAd rewardedAd;

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

        rewardedAd = new RewardedAd(this, "ca-app-pub-6185803298667574/2573877315");

        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
            }

            @Override
            public void onRewardedAdFailedToLoad(int errorCode) {
                // Ad failed to load.
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);


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

    public void earnCoinsClicked(View view) {
        if (rewardedAd.isLoaded()) {
            Activity activityContext = MainActivity.this;
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                }

                @Override
                public void onUserEarnedReward(@NonNull RewardItem reward) {
                    userData.setCoinsNum(userData.getCoinsNum()+20);
                    SharedPreferences sharedPref = getSharedPreferences(
                            getString(R.string.preference_file_key), Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt(getString(R.string.preference_coins_num), userData.getCoinsNum());
                    editor.commit();
                }

                @Override
                public void onRewardedAdFailedToShow(int errorCode) {
                    // Ad failed to display.
                }
            };
            rewardedAd.show(activityContext, adCallback);
        }
    }
}


