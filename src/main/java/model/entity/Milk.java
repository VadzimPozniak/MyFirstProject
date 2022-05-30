package model.entity;

public class Milk extends Product{
    private double fat;

    public Milk(){}

    public Milk(double price, double fat){
        super(price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Milk {" +
                "price = " + getPrice() +
                ", fat = " + fat +
                '}';
    }
}
