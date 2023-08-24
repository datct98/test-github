package Login.service;

import java.util.Scanner;

public class InputService {
    public int inputNumber(Scanner scanner){
        while (true){
            try{
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            }catch (Exception e){
                System.out.println("Nhập không hợp lệ, mời b nhập lại");
            }
        }

    }
}
