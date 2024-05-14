package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Six extends AppCompatActivity {
    ImageButton i11,i12;
    TextView t13,t14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        i11=(ImageButton) findViewById(R.id.imageButton11);
        i12=(ImageButton) findViewById(R.id.imageButton12);
        t13=(TextView)findViewById(R.id.textView13);
        t14=(TextView) findViewById(R.id.textView14);
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Six.this,Five.class);
                startActivity(i);
                finish();
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Six.this,Seven.class);
                startActivity(i1);
                finish();
            }
        });


    }
}