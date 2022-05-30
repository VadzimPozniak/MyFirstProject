package model.entity;

public class Bread extends Product {
    String color;

    public Bread(){};

    public Bread(double price, String color){
        super(price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bread {" +
                "price = " + getPrice() +
                ", color ='" + color + '\'' +
                '}';
    }
}
