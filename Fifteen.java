package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fifteen extends AppCompatActivity {
    ImageButton i1,i2,i3,i4,i5,i6;
    Button b1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        i1=(ImageButton) findViewById(R.id.imageButton30);
        i2=(ImageButton) findViewById(R.id.imageButton31);
        i3=(ImageButton) findViewById(R.id.imageButton32);
        i4=(ImageButton) findViewById(R.id.imageButton33);
        i5=(ImageButton) findViewById(R.id.imageButton34);
        i6=(ImageButton) findViewById(R.id.imageButton35);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fifteen.this,Sixteen.class);
                startActivity(i);
                finish();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Fifteen.this,Sixteen.class);
                startActivity(i1);
                finish();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Fifteen.this,Sixteen.class);
                startActivity(j);
                finish();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Fifteen.this,Sixteen.class);
                startActivity(k);
                finish();
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Fifteen.this,Sixteen.class);
                startActivity(l);
                finish();
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Fifteen.this,Sixteen.class);
                startActivity(m);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Fifteen.this,Ten.class);
                startActivity(n);
                finish();
            }
        });
    }
}