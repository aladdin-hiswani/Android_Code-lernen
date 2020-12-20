package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AbstractinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstractin);
    }
    public void nextBtn(View view) {
        startActivity(
                new Intent(AbstractinActivity.this, InterfaceActivity.class)
        );

    }
    public void backBtn(View view){
        startActivity(
                new Intent(AbstractinActivity.this,InnerClassActivity.class)
        );
    }
}