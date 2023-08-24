package B15.managephone.data;

import B15.managephone.entities.Phone;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public Map<Integer, Phone> phoneList(){
        Map<Integer, Phone> phones = new HashMap<>(Map.of
                (1, new Phone("Iphone 15", "apple",1000)));
        return phones;
    }
}
