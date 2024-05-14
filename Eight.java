package com.example.linkora_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.Credential;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class Eight extends AppCompatActivity
{
   /* FirebaseAuth firebaseAuth;
    EditText e1,e2;
    Button b7,b8;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("Users");
        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editTextTextPersonName8);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                firebaseAuth.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {


                        if(task.isSuccessful())
                        {
                            Toast.makeText(Eight.this, "logged in", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(Eight.this,Ten.class);
                            startActivity(i);
                            finish();
                        }
                        else
                        {
                            Toast.makeText(Eight.this, "fill correct details", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

   }*/

}