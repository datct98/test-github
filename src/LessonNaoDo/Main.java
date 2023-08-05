package LessonNaoDo;

import LessonNaoDo.entities.Product;
import LessonNaoDo.service.ProductService;
import LessonNaoDo.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //DS các sản phẩm
        Product[] products = new Product[4];
        products[0] = new Product("DT samsung", 10, 10000);
        products[1] = new Product("DT nokia", 10, 11000);
        products[2] = new Product("DT ịphone", 10, 12000);
        products[3] = new Product("DT sony", 10, 13000);

        Menu menu = new Menu();
        menu.displayMenu();
        int choose = Integer.parseInt(scanner.nextLine());

        ProductService service = new ProductService();
        menu.handleUserSelect(choose, service, products);

    }
}
