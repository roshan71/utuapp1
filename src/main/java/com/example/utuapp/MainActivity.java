package com.example.utuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Enrollment =(TextView) findViewById(R.id.enroll);
        TextView Password =(TextView) findViewById(R.id.password);

        Button loginbtn =(Button) findViewById(R.id.login);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Enrollment.getText().toString().equals("202003103510230")&& Password.getText().toString().equals("12345678")){
                    Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid Login",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}