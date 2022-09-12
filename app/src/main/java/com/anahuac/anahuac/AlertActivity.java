package com.anahuac.anahuac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {
    private Button btnAlerta;
    private Button btnAlertWithButtom;
    private Button btnAlertWithOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        btnAlertWithOption=findViewById(R.id.btn_alerta_with_options);
        btnAlerta=findViewById(R.id.btn_alerta);
        btnAlertWithButtom = findViewById(R.id.btn_alerta_with_buttom);
        btnAlerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi primera alerta");
                builder.setMessage("Este es mi mensaje");
                builder.create().show();
            }

        });
        btnAlertWithButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Mi primera alerta");
                builder.setMessage("Este es mi mensaje");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface , int i){
                        Toast.makeText(AlertActivity.this, "Positivo" , Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("Cancelar",null);
                builder.create().show();
            }
        });
        btnAlertWithOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Seleccionar un color");
                String[] array = new String[3];
                array[0] = "Verde";
                array[1] = "Blanco";
                array[2] = "Rojo";
                builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, array[i], Toast.LENGTH_LONG).show();
                    }
                });
                builder.create().show();
            }
        });
    }
}