package com.example.appdogv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.appdogv3.utilidades.Utilidades;

public class RegisterDataPetsActivity extends AppCompatActivity {

    EditText editText3, editText4, editText5;
    Button button_sv;
    Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_data_pets);

        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        editText5 = (EditText)findViewById(R.id.editText5);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        button_sv = (Button)findViewById(R.id.button_sv) ;

    }

    public void onClick(View view){
        registrarUsuarios();
    }

    private void registrarUsuarios() {
        //coneccion con BD
        ConectionSQLiteHelper conn = new ConectionSQLiteHelper(this, "bd_dietas_appdog", null, 1);

        //abre la BD
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.NOM_MASC,editText3.getText().toString());
        values.put(Utilidades.EDAD_MASC,editText4.getText().toString());
        values.put(Utilidades.PESO_MASC,editText5.getText().toString());

        Long idresult = db.insert(Utilidades.TABLA_MASCOTA,Utilidades.ID_MASC,values);
        Toast.makeText(getApplicationContext(),"Los datos de tu mascota ha sido registrada con exito! " + idresult, Toast.LENGTH_SHORT).show();

    }
}
