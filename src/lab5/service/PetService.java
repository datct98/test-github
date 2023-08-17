package lab5.service;

import lab5.entities.Pet;
import lab5.entities.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PetService {


    public void match(ArrayList<Pet> pets, Scanner scanner){
        System.out.println("Mời b nhập thông tin pet: ");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập giống loài: ");
        String species = scanner.nextLine();
        System.out.println("Pet của b là chó hay mèo(1-Chó/2-Mèo): ");
        int type = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính là j?");
        boolean sex = scanner.nextBoolean();

        Pet pet = new Pet(name, species, type, sex);
        do {
            Random random = new Random();
            int index = random.nextInt(pets.size());
            Pet petDisplay = pets.get(index);
            if(petDisplay.isSex()!= pet.isSex() && petDisplay.getType()== pet.getType()) {
                System.out.println(petDisplay);
                break;
            }
        } while (true);
    }
}
