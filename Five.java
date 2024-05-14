package com.example.linkora_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Five extends AppCompatActivity {
    EditText  e4,e7;
    Button b11, b12;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        e7=(EditText)findViewById(R.id.editTextTextPersonName7);
        firebaseAuth=FirebaseAuth.getInstance();
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);

        e4 = (EditText) findViewById(R.id.editText4);
        firebaseDatabase=FirebaseDatabase.getInstance();
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performLogin();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Five.this,Six.class);
                startActivity(i1);
                finish();
            }
        });

    }

    private void performLogin()
    {

        String s2=e4.getText().toString();
        String s3=e7.getText().toString();
        databaseReference=firebaseDatabase.getReference("Users");
        if(s2.length()!=6 )
        {
            Toast.makeText(Five.this, "fill password with having minimum 6 letters", Toast.LENGTH_SHORT).show();
        }
        else
        {

            firebaseAuth.signInWithEmailAndPassword(s3,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(Five.this, "login succesful", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(Five.this,Ten.class);
                        startActivity(i);
                        finish();
                    }

                }
            });

        }
    }
}

