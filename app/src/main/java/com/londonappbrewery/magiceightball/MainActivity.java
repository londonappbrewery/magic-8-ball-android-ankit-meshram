package com.londonappbrewery.magiceightball;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton = findViewById(R.id.ask_button);

        final ImageView ball = findViewById(R.id.ball_image);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("onClick:", " my future");

                Random randomNumberGenerator = new Random();
                int ballSelected = randomNumberGenerator.nextInt(5);

                ball.setImageResource(ballArray[ballSelected]);
            }
        });

    }
}
