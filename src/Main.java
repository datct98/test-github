
import entities.Bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mời b nhập quãng đường: ");
        double space = Double.parseDouble(scanner.nextLine());

        Bus bus = new Bus();
        bus.prinInfo(space);


    }


}
