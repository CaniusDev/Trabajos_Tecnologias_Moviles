package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.parcial1.db.DbHelper;

public class agregar_amigo extends AppCompatActivity {

    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_amigo);

        btnCrear = findViewById(R.id.btnCrear);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(agregar_amigo.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if(db != null){
                    Toast.makeText(agregar_amigo.this, "Base de datos creada correctamente", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(agregar_amigo.this, "Error al crear la base de datos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}