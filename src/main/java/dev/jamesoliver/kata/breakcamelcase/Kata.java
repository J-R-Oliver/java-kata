package dev.jamesoliver.kata.breakcamelcase;

/**
 * Complete the solution so that the function will break up camel casing, using a space between
 * words.
 */
public class Kata {

  private Kata() {}

  /**
   * Adds space before every capital letter.
   *
   * @param input string to transform
   * @return transformed string
   */
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
