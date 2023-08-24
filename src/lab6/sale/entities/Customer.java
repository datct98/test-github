package lab6.sale.entities;

public class Customer extends Person{
    private double balance;
    private Cart cart;


    public Customer(int id, String name, String phone, String address) {
        super(id, name, phone, address);
    }

    public Customer(int id, String name, String phone, String address, double balance) {
        super(id, name, phone, address);
        this.balance = balance;
        this.cart = new Cart();
    }

    public double getBalance() {
        return balance;
    }

    public Cart getCart() {
        return cart;
    }

    public Customer(int id, String name, String phone, String address, Cart cart) {
        super(id, name, phone, address);
        this.cart = cart;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
