package com.yellowcode.tournote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Excute extends AppCompatActivity {

    private Button btnhoantat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoantat);
        btnhoantat = (Button) findViewById(R.id.btn_hoantat);
        btnhoantat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Excute.this, Home.class);
                startActivity(intent);
            }
        });


    }
}