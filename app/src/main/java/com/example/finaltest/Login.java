package com.example.finaltest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);




        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct

                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                    //ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle()
                    Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(Login.this,"Wrong Usernamer or Password!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
