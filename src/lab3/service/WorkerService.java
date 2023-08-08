package lab3.service;

import lab3.entities.Worker;

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

    public void changeSalary(double salaryMore, Worker worker){
        worker.setSalary(worker.getSalary()+salaryMore);
    }
}
