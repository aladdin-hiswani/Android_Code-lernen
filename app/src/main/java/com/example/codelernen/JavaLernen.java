package com.example.codelernen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JavaLernen extends AppCompatActivity {
   // Button oop,constructors,modifiers,encapsulation,inheritance,polymorphism,innerClass,abstraction,interfacee,arrayList,linkedList,hashMap,wrapperClasses,exeptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_lernen);
       /* oop.findViewById(R.id.opp2);
        constructors.findViewById(R.id.constructors2);
        inheritance.findViewById(R.id.inheritance2);
        polymorphism.findViewById(R.id.polymorphism2);
        innerClass.findViewById(R.id.innerClass2);
        abstraction.findViewById(R.id.abstraction2);
        interfacee.findViewById(R.id.interfacee2);
        arrayList.findViewById(R.id.arrayList2);
        wrapperClasses.findViewById(R.id.wrapper2);
        exeptions.findViewById(R.id.exeptions2);*/
    }
    public void oopActivity(View view){
        startActivity(new Intent(JavaLernen.this, OopActivity.class));
    }
    public void constructorsActivity(View view){
        startActivity(new Intent(JavaLernen.this, constructorsActivity.class));
    }
    public void modifiersActivity(View view){
        startActivity(new Intent(JavaLernen.this,ModifiersActivity.class));
    }
    public void encapsulationActivity(View view){
        startActivity(new Intent(JavaLernen.this, EncapsulationActivity.class));
    }
    public void inheritanceActivity(View view){
        startActivity(new Intent(JavaLernen.this, InheritanceActivity.class));
    }
    public void polymorphismActivity(View view){
        startActivity(new Intent(JavaLernen.this, PolymorphismActivity.class));
    }
    public void innerClassActivity(View view){
        startActivity(new Intent(JavaLernen.this, InnerClassActivity.class));
    }
    public void abstractionActivity(View view){
        startActivity(new Intent(JavaLernen.this, AbstractinActivity.class));
    }
    public void interfaceeActivity(View view){
        startActivity(new Intent(JavaLernen.this, InterfaceActivity.class));
    }

}