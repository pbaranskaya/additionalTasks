package ENUM_ClothesSizes;

public class TShirt extends Clothes implements WomensClothing, MensClothing{
    @Override
    public void dressMan() {
    }
    @Override
    public void dressWoman() {
    }

    public TShirt(String name, ClothesSizes size, double price, String color){
        super(name, size,price,color);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
