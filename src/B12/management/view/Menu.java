package B12.management.view;

import B12.management.entities.Book;
import B12.management.service.impl.BookServiceImpl;
import B12.management.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("1- Quản lý sách");
        System.out.println("2- Quản lý người đọc");
        System.out.println("3- Quản lý mượn trả sách");
        System.out.println("Mời bạn chọn: ");
    }

    public void displayMenuBook(){
        System.out.println("1- Thêm sách");
        System.out.println("2- Sửa thông tin sách");
        System.out.println("3- Xóa sách");
        System.out.println("Mời bạn chọn: ");
    }

    public void displayMenuCustomer(){
        System.out.println("1- Thêm khách hàng");
        System.out.println("2- Sửa thông tin khách hàng");
        System.out.println("3- Xóa khách hàng");
        System.out.println("Mời bạn chọn: ");
    }

    public void displayMenuTicketBook(){
        System.out.println("1- Thêm TicketBook");
        System.out.println("2- Sửa thông tin TicketBook");
        System.out.println("3- Xóa TicketBook");
        System.out.println("Mời bạn chọn: ");
    }

    public void handleMenu(Scanner scanner, Utils utils, ArrayList<Book> books){
        do {
            int choose = utils.inputNumber(scanner);
            switch (choose){
                case 1:
                    BookServiceImpl bookService = new BookServiceImpl();
                    bookService.handleMenuBook(this, utils, scanner, books);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
