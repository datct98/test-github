package view;

import entities.Product;
import service.ProductService;

public class Menu {
    public void displayMenu(){
        System.out.println("======== Menu ==========");
        System.out.println("1. Hiển thị danh sách các sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo id");
        System.out.println("4. Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("5. Tìm các sản phẩn theo mức giá");
        System.out.println("Mời bạn chọn: ");
    }

    public void handleUserSelect(int choose, ProductService service, Product[] products){
        boolean continues = true;
        do {
            switch (choose){
                case 1:
                    System.out.println("========= Dánh sách các sản phẩm là: ==========");
                    service.getListProducts(products);
                    break;
                case 2:
                    System.out.println("Mời b nhập tên sp: ");
                    service.findProductsByName("nokia", products);
                    break;
                case 3:
                    break;
                case 4:
                    // To DO
                    break;
                case 5:
                    // To DO
                    break;
            }
            System.out.println("Do u want to continues? (Y/N)");
            continues= false;
        } while (continues);
    }
}
