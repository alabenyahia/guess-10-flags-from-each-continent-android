package com.pickurapps.guess10flagsfromeachcontinent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class StagesActivity extends AppCompatActivity {
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stages);

        userData = UserData.getInstance(this);
        ImageView northAmericaIv = findViewById(R.id.northamerica_img);
        ImageView europeIv = findViewById(R.id.europe_img);
        ImageView asiaIv = findViewById(R.id.asia_img);
        ImageView africaIv = findViewById(R.id.africa_img);
        if (!userData.getContinents()[1].isLocked()) {
            northAmericaIv.setImageResource(R.drawable.ic_lock_open_w);
        }
        if (!userData.getContinents()[2].isLocked()) {
            europeIv.setImageResource(R.drawable.ic_lock_open_w);
        }
        if (!userData.getContinents()[3].isLocked()) {
            asiaIv.setImageResource(R.drawable.ic_lock_open_w);
        }
        if (!userData.getContinents()[4].isLocked()) {
            africaIv.setImageResource(R.drawable.ic_lock_open_w);
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

    public void southAmericaClicked(View view) {
        if (!userData.getContinents()[0].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 0);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void northAmericaClicked(View view) {
        if (!userData.getContinents()[1].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 1);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void europeClicked(View view) {
        if (!userData.getContinents()[2].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 2);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void asiaClicked(View view) {
        if (!userData.getContinents()[3].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 3);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void africaClicked(View view) {
        if (!userData.getContinents()[4].isLocked()) {
            Intent myIntent = new Intent(StagesActivity.this, GameActivity.class);
            myIntent.putExtra("continent", 4);
            startActivity(myIntent);
        } else {
            Toast.makeText(this, "This stage is locked!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
