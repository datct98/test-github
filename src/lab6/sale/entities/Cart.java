package lab6.sale.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private static int autoId;
    private List<Product> product;

    public Cart(List<Product> product) {
        this.id = ++autoId;
        this.product = product;
    }

    public Cart() {
        this.id = ++autoId;
        product= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public static void setAutoId(int autoId) {
        Cart.autoId = autoId;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
