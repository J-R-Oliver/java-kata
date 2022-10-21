package dev.jamesoliver.kata.sorttheodd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Sort the odd")
class KataTest {

  @Test
  @DisplayName("Given an array of odd numbers then returns array with numbers in ascending order")
  void givenAnArrayOfOddNumbersThenReturnsArrayWithNumbersInAscendingOrder() {
    assertArrayEquals(new int[] {1, 3, 5, 7}, Kata.sortArray(new int[] {7, 3, 1, 5}));
  }

  @Test
  @DisplayName("Given an array of even numbers then returns array with no changes")
  void givenAnArrayOfEvenNumbersThenReturnsArrayWithNoChanges() {
    assertArrayEquals(new int[] {2, 8, 4, 12}, Kata.sortArray(new int[] {2, 8, 4, 12}));
  }

  @Test
  @DisplayName(
      "Given an array of mixed numbers then returns odd numbers in ascending order while leaving even numbers in their original places")
  void
      givenAnArrayOfMixedNumbersThenReturnsOddNumbersInAscendingOrderWhileLeavingEvenNumbersInTheirOriginalPlaces() {
    assertArrayEquals(
        new int[] {1, 2, 3, 8, 5, 7, 4, 12}, Kata.sortArray(new int[] {7, 2, 3, 8, 5, 1, 4, 12}));
  }

  @Test
  @DisplayName("Code Wars examples")
  void codeWarsExamples() {
    assertArrayEquals(new int[] {1, 3, 2, 8, 5, 4}, Kata.sortArray(new int[] {5, 3, 2, 8, 1, 4}));
    assertArrayEquals(new int[] {1, 3, 5, 8, 0}, Kata.sortArray(new int[] {5, 3, 1, 8, 0}));
    assertArrayEquals(new int[] {}, Kata.sortArray(new int[] {}));
  }
}
