package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Twelve extends AppCompatActivity {
    ImageView i1,i2;
    TextView t1,t2,t3,t4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        i1=(ImageView) findViewById(R.id.imageView3);
        i2=(ImageView) findViewById(R.id.imageView4);
        t1=(TextView) findViewById(R.id.textView32);
        t2=(TextView) findViewById(R.id.textView33);
        t3=(TextView) findViewById(R.id.textView34);
        t4=(TextView) findViewById(R.id.textView35);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}