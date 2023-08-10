package lab3.view;

import lab3.entities.History;
import lab3.entities.Worker;
import lab3.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("1- Add worker");
        System.out.println("2- Up salary");
        System.out.println("3- Down salary");
        System.out.println("4- Display salary");
    }

    public int selectMenu(Scanner scanner){
        do {
            System.out.println("Please choose: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("try again!");
            }
        } while (true);
    }

    public void handleUserSelect(Scanner scanner, WorkerService service, ArrayList<Worker> workers, ArrayList<History>histories){
        do {
            displayMenu();
            int choose = selectMenu(scanner);
            switch (choose) {
                case 1 -> {
                    Worker worker = service.createWorker(scanner);
                    workers.add(worker);
                }
                case 2 -> {
                    System.out.println("M muốn tăng lương cho ai? Nhập ID của đứa m muốn tăng: ");
                    String id = scanner.nextLine();
                    System.out.println("Mời bạn nhập số tiền: ");
                    double salaryIncrease = Double.parseDouble(scanner.nextLine());
                    service.changeSalary(salaryIncrease, workers, histories, id, "Up");
                }
                case 3 -> {
                    System.out.println("M muốn giảm lương ai? Nhập ID của đứa m muốn giảm: ");
                    String idDecr = scanner.nextLine();
                    System.out.println("Mời bạn nhập số tiền: ");
                    double salaryDecr = Double.parseDouble(scanner.nextLine());
                    service.changeSalary(-salaryDecr, workers, histories, idDecr, "Down");
                }
                case 4 -> System.out.println(histories);
            }
            System.out.println("DO u want to continues? ");
            String ans=scanner.nextLine();
        } while (true);
    }
}
