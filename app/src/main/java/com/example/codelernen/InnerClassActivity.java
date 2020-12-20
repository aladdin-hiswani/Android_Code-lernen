package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InnerClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);
    }
    public void nextBtn(View view) {
        startActivity(
                new Intent(InnerClassActivity.this, AbstractinActivity.class)
        );

    }
    public void backBtn(View view){
        startActivity(
                new Intent(InnerClassActivity.this,PolymorphismActivity.class)
        );
    }
}