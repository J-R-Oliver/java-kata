package dev.jamesoliver.kata.breakcamelcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Break camelCase")
class KataTest {

  @Test
  @DisplayName("Given a string of a single camelCase word then returns word split with a space")
  void givenAStringOfASingleCamelCaseWordThenReturnsWordSplitWithASpace() {
    assertEquals("camel Case", Kata.camelCase("camelCase"));
  }

  @Test
  @DisplayName("Given a string of a single lowercase word then returns word unchanged")
  void givenAStringOfASingleLowercaseWordThenReturnsWordUnchanged() {
    assertEquals("lowercase", Kata.camelCase("lowercase"));
  }

  @Test
  @DisplayName("Given a string of multiple camelCase words then returns words split with a space")
  void givenAStringOfMultipleCamelCaseWordsThenReturnsWordsSplitWithASpace() {
    assertEquals(
        "camel Case random Case  Three Words Together",
        Kata.camelCase("camelCase randomCase ThreeWordsTogether"));
  }

  @Test
  @DisplayName(
      "Given a string of multiple mixed case words then returns string with camelCase words split with a space")
  void givenAStringOfMultipleMixedCaseWordsThenReturnsStringWithCamelCaseWordsSplitWithASpace() {
    assertEquals(
        "camel Case random Case lowercase  Three Words Together",
        Kata.camelCase("camelCase randomCase lowercase ThreeWordsTogether"));
  }

  @Test
  @DisplayName("Code Wars examples")
  void codeWarsExamples() {
    assertEquals("camel Casing", Kata.camelCase("camelCasing"));
    assertEquals("camel Casing Test", Kata.camelCase("camelCasingTest"));
    assertEquals("camelcasingtest", Kata.camelCase("camelcasingtest"));
  }
}
