package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScreenActivity extends AppCompatActivity {
    ImageView playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        //the below method will initialize views
        initViews();

        //PlayGame button - it will take you to the CategoryActivity
        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScreenActivity.this, CategoryActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
//                finish();
            }
        });
    }

    private void initViews() {
        //initialize views here
        playGame =(ImageView)findViewById(R.id.playGame);

    }
}