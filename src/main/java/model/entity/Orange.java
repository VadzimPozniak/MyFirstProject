package model.entity;

public class Orange extends Product{
    private double diametre;

    public Orange(){};

    public Orange(double price, double diametre){
        super(price);
        this.diametre = diametre;
    }

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }

    @Override
    public String toString() {
        return "Orange {" +
                "price = " + getPrice() +
                ", diametre = " + diametre +
                '}';
    }
}
