package com.example.linkora_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

public class Seven extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    EditText e1,e2;
    Button b5,b6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editTextTextPersonName2);

        firebaseAuth=FirebaseAuth.getInstance();
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if(s1.isEmpty())
                {
                    e1.setError("fill email");
                }
               else
                {
                    if(s2.isEmpty()||s2.length()!=6)
                    {
                        e2.setError("fill correct password");
                        return;
                    }
                    else
                    {
                        firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task)
                            {

                                if(task.isSuccessful())
                                {
                                    Toast.makeText(Seven.this, "Updated", Toast.LENGTH_SHORT).show();
                                    Intent i=new Intent(Seven.this,Nine.class);
                                    startActivity(i);
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(Seven.this, "not updated", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Seven.this,Six.class);
                startActivity(i);
                finish();

            }
        });
    }
}