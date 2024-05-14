package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    ImageView imageView2;
    TextView textView3;
    Button b3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        textView3=(TextView) findViewById(R.id.textView3);
        b3=findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this,Third.class);
                startActivity(i);
                finish();
            }
        });


    }
}