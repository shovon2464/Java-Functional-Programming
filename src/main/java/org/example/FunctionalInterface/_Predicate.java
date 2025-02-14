package org.example.FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
  public static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("+1") && phoneNumber.length() == 12;
  public static Predicate<String> contains3 = phoneNumber -> phoneNumber.contains("3");
  public static void main(String[] args) {
    System.out.println(isPhoneNumberValid("+18258882464"));
    System.out.println(isPhoneNumberValid("+1825888246"));
    System.out.println(isPhoneNumberValid("8258882464"));
    System.out.println(isPhoneNumberValidPredicate.test("8258882464"));
    System.out.println(isPhoneNumberValidPredicate.and(contains3).test("825888246"));
  }

  static boolean isPhoneNumberValid(String phoneNumber) {
    return phoneNumber.startsWith("+1") && phoneNumber.length() == 12;
  }

}
