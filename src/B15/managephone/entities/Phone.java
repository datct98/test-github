package B15.managephone.entities;

public class Phone {
    private int id;
    private static int autoId;
    private String name;
    private String brand;
    private double price;

    public int getId() {
        return id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Phone(String name, String brand, double price) {
        this.id = ++autoId;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
