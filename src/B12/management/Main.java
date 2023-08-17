package B12.management;

import B12.management.entities.Book;
import B12.management.service.impl.BookServiceImpl;
import B12.management.utils.Utils;
import B12.management.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
        Utils utils = new Utils();
        ArrayList<Book>books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu.handleMenu(scanner, utils, books);

    }
}
