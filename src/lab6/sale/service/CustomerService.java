package lab6.sale.service;

import lab6.sale.entities.Customer;
import lab6.sale.entities.FPTShop;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService {
    public Map<Integer, Customer> getAllCustomer(FPTShop shop){
        return shop.getCustomers();
    }

    public Customer getCustomerById(int idCus, Map<Integer, Customer> customers){
        return customers.get(idCus);
    }

    public void editCustomerInfo(int idCus, Map<Integer, Customer> customers){
        Customer customer = customers.get(idCus);
        System.out.println("Mời nhập thông tin để chỉnh sửa...");
    }
}
