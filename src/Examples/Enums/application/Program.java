package Examples.Enums.application;

import Examples.Enums.entities.Order;
import Examples.Enums.entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {
    Order order = new Order(1, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

    System.out.println("Order = " + order);

    OrderStatus statusByUser = OrderStatus.valueOf("PROCESSING");
    System.out.println("Status by user = " + statusByUser);
  }
}
