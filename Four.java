package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Four extends AppCompatActivity {
    ImageButton i5,i6,i7,i8,i9,i10;
    TextView t7,t8,t9,t10,t11,t12;
    Button b4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        i5=(ImageButton) findViewById(R.id.imageButton16);
        i6=(ImageButton) findViewById(R.id.imageButton17);
        i7=(ImageButton) findViewById(R.id.imageButton18);
        i8=(ImageButton) findViewById(R.id.imageButton19);
        i9=(ImageButton) findViewById(R.id.imageButton20);
        i10=(ImageButton) findViewById(R.id.imageButton21);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView9);
        t10=(TextView)findViewById(R.id.textView10);
        t11=(TextView)findViewById(R.id.textView11);
        t12=(TextView)findViewById(R.id.textView12);
        b4=(Button)findViewById(R.id.button14);

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Four.this,Six.class);
                startActivity(i);
                finish();
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Four.this,Six.class);
                startActivity(i2);
                finish();
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Four.this,Six.class);
                startActivity(i3);
                finish();
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Four.this,Six.class);
                startActivity(i4);
                finish();
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Four.this,Six.class);
                startActivity(i5);
                finish();
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Four.this,Six.class);
                startActivity(i6);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Four.this,Third.class);
                startActivity(i7);
                finish();

            }
        });

    }
}