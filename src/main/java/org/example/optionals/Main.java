package org.example.optionals;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Object value = Optional.ofNullable("hi")
        .orElseThrow(() -> new IllegalStateException("No value present"));

    System.out.println(value);
  }
}
