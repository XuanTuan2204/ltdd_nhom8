package com.yellowcode.tournote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main_TrangChu extends AppCompatActivity {

    private Button btnlogin;
    private  Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        btnlogin = (Button) findViewById(R.id.btLogin);
        btnsignup = (Button) findViewById(R.id.btSignUp);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_TrangChu.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_TrangChu.this, SignActivity.class);
                startActivity(intent);
            }
        });
    }
}
