package ENUM_Shop;

import java.util.Scanner;

public abstract class Product {

    protected String name;
    private static final Scanner sc = new Scanner(System.in);

    public Product(String name){
        super();
        this.name = name;
    }
    public static Product createProduct(Scanner sc) {

        System.out.println("Введите продукт для покупки");
        System.out.println("Лимон, апельсин, stop - закончить сбор корзины: ");
        Product product = null;

        switch (sc.next().toLowerCase()) {
            case "лимон":
                product = new Lemon("Лимон");
                System.out.println(product);
                break;
            case "апельсин":
                product = new Orange("Апельсин");
                System.out.println(product);
                break;
            case "stop":
                System.out.println("Корзину собрали");
                break;
            default:
                System.out.println("Not valid choice");
        }
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
