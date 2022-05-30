package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private ArrayList<Product> products;


    public Basket(){
        products = new ArrayList<>();
        }

    public Basket(ArrayList<Product> products){
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product...products){
        for (Product product: products) {
            this.products.add(product);
        }
    }

    public String toString(){
        String s = "List of products: " + "\n";

        for (Product product:getProducts() ) {
            s += product + "\n";
        }

        return s;
    }

}
