package B12.management.service.impl;

import B12.management.entities.Book;
import B12.management.service.ServiceLibrary;
import B12.management.utils.Utils;
import B12.management.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceImpl implements ServiceLibrary<Book> {

    @Override
    public void insert(Scanner scanner, ArrayList<Book> list) {
        System.out.println("Mời b nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập giá sách: ");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(name, price);
        list.add(book);
    }

    @Override
    public void edit(int id, ArrayList<Book> list) {
        Scanner scanner = new Scanner(System.in);
        for (Book b: list){
            if(b.getId()==id){
                System.out.println("Mời b nhập tên muốn update: ");
                String name = scanner.nextLine();
                System.out.println("Mời b nhập giá sách: ");
                double price = Double.parseDouble(scanner.nextLine());
                b.setName(name);
                b.setPrice(price);
                return;
            }
        }
    }

    @Override
    public void delete(int id, ArrayList<Book> list) {
        for (Book b: list){
            if(b.getId()==id){
                list.remove(b);
                return;
            }
        }
    }

    public void handleMenuBook(Menu menu, Utils utils, Scanner scanner, ArrayList<Book> books){
        menu.displayMenuBook();
        int selectMenuBook = utils.inputNumber(scanner);

        switch (selectMenuBook){
            case 1:
                insert(scanner, books);
                break;
            case 2:
                System.out.println("Mời b nhập id của sách: ");
                int idBook = utils.inputNumber(scanner);
                edit(idBook, books);
                break;
            case 3:
                System.out.println("Mời b nhập id của sách: ");
                int idBookDeleted = utils.inputNumber(scanner);
                delete(idBookDeleted, books);
        }
    }


}
