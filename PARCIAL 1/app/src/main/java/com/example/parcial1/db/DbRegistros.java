package com.example.parcial1.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbRegistros extends DbHelper{

    Context context;

    public DbRegistros(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarRegistro(String nombre, String edad, String ubicacion){
        long id = 0;
        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("edad", edad);
            values.put("ubicacion", ubicacion);

            id = db.insert(TABLE_REGISTROS, null, values);
        } catch(Exception ex){
            ex.toString();
        }
        return id;
    }
}
