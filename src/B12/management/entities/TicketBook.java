package B12.management.entities;

import java.time.LocalDate;

public class TicketBook {
    private static int autoId;
    private int id;
    private Customer customer;
    private Book book;
    private LocalDate startDate;
    private LocalDate endDate;

    public TicketBook(Customer customer, Book book, LocalDate startDate, LocalDate endDate) {
        this.id = ++autoId;
        this.customer = customer;
        this.book = book;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
