package lab3.service;

import lab3.entities.History;
import lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker createWorker(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        double salary = 0;
        do {
            System.out.println("Mời b nhập lương: ");
            try {
                salary = Double.parseDouble(scanner.nextLine());
                return new Worker(name, salary);
            } catch (Exception e){
                System.out.println("Mời b nhập lại");
            }
        }while (true);
    }

    public void changeSalary(double salaryMore, ArrayList<Worker> workers, ArrayList<History> histories, String id, String status){
        for (Worker w: workers){
            if(w.getId().equalsIgnoreCase(id)){
                History history = new History(w, status, salaryMore+w.getSalary());
                w.setSalary(w.getSalary()+salaryMore);
                histories.add(history);
                break;
            }
        }
    }
}
