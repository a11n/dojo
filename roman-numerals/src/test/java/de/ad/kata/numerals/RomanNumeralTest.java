package de.ad.kata.numerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralTest {
  @Test
  public void testConversionToRomanNumeral() throws Exception {
    assertThat(RomanNumeral.of(1), is("I"));
  }
}
