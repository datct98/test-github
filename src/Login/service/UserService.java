package Login.service;

import Login.entities.User;

import java.util.Map;
import java.util.Scanner;

public class UserService {
    public void login(Scanner scanner, Map<String, User> users){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String pass = scanner.nextLine();
        // Check username đã tồn tại chưa
        if(users.containsKey(username)){
            if(users.get(username).getPassword().equals(pass)){
                // Login thành công
            } else {
                // Login thất bạt
            }
        }
    }
}
