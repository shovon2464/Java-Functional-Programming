package org.example.FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier {

  public static Supplier<String> getDBConnection = () -> "url";
  public static void main(String[] args) {
    System.out.println(getDBConnection.get());

  }

}
