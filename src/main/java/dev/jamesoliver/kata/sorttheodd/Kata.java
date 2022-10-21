package dev.jamesoliver.kata.sorttheodd;

import java.util.Arrays;

/**
 * You will be given an array of numbers. You have to sort the odd numbers in ascending order while
 * leaving the even numbers at their original position.
 */
public class Kata {

  private Kata() {}

  /**
   * Sorts odd numbers in ascending order whilst leaving even numbers in their original positions.
   *
   * @param array to be sorted
   * @return sorted array
   */
  public static int[] sortArray(int[] array) {
    int[] sortedOddNumbers = Arrays.stream(array).filter(i -> i % 2 != 0).sorted().toArray();

    for (int i = 0, j = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array[i] = sortedOddNumbers[j++];
      }
    }

    return array;
  }
}
