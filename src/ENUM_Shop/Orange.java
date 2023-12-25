package ENUM_Shop;

public class Orange extends Product{

    public Orange(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                '}';
    }
}
