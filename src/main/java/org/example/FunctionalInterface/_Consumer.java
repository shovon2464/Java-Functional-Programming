package org.example.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.BiConsumer;


public class _Consumer {

  static Consumer<Customer> greetCustomerConsumer = customer -> {
    System.out.println("hello " + customer.customerName +" thanks for registering!");
  };

  static BiConsumer<String,String> greetCustomerConsumer2 = (customerName, customerPhone) -> System.out.println("hello " + customerName + " thanks for registering! "+ customerPhone);
  public static void main(String[] args) {
    Customer customer = new Customer("shovon","12345");
    greetCustomer(customer);
    greetCustomerConsumer.accept(customer);
    greetCustomerConsumer2.accept(customer.customerName,customer.customerPhoneNumber);
  }

  static void greetCustomer(Customer customer) {
    System.out.println("hello " + customer.customerName +" thanks for registering!");
  }

  static class Customer {
    private final String customerName;
    private final String customerPhoneNumber;
    public Customer(String customerName, String customerPhoneNumber) {
      this.customerName = customerName;
      this.customerPhoneNumber = customerPhoneNumber;
    }
  }

}
