package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class StagesActivity extends AppCompatActivity {
    UserData mUserData = UserData.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);
        Utils.hideSystemUI(this);
    }

    public void backBtnClicked(View view) {
        finish();
    }

    public void southAmericaClicked(View view) {
        if (mUserData.getCurrentContinent().ordinal() >= 0) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", "SOUTH_AMERICA");
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void northAmericaClicked(View view) {
        if (mUserData.getCurrentContinent().ordinal() >= 1) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", "NORTH_AMERICA");
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void europeClicked(View view) {
        if (mUserData.getCurrentContinent().ordinal() >= 2) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", "EUROPE");
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void asiaClicked(View view) {
        if (mUserData.getCurrentContinent().ordinal() >= 3) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", "ASIA");
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void africaClicked(View view) {
        if (mUserData.getCurrentContinent().ordinal() >= 4) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", "AFRICA");
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
