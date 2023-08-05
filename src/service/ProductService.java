package service;

import entities.Product;

public class ProductService {

    public void getListProducts(Product[] products){
        for (int i=0; i< products.length; i++){
            System.out.println(products[i]);
        }
    }

    public void findProductsByName(String name, Product[] products){
        int count =0;
        for (int i=0; i< products.length; i++){
            if(products[i].getName().contains(name)){
                count++;
                System.out.println("Sản phẩm có tên: "+name+" là:"+ products[i]);
            }
        }
        if(count<=0) System.out.println("Không có sp nào tên :"+name);
    }

    public void findProductById(int id, Product[] products){
        for (int i=0; i< products.length; i++){
            if(id == products[i].getId()){
                System.out.println("Sản phẩm có id: "+id+" là:"+ products[i]);
                break;
            }
        }
    }

}
