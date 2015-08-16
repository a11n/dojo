package de.ad.kata.alphabet;

import java.util.Arrays;

public class Alphabet {
  private static final String[] WORDS = { "alfa", "bravo" };

  public String spell(char character) {
    return lookUpWordFor(character);
  }

  private String lookUpWordFor(final char character) {
    return Arrays.stream(WORDS)
        .filter(word -> word.indexOf(character) == 0)
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException(
            String.format("'%s' cannot be spelled.", character)));
  }
}
