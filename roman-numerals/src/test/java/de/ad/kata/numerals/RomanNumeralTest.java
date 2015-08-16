package de.ad.kata.numerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralTest {
  @Test
  public void testConversionToRomanNumeral() throws Exception {
    assertThat(RomanNumeral.of(1).toString(), is("I"));
    assertThat(RomanNumeral.of(2).toString(), is("II"));
    assertThat(RomanNumeral.of(3).toString(), is("III"));
    
    assertThat(RomanNumeral.of(4).toString(), is("IV"));
    assertThat(RomanNumeral.of(5).toString(), is("V"));
    assertThat(RomanNumeral.of(6).toString(), is("VI"));
    
    assertThat(RomanNumeral.of(9).toString(), is("IX"));
    assertThat(RomanNumeral.of(10).toString(), is("X"));
    assertThat(RomanNumeral.of(11).toString(), is("XI"));
  }
}
