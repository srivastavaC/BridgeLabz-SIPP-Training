package Collectors;
import java.util.*;
import java.util.stream.*;

class OrderData {
    private String customer;
    private double total;
    public OrderData(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class Order {
    public static void main(String[] args) {
        List<OrderData> orders = Arrays.asList(
            new OrderData("Alice", 120.50),
            new OrderData("Bob", 200.75),
            new OrderData("Alice", 80.25),
            new OrderData("Bob", 100.00),
            new OrderData("Charlie", 150.00)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      OrderData::getCustomer,
                      Collectors.summingDouble(OrderData::getTotal)
                  ));

        System.out.println(revenueByCustomer);
    }
}
