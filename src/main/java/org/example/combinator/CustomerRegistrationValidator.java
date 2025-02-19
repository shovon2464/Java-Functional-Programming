package org.example.combinator;

import static java.time.LocalTime.now;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import org.example.combinator.CustomerRegistrationValidator.ValidationResult;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

  static CustomerRegistrationValidator isEmailValid() {
    return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_INVALID;
  }

  static CustomerRegistrationValidator isPhoneValid() {
    return customer -> customer.getPhoneNumber().startsWith("+1") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_INVALID;
  }

  static CustomerRegistrationValidator isAdult() {
    return customer -> Period.between(customer.getBirthDate(), LocalDate.now()).getYears()>=18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;
  }


  default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
    return customer -> {
      ValidationResult result = this.apply(customer);
      return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
    };
  }
  enum ValidationResult {
    SUCCESS,
    PHONE_NUMBER_INVALID,
    EMAIL_INVALID,
    IS_NOT_ADULT,
    FAILURE
  }
}
