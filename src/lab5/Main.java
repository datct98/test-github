package lab5;

import lab5.entities.Pet;
import lab5.entities.Type;
import lab5.service.PetService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Dog1", "spe1", 1, true);
        Pet pet2 = new Pet("Dog2", "spe2", 1, false);
        Pet pet6 = new Pet("Dog3", "spe3", 1, false);

        Pet pet3 = new Pet("Cat1", "spe1", 2, true);
        Pet pet5 = new Pet("Cat5", "spe5", 2, true);
        Pet pet4 = new Pet("Cat4", "spe2", 2, false);

        ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(pet1,pet2, pet3, pet4, pet5, pet6));

        PetService petService = new PetService();
        Scanner scanner = new Scanner(System.in);
        petService.match(pets, scanner);
    }
}
