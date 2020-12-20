package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class constructorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructors);
    }

    public void nextBtn(View view) {
        startActivity(
                new Intent(constructorsActivity.this, ModifiersActivity.class)
        );

    }
    public void backBtn(View view){
        startActivity(
                new Intent(constructorsActivity.this,OopActivity.class)
        );
    }


}