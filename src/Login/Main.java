package Login;

import Login.entities.User;
import Login.service.InputService;
import Login.service.UserService;
import Login.view.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Map<String, User> users = new HashMap<>(Map.of("Dat", new User("Dat", "123")));
        InputService inputService = new InputService();
        Scanner scanner = new Scanner(System.in);
        menu.displayMenuSignInOut();
        int choose = inputService.inputNumber(scanner);
        UserService userService = new UserService();
        switch (choose){
            case 1:
                userService.login(scanner, users);
                break;
            case 2:
                break;
        }
    }
}
