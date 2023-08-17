package B12.management.entities;

public class Customer {
    private static int autoId;
    private int id;
    private String name;
    private String addess;

    public Customer(String name, String addess) {
        this.id = ++autoId;
        this.name = name;
        this.addess = addess;
    }
}
