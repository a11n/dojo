package de.ad.kata.numerals;

public class RomanNumeral {
  private final int number;

  private RomanNumeral(int number){
    this.number = number;
  }
  
  public static RomanNumeral of(int number) {
    return new RomanNumeral(number);
  }

  @Override public String toString() {
    return "I";
  }
}
