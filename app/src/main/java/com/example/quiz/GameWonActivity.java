package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;

public class GameWonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);

        ImageView mImageViewFilling = (ImageView) findViewById(R.id.speak);
        ((AnimationDrawable) mImageViewFilling.getBackground()).start();
        playMusic(R.raw.barakalla);
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 3000ms
                ((AnimationDrawable) mImageViewFilling.getBackground()).stop();
            }
        }, 11000);
    }

    public void playMusic(int resId){
        MediaPlayer mp = MediaPlayer.create(this, resId);
        mp.start();
    }

    //This is onclick listener for button
    //it will navigate from this activity to MainGameActivity
    public void PlayAgain(View view) {
        Intent intent = new Intent(GameWonActivity.this, CategoryActivity.class);
        startActivity(intent);
        finish();
    }
}