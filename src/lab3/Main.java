package lab3;

import lab3.entities.History;
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
        ArrayList<History> histories = new ArrayList<>();
        Menu menu = new Menu();
        menu.handleUserSelect(scanner, service, workers, histories);
    }
}
