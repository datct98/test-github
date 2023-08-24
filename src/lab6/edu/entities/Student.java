package lab6.edu.entities;

import lab6.sale.entities.Person;

public class Student extends Person {
    private String email;
    private double avgScore;

    public Student(int id, String name, String phone, String address, String email, double avgScore) {
        super(id, name, phone, address);
        this.email = email;
        this.avgScore = avgScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
}
