package ENUM_ClothesSizes;

public class Tie extends Clothes implements MensClothing{
    @Override
    public void dressMan() {
    }

    public Tie(String name, ClothesSizes size, double price, String color){
        super(name, size,price,color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
