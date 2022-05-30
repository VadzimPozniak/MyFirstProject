package controller;

import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(2, 5);
        Bread bread  =new Bread(2, "white");
        Orange orange1 = new Orange(3, 4.5);
        Orange orange2 = new Orange(4, 5);
        Orange orange3 = new Orange(5, 6.5);

        Basket basket = new Basket();

        basket.add(milk);
        basket.add(bread);
        basket.add(orange1,orange2,orange3);

        System.out.println(basket);

    }
}
