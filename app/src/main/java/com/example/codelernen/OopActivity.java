package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OopActivity extends AppCompatActivity {
Button back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opp);
    }
    public void backBtn(View view){
        startActivity(
                new Intent(OopActivity.this,JavaLernen.class)
        );
    }
    public void nextBtn(View view) {
        startActivity(
                new Intent(OopActivity.this, constructorsActivity.class)
        );

    }
}