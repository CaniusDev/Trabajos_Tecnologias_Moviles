package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUser, txtPass;
    Button bntEntrar;

    private String user = "Canius1104";
    private String password = "1104";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);
        bntEntrar = findViewById(R.id.bntEntrar);

        bntEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(user == txtUser.getText().toString() && password == txtPass.getText().toString()){
                    Intent intent = new Intent(MainActivity.this, agregar_amigo.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}