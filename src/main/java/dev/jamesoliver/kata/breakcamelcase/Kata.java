package dev.jamesoliver.kata.breakcamelcase;

/**
 * Complete the solution so that the function will break up camel casing, using a space between
 * words.
 */
public class Kata {

  private Kata() {}

  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
