package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ten extends AppCompatActivity {
    ImageButton i1,i2,i3,i4,i5;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        i1=(ImageButton) findViewById(R.id.imageButton3);
        i2=(ImageButton) findViewById(R.id.imageButton4);
        i3=(ImageButton) findViewById(R.id.imageButton14);
        i4=(ImageButton) findViewById(R.id.imageButton13);
        i5=(ImageButton) findViewById(R.id.imageButton15);
        b1=(Button) findViewById(R.id.button13);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Ten.this,Eleven.class);
                startActivity(i);
                finish();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Ten.this,Twelve.class);
                startActivity(i2);
                finish();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Ten.this,Thirteen.class);
                startActivity(i3);
                finish();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Ten.this,Fourteen.class);
                startActivity(i4);
                finish();
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Ten.this,Fifteen.class);
                startActivity(i5);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Ten.this,Six.class);
                startActivity(i6);
                finish();
            }
        });

    }
}