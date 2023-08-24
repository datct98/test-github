package lab6.sale.service;

import lab6.sale.entities.FPTShop;
import lab6.sale.entities.Orders;

import java.util.ArrayList;
import java.util.Map;

public class OrderService {
    public Map<Integer, Orders> getAllOrder(FPTShop shop){
        return shop.getOrders();
    }

    public void editOrder(int orderId, Map<Integer, Orders> orders){
        Orders od = orders.get(orderId);
        System.out.println("Moiwf nhaajp ...");
    }
}
