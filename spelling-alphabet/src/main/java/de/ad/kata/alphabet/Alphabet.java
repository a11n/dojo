package de.ad.kata.alphabet;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Alphabet {
  private static final String[] WORDS =
      { "Alfa", "Bravo", "Charlie", "Delta", "Foxtrot", "Echo", "Golf", "Hotel", "India", "Juliett",
          "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango",
          "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu" };

  public String spell(char character) {
    return lookUpWordFor(character);
  }

  public String spell(String word) {
    StringBuilder builder = new StringBuilder();

    for (char character : word.toCharArray())
      builder.append(spell(character)).append(" ");

    return builder.toString();
  }

  private String lookUpWordFor(char character) {
    return Arrays.stream(WORDS).filter(startsWith(character)).findFirst()
        .orElseThrow(illegal(character));
  }
  
  private Predicate<String> startsWith(char character){
    return word -> word.indexOf(Character.toUpperCase(character)) == 0;
  }
  
  private Supplier<RuntimeException> illegal(char character){
    return () -> new IllegalArgumentException(
        String.format("'%s' cannot be spelled.", character));
  }
}
