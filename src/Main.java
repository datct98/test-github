
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mời b nhập cạnh hv: ");
        double side = Double.parseDouble(scanner.nextLine());
        System.out.println("mời b nhập cd hcn: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("mời b nhập cr hcn; : ");
        double width = Double.parseDouble(scanner.nextLine());
        Retangle retangle = new Retangle(length, width);

        Square square = new Square(side);
        square.printInfo();
    }


}
