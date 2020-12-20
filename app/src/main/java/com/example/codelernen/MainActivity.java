package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton java, paython;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        java = findViewById(R.id.imageJava);
        paython = findViewById(R.id.imagePaython);
    }

    public void aJava(View view){
        startActivity(new Intent(MainActivity.this,JavaLernen.class));
    }
}