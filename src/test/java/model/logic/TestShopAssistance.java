package model.logic;
import model.entity.Basket;
import model.entity.Bread;
import model.entity.Milk;
import model.entity.Orange;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestShopAssistance {

    @Ignore
    public void TestCalculateTotalPriceForEmptyBasket(){
        double expectedresult = 0;
        Basket basket = new Basket();
        assertEquals(expectedresult, ShopAssistance.CalculateTotalPrice(basket), 0);
    }

    @Test
    public void TestCalculateTotalPrice(){
        double expected = 16;
        Basket basket = new Basket();

        Milk milk = new Milk(2, 5);
        Bread bread  =new Bread(2, "white");
        Orange orange1 = new Orange(3, 4.5);
        Orange orange2 = new Orange(4, 5);
        Orange orange3 = new Orange(5, 6.5);

        basket.add(milk);
        basket.add(bread);
        basket.add(orange1,orange2,orange3);

        assertEquals(expected, ShopAssistance.CalculateTotalPrice(basket), 0);
    }
}
