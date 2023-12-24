package ENUM_ClothesSizes;

public class Skirt extends Clothes implements WomensClothing{

    @Override
    public void dressWoman() {
    }

    public Skirt(String name, ClothesSizes size, double price, String color){
        super(name,size,price,color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
