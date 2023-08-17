package B13.lab4;

import B13.lab4.entities.Manager;
import B13.lab4.entities.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Duy", 14000, 1000);
        Manager manager2 = new Manager("Tu", 11000, 1100);
        Manager manager3 = new Manager("Long", 13000, 1100);
        ArrayList<Manager> managers = new ArrayList<>(Arrays.asList(manager, manager2, manager3));
        // Cách 1
        managers.sort(new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return (int) (o2.caculateSalary() - o1.caculateSalary());
            }
        });
        System.out.println(managers);
        //Cách 2
        Collections.sort(managers, new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return 0;
            }
        });

    }
}
