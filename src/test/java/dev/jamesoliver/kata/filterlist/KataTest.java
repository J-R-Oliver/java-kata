package dev.jamesoliver.kata.filterlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Filter list")
class KataTest {

  @Test
  @DisplayName("Given a list of integers then returns list of integers unmodified")
  void givenAListOfIntegersThenReturnsListOfIntegersUnmodified() {
    assertEquals(List.of(1, 2, 3), Kata.filterList(List.of(1, 2, 3)));
  }

  @Test
  @DisplayName("Given a list of strings then returns empty list")
  void givenAListOfStringsThenReturnsEmptyList() {
    assertEquals(List.of(), Kata.filterList(List.of("one", "two", "three")));
  }

  @Test
  @DisplayName("Given a list of strings and integers then returns list containing only integers")
  void givenAListOfStringsAndIntegersThenReturnsListContainingOnlyIntegers() {
    assertEquals(List.of(4, 5, 6), Kata.filterList(List.of("one", "two", "three", 4, 5, 6)));
  }

  @Test
  @DisplayName("Code Wars examples")
  void codeWarsExamples() {
    assertEquals(
        List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
    assertEquals(
        List.of(1, 0, 15),
        Kata.filterList(List.of(1, "a", "b", 0, 15)),
        "For input: [1, \"a\", \"b\", 0, 15]");
    assertEquals(
        List.of(1, 2, 123),
        Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)),
        "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
  }
}
