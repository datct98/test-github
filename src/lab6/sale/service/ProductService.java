package lab6.sale.service;

import lab6.sale.entities.Customer;
import lab6.sale.entities.FPTShop;
import lab6.sale.entities.Product;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    public Map<Integer,Product> getAllProducts(FPTShop shop){
        return shop.getProducts();
    }

    public void addToCart(int prodId, Map<Integer, Product> products, Scanner scanner, Customer customer){
        Product product = products.get(prodId);
        int quantity = inputQuantity(scanner, product.getQuantity());
        Product productCustomer = new Product(product, quantity);
        customer.getCart().getProduct().add(productCustomer);

    }

    private int inputQuantity(Scanner scanner, int productQuantity){
        do {
            try {
                System.out.println("Mời b nhập số lượng");
                int quantity = Integer.parseInt(scanner.nextLine());
                if(quantity<=0) System.out.println("NHập số lượng k hợp lệ, vui lòng nhập lại");
                else {
                    if(quantity>productQuantity)
                        System.out.println("Số lượng vượt quá số lượng trongh kho, vui lòng nhập lại");
                }
                return quantity;
            } catch (Exception e){
                System.out.println("NHập số lượng k hợp lệ, vui lòng nhập lại");
            }
        } while (true);

    }
}
