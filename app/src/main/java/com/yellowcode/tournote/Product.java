package com.yellowcode.tournote;

public class Product {
    private String ProductName;
    private String Unit;
    private String Unit0;
    private double Price;
    public Product() {
        ProductName = "";
        Unit0 = "";
        Unit = "";
        Price = 0;
    }

    public Product(String pname,String unit0 ,String unit, double price) {
        ProductName = pname;
        Unit0 = unit0;
        Unit = unit;
        Price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getUnit0() {
        return Unit0;
    }

    public void setUnit0(String unit0) {
        Unit0 = unit0;
    }
    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
