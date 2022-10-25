package dev.jamesoliver.kata.sumarray;

import java.util.Arrays;

/**
 * Write a function that takes an array of numbers and returns the sum of the numbers. The numbers
 * can be negative or non-integer. If the array does not contain any numbers then you should return
 * 0.
 */
public class Kata {

  private Kata() {}

  /**
   * Sums an array of doubles.
   *
   * @param numbers array of doubles
   * @return the sum of numbers
   */
  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  }
}
