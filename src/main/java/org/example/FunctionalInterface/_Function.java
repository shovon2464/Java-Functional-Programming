package org.example.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

  static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
  static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
  static Function<Integer, Integer> addByOneThenMultiplyByTenFunction = incrementByOneFunction.andThen(
      multiplyByTenFunction);
  static BiFunction<Integer, Integer, Integer> addByoneThenMultiplyBiFunction = (numberToIncrement, numberToMultiply) ->
      (numberToIncrement + 1) * numberToMultiply;

  public static void main(String[] args) {
    int increment = incrementByOne(1);
    System.out.println(increment);
    int increment2 = incrementByOneFunction.apply(1);
    System.out.println(increment2);

    int multiply = multiplyByTenFunction.apply(increment2);
    System.out.println(multiply);

    int multiply2 = addByOneThenMultiplyByTenFunction.apply(1);
    System.out.println(multiply2);

    int multiply3 = addByoneThenMultiplyBiFunction.apply(1, 20);
    System.out.println(multiply3);
  }

  static int incrementByOne(int number) {
    return number + 1;
  }

}
