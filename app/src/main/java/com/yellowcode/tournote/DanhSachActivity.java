package com.yellowcode.tournote;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DanhSachActivity extends AppCompatActivity {
    TextView tvhome, tvaccount, tvlogout;
    ListView lv;
    Button btn_chon;
    ProductAdapter adapter;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);
        btn_chon = (Button) findViewById(R.id.btn_chon);
        lv = (ListView) findViewById(R.id.lvProducts);

        //Khởi tạo các sản phẩm
        SaleManager saleManager = SaleManager.get();
        saleManager.generateProducts();
        //lấy các product từ class saleManager
        ArrayList products = saleManager.getProducts();
        adapter = new ProductAdapter(this, products);//khởi tạo adapter
        lv.setAdapter(adapter);//hiển lên listview


        tvlogout = (TextView)findViewById(R.id.logout);
        tvhome = (TextView)findViewById(R.id.home);
        tvaccount = (TextView)findViewById(R.id.account);



        tvlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DanhSachActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        tvhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DanhSachActivity.this,Home.class);
                startActivity(intent);
            }
        });
        tvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DanhSachActivity.this,Profile.class);
                startActivity(intent);
            }
        });

        drawerLayout = findViewById(R.id.activity_main_drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {

        }

        return super.onOptionsItemSelected(item);
    }
}
