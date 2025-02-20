package org.example.callback;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaPractice {
  public static void main(String[] args) {
    Function<String, String> function1 =  name -> name.toUpperCase();
    //Function<String, String> function1 =  String:toUpperCase

    BiFunction<String, Integer, String> function2 = (name, age) -> {
      if (name.isBlank()) {
        throw new IllegalArgumentException("Name cannot be blank");
      }
      System.out.println(age);
      return name;
    };
  }
}
