package model.entity;

public class Product {
    private double price;

    public Product(){}

    public Product(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
