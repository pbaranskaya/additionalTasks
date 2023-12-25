package ENUM_Shop;

public class Shop {

    private Product[] products;
    private int current;

    private void grow() {
        Product[] newProducts = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public void add(Product product) {
        if (products == null) {
            products = new Product[10];
            current = 0;
        }
        if (current >= products.length) {
            grow();
        }
        products[current++] = product;
    }

    public void printProducts() {
        for (int i = 0; i < current; i++) {
            System.out.println((i + 1) + " - " + products[i]);
        }
    }
}
