package org.example.combinator;

import java.time.LocalDate;
import org.example.combinator.CustomerRegistrationValidator.ValidationResult;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Shovon","shovon2464gmail.com", "+18258882464", LocalDate.of(2000,1,1));
    ValidationResult result = CustomerRegistrationValidator.isEmailValid()
        .and(CustomerRegistrationValidator.isPhoneValid())
        .and(CustomerRegistrationValidator.isAdult())
        .apply(customer);
    if(result != ValidationResult.SUCCESS) {
      throw new IllegalStateException(result.name());
    }
    else{
      System.out.println(result.name());
    }
  }
}
