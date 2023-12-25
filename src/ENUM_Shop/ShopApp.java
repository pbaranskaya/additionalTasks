package ENUM_Shop;

import java.util.Scanner;

import static ENUM_Shop.Actions.*;
import static ENUM_Shop.Product.createProduct;

public class ShopApp {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Shop shop = new Shop();

        System.out.println("Добро пожаловать в магазин!");

        while (true) {
            printMainMenu(sc);
            Actions actions = Actions.valueOf(sc.next());
            switch (actions) {
                case AUTHENTICATION:
                    getLogin(sc);
                    getPassword(sc);
                    break;
                case CHOOSE_PRODUCT:
                    while (true) {
                        Product p = createProduct(sc);
                        if (p != null) {
                            shop.add(p);
                        } else {
                            break;
                        }
                    }
                    break;
                case BASKET:
                    System.out.println("Корзина:");
                    shop.printProducts();
                    break;
                case BUY:
                    System.out.println("Продукты куплены");
                    break;
                default:
                    System.out.println("Неизвестное действие");
            }
        }
    }
}
