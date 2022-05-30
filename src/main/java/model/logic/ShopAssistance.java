package model.logic;

import model.entity.*;

public class ShopAssistance {
    public static double CalculateTotalPrice(Basket basket){
        double price = 0;

        for (Product product :basket.getProducts()) {
            price += product.getPrice();
        }

        return price;
    }
}
