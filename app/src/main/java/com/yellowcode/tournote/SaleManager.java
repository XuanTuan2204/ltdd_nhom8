package com.yellowcode.tournote;

import java.util.ArrayList;

public class SaleManager {
    private ArrayList Products;

    public SaleManager() {
        Products = new ArrayList();
    }

    public ArrayList getProducts() {
        return Products;
    }

    public void setProducts(ArrayList products) {
        Products = products;
    }

    public void generateProducts() {
        Products.clear();
        Products.add(new Product("VietNam Airlines","5.00 AM ----> 6.30 AM" ,"Hà Nội -----> Sài Gòn", 1600000));
        Products.add(new Product("Air France","9.00 AM ----> 10.30 AM" , "Đà Nẵng -----> Hà Nội", 800000));
        Products.add(new Product("British Airways","5.00 AM ----> 10.30 AM" , "Hà Nội -----> Anh", 200000000));
        Products.add(new Product("All Nippon Airways","5.00 AM ----> 6.30 AM" , "Sài Gòn -----> Quảng Bình", 6000000));
        Products.add(new Product("Asiana Airlines","5.00 AM ----> 6.30 AM" , "Đà Nẵng -----> Hà Nội", 1000000));
        Products.add(new Product("VietNam Airlines","5.00 PM ----> 6.30PM" ,"Hà Nội -----> Sài Gòn", 1600000));
        Products.add(new Product("Air France","8.00 PM ----> 9.30 PM" , "Đà Nẵng -----> Hà Nội", 800000));
        Products.add(new Product("British Airways","7.30 PM ----> 10.30 PM" , "Hà Nội -----> Anh", 200000000));
        Products.add(new Product("All Nippon Airways","9.00 PM ----> 11.30 PM" , "Sài Gòn -----> Quảng Bình", 6000000));
        Products.add(new Product("VietNam Airlines","5.00 PM ----> 6.30 PM" ,"Hà Nội -----> Sài Gòn", 1600000));
        Products.add(new Product("Air France","5.00 AM ----> 6.30 AM" , "Đà Nẵng -----> Hà Nội", 800000));
        Products.add(new Product("British Airways","5.00 AM ----> 6.30 AM" , "Hà Nội -----> Anh", 200000000));
        Products.add(new Product("All Nippon Airways","5.00 AM ----> 6.30 AM" , "Sài Gòn -----> Quảng Bình", 6000000));
    }

    private static SaleManager saleManager;

    public static SaleManager get() {
        if (saleManager == null)
            saleManager = new SaleManager();
        return saleManager;
    }
}
