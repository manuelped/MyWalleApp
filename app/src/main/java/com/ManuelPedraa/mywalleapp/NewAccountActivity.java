package com.ManuelPedraa.mywalleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class NewAccountActivity extends AppCompatActivity {


    private Button btCancelar;
    private TextView txtBasura;

    private Button btCrear;
    private TextView txtcolor;
    private TextView Newname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        btCancelar = findViewById(R.id.btn_cancelar);
        btCrear = findViewById(R.id.btn_crear);
        txtcolor = findViewById(R.id.tv_Colormod);
        Newname = findViewById(R.id.inputname);

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NewAccountActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        btCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        txtcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}