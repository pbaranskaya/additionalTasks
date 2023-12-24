package ENUM_ClothesSizes;

public class Pants extends Clothes implements WomensClothing, MensClothing{
    @Override
    public void dressMan() {

    }
    @Override
    public void dressWoman() {
    }

    public Pants(String name, ClothesSizes size, double price, String color){
        super(name, size,price,color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
