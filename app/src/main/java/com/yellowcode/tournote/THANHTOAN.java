package com.yellowcode.tournote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class THANHTOAN extends AppCompatActivity {

    private Button btnthanhtoan,btn_back3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan);
        btnthanhtoan = (Button) findViewById(R.id.btn_thanhtoan);
        btn_back3 = (Button) findViewById(R.id.btn_cancel3);
        btnthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(THANHTOAN.this, Excute.class);
                startActivity(intent);
            }
        });
        btn_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(THANHTOAN.this, TTKH.class);
                startActivity(intent);
            }
        });
    }
}