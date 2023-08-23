package Exercises.Ex011Composicao.entities;

import Examples.Enums.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
  private LocalDateTime moment;
  private OrderStatus status;
  private Client client;
  private List<OrderItem> orderItems = new ArrayList<>();

  public Order() {
  }

  public Order(LocalDateTime moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  public LocalDateTime getMoment() {
    return moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void addItem(OrderItem item) {
    orderItems.add(item);
  }

  public void removeItem(OrderItem item) {
    orderItems.remove(item);
  }

  public Double total() {
    Double sum = 0.0;

    for (OrderItem item : orderItems) {
      sum += item.subTotal();
    }

    return sum;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    DateTimeFormatter fullDateMask = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    stringBuilder.append("\nORDER SUMMARY:\n");
    stringBuilder.append("Order moment: " + moment.format(fullDateMask));
    stringBuilder.append("\nOrder status: " + status);
    stringBuilder.append("\nClient: " + client.toString());
    stringBuilder.append("Order items:\n");

    for (OrderItem item : orderItems) {
      stringBuilder.append(item.toString());
    }

    stringBuilder.append(String.format("Total price: $%.2f", total()));

    return stringBuilder.toString();
  }
}
