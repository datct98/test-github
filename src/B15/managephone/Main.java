package B15.managephone;

import B15.managephone.data.Database;
import B15.managephone.entities.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        //System.out.println(database.phoneList());

        ArrayList<Phone> phones = new ArrayList<>(Arrays.asList(
                new Phone("n1","b1", 12), new Phone("n2","b2", 123)));
        /*for (Phone phone: phones){
            System.out.println(phone);
        }*/
        List<String> phoneNames = new ArrayList<>();
        for (Phone phone: phones){
            phoneNames.add(phone.getName());
        }

        List<String> list = phones.stream().map(Phone::getName).collect(Collectors.toList());
        System.out.println(list);


    }
}
