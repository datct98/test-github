package lab3;

import lab3.entities.Worker;
import lab3.service.WorkerService;
import lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService service = new WorkerService();
        ArrayList<Worker> workers= new ArrayList<>();
        Menu menu = new Menu();
        menu.displayMenu();
        int choose = menu.selectMenu(scanner);
        switch (choose){
            case 1:
                Worker worker = service.createWorker(scanner);
                workers.add(worker);
                break;
            case 2:
            case 3:
            case 4:
        }


    }
}
