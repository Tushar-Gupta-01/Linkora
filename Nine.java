package com.example.linkora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nine extends AppCompatActivity {
    EditText e3,e6;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    TextView t16;
    Button b9,b10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        e3=(EditText) findViewById(R.id.editTextTextPersonName);
        e6=(EditText) findViewById(R.id.editTextTextPersonName6);

        t16=(TextView)findViewById(R.id.textView16);
        firebaseDatabase=FirebaseDatabase.getInstance();
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e3.getText().toString();
               String s2=e6.getText().toString();

               databaseReference=firebaseDatabase.getReference("Users");
               if(s1.length()!=8)
               {
                   Toast.makeText(Nine.this, "fill correct id", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Users users=new Users(s1,s2);
                   databaseReference.child(s1).setValue(users);
                   Toast.makeText(Nine.this, "updated", Toast.LENGTH_SHORT).show();
                   Intent i=new Intent(Nine.this,Six.class);
                   startActivity(i);
                   finish();
               }

            }
        });


    }
}