package ENUM_Shop;

public class Lemon extends Product{

    public Lemon(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "name='" + name + '\'' +
                '}';
    }
}
