package dev.jamesoliver.kata.jadencase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Jaden Casing Strings")
class KataTest {

  private final Kata kata = new Kata();

  @Test
  @DisplayName("Given a string when the first letter is capitalised then returns string unmodified")
  void givenAStringWhenTheFirstLetterIsCapitalisedThenReturnsStringUnmodified() {
    assertEquals("Capitalised", kata.toJadenCase("Capitalised"));
  }

  @Test
  @DisplayName("Given a string when the first letter is lower case then returns capitalised string")
  void givenAStringWhenTheFirstLetterIsLowerCaseThenReturnsCapitalisedString() {
    assertEquals("Lower", kata.toJadenCase("lower"));
  }

  @Test
  @DisplayName("Given a string with multiple words when the first letter is capitalised then returns string unmodified")
  void givenAStringWithMultipleWordsWhenTheFirstLetterIsCapitalisedThenReturnsStringUnmodified() {
    assertEquals("Capitalised Words", kata.toJadenCase("Capitalised Words"));
  }

  @Test
  @DisplayName("Given a string with multiple words when the first letter is lower case then returns capitalised words")
  void givenAStringWithMultipleWordsWhenTheFirstLetterIsLowerCaseThenReturnsCapitalisedWords() {
    assertEquals("Lower Case Words", kata.toJadenCase("lower case words"));
  }

  @Test
  @DisplayName("Given a string with multiple words when there is a mix of lower case and capitalised words then returns capitalised words")
  void givenAStringWithMultipleWordsWhenThereIsAMixOfLowerCaseAndCapitalisedWordsThenReturnsCapitalisedWords() {
    assertEquals("Mixed Case Words", kata.toJadenCase("Mixed case Words"));
  }

  @Test
  @DisplayName("Given an empty string then returns null")
  void givenAnEmptyStringThenReturnsNull() {
    assertNull(kata.toJadenCase(""));
  }

  @Test
  @DisplayName("Given a null string then returns null")
  void givenANullStringThenReturnsNull() {
    assertNull(kata.toJadenCase(null));
  }

  @Test
  @DisplayName("Code Wars examples")
  void codeWarsExamples() {
    assertEquals( "Most Trees Are Blue", kata.toJadenCase("most trees are blue"));
    assertNull(kata.toJadenCase(null));
    assertNull(kata.toJadenCase(""));
  }
}