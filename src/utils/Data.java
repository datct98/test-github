package utils;

import entities.Product;

public class Data {
    public Product[] listProduct(){
        Product[] products = new Product[4];
        products[0] = new Product("DT samsung", 10, 10000);
        products[1] = new Product("DT nokia", 10, 11000);
        products[2] = new Product("DT ịphone", 10, 12000);
        products[3] = new Product("DT sony", 10, 13000);
        return products;
    }
}
