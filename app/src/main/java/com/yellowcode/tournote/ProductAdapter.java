package com.yellowcode.tournote;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter {
    Activity activity;//activity chứa listview
    Button btnchon;
    public ProductAdapter(Activity activity, ArrayList products) {
        super(activity, 0, products);
        this.activity = activity;
    }
    @Override
    //hàm hiện thị từng item lên listview
    public View getView(int position, View convertView, ViewGroup viewGroup)
    {

        //position là vị tri của mỗi item. nó sẽ chạy hết mảng
        //lấy layout cho từng item
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(R.layout.listitem_product, null);
        Button btnchon = (Button) convertView.findViewById(R.id.btn_chon);
        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, TTLH.class);
                activity.startActivity(intent);
            }
        });

        //lấy các textview trong mỗi view
        TextView tvProductName = (TextView)convertView.findViewById(R.id.tvProductName);
        TextView tvUnit = (TextView)convertView.findViewById(R.id.tvUnit);
        TextView tvUnit0 = (TextView)convertView.findViewById(R.id.tvUnit0);
        TextView tvPrice = (TextView)convertView.findViewById(R.id.tvPrice);
        //hiển thị dư liệu lên từng item của listview ở vị trí position
        Product p = (Product) getItem(position);
        tvProductName.setText(p.getProductName());
        tvUnit.setText(p.getUnit());
        tvUnit0.setText(p.getUnit0());
        String s = (new DecimalFormat("#,###.## VNĐ")).format(p.getPrice());
        tvPrice.setText(s);
        return convertView;//trả về 1 view khi đã thiết đặt xong
    }
}
