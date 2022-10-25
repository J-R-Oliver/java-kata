package dev.jamesoliver.kata.sumarray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sum Arrays")
class KataTest {

  @Test
  @DisplayName("Given an array of positive numbers then returns the sum of the numbers")
  void givenAnArrayOfPositiveNumbersThenReturnsTheSumOfTheNumbers() {
    assertEquals(10, Kata.sum(new double[]{1, 2, 3, 4}));
  }

  @Test
  @DisplayName("Given an array of negative numbers then returns the sum of the numbers")
  void givenAnArrayOfNegativeNumbersThenReturnsTheSumOfTheNumbers() {
    assertEquals(-10, Kata.sum(new double[]{-1, -2, -3, -4}));
  }

  @Test
  @DisplayName("Given an array of positive and negative numbers then returns the sum of the numbers")
  void givenAnArrayOfPositiveAndNegativeNumbersThenReturnsTheSumOfTheNumbers() {
    assertEquals(2, Kata.sum(new double[]{-1, 2, -3, 4}));
  }

  @Test
  @DisplayName("Code Wars examples")
  void codeWarsExamples() {
    assertEquals(0,      Kata.sum(new double[] { }),                1e-4);
    assertEquals(-2.398, Kata.sum(new double[] {-2.398}),           1e-4);
    assertEquals(6,      Kata.sum(new double[] {1, 2, 3}),          1e-4);
    assertEquals(6.6,    Kata.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
    assertEquals(9.2,    Kata.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
    assertEquals(320,    Kata.sum(new double[] {30, 89, 100, 101}), 1e-4);
  }
}