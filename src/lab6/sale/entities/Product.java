package lab6.sale.entities;

public class Product {
    private static int autoId;
    private int id;
    private String name;
    private String status;
    private String des;
    private double price;
    private int quantity;

    public Product(String name, String status, String des, double price, int quantity) {
        this.id = ++autoId;
        this.name = name;
        this.status = status;
        this.des = des;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(Product productOther, int quantity) {
        this.id = productOther.getId();
        this.name= productOther.getName();
        this.status = productOther.getStatus();
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
