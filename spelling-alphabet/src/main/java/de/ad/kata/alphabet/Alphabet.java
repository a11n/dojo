package de.ad.kata.alphabet;

import java.util.Arrays;

public class Alphabet {
  private static final String[] WORDS =
      { "Alfa", "Bravo", "Charlie", "Delta", "Foxtrot", "Echo", "Golf", "Hotel", "India", "Juliett",
          "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango",
          "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu" };

  public String spell(char character) {
    return lookUpWordFor(character);
  }

  private String lookUpWordFor(final char character) {
    return Arrays.stream(WORDS)
        .filter(word -> word.indexOf(Character.toUpperCase(character)) == 0)
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException(
            String.format("'%s' cannot be spelled.", character)));
  }
}
