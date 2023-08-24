package lab6.sale.entities;

public class Staff extends Person{

    private String email;

    public Staff(int id, String name, String phone, String address) {
        super(id, name, phone, address);
    }

    public Staff(int id, String name, String phone, String address, String email) {
        super(id, name, phone, address);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
