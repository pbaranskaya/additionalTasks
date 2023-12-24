package ENUM_ClothesSizes;

public abstract class Clothes {

    protected String name;
    protected ClothesSizes size;
    protected double price;
    protected String color;

    public Clothes(String name, ClothesSizes size, double price, String color){
        super();
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClothesSizes getSize() {
        return size;
    }

    public void setSize(ClothesSizes size) {
        this.size = size;
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


    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
