package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sixteen extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);
        b1=(Button) findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button17);
        e1=(EditText) findViewById(R.id.editTextTextPersonName9);
        e2=(EditText)findViewById(R.id.editTextTextPersonName5);
        firebaseDatabase=FirebaseDatabase.getInstance();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Sixteen.this,Ten.class);
                startActivity(i1);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e1.getText().toString();
                databaseReference=firebaseDatabase.getReference("Users");
                if(s1.length()!=8)
                {
                    Toast.makeText(Sixteen.this, "fill correct id", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Suggestions suggestions=new Suggestions(s1,s2);
                    databaseReference.child(s1).setValue(suggestions);
                    Toast.makeText(Sixteen.this, "updated", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Sixteen.this,Ten.class);
                    startActivity(i);
                    finish();
                }

            }
        });
    }
}