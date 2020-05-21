package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class StagesActivity extends AppCompatActivity {
    UserData mUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);
        Utils.hideSystemUI(this);
        mUserData = UserData.getInstance(this);
    }

    public void backBtnClicked(View view) {
        finish();
    }

    public void southAmericaClicked(View view) {
        if (!mUserData.getContinents()[0].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 0);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void northAmericaClicked(View view) {
        if (!mUserData.getContinents()[1].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 1);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void europeClicked(View view) {
        if (!mUserData.getContinents()[2].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 2);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void asiaClicked(View view) {
        if (!mUserData.getContinents()[3].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 3);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void africaClicked(View view) {
        if (!mUserData.getContinents()[4].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 4);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
