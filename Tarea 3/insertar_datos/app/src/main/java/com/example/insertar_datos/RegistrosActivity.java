package com.example.insertar_datos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.insertar_datos.db.DbRegistros;

public class RegistrosActivity extends AppCompatActivity {

    EditText txtNombre, txtApellido, txtTelefono;
    Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtTelefono = findViewById(R.id.txtTelefono);
        btn_guardar = findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbRegistros dbRegistros = new DbRegistros(RegistrosActivity.this);
                long id = dbRegistros.insertarRegistro(txtNombre.getText().toString(), txtApellido.getText().toString(), txtTelefono.getText().toString());

                if(id > 0){
                    Toast.makeText(RegistrosActivity.this, "SE REGISTRO CORRECTAMENTE", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(RegistrosActivity.this, "ERROR AL GUARDAR EL REGISTRO", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
    }
}