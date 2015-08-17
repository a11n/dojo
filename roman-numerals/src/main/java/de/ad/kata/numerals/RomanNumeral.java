package de.ad.kata.numerals;

public class RomanNumeral {
  private final static int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  private final static String[] SYMBOLS =
      { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  private final int number;

  private RomanNumeral(int number) {
    this.number = number;
  }

  private RomanNumeral(String numeral) {
    number = fromString(numeral);
  }

  public static RomanNumeral of(int number) {
    return new RomanNumeral(number);
  }

  public static RomanNumeral of(String numeral) {
    return new RomanNumeral(numeral);
  }

  @Override public String toString() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0, rest = number; i < VALUES.length; i++) {
      for (; rest / VALUES[i] > 0; rest -= VALUES[i]) {
        builder.append(SYMBOLS[i]);
      }
    }

    return builder.toString();
  }

  public int toInt() {
    return number;
  }

  private int fromString(String numeral) {
    int number = 0;
    for (int i = 0; i < SYMBOLS.length; i++) {
      for (; numeral.startsWith(SYMBOLS[i]); numeral = numeral.substring(SYMBOLS[i].length())) {
        number += VALUES[i];
      }
    }

    return number;
  }
}
