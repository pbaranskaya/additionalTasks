package ENUM_ClothesSizes;

public abstract class Clothes {

    protected int sise;
    protected double price;
    protected String color;

    public int getSise() {
        return sise;
    }

    public void setSise(int sise) {
        this.sise = sise;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
