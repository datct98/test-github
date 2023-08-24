package lab6.edu.entities;

import lab6.sale.entities.Person;

public class Teacher extends Person {
    private String major;
    private String email;

    public Teacher(int id, String name, String phone, String address) {
        super(id, name, phone, address);
    }

    public Teacher(int id, String name, String phone, String address, String major, String email) {
        super(id, name, phone, address);
        this.major = major;
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
