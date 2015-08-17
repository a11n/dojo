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

    assertThat(RomanNumeral.of(14).toString(), is("XIV"));
    assertThat(RomanNumeral.of(15).toString(), is("XV"));
    assertThat(RomanNumeral.of(16).toString(), is("XVI"));

    assertThat(RomanNumeral.of(49).toString(), is("XLIX"));
    assertThat(RomanNumeral.of(50).toString(), is("L"));
    assertThat(RomanNumeral.of(51).toString(), is("LI"));

    assertThat(RomanNumeral.of(99).toString(), is("XCIX"));
    assertThat(RomanNumeral.of(100).toString(), is("C"));
    assertThat(RomanNumeral.of(101).toString(), is("CI"));

    assertThat(RomanNumeral.of(499).toString(), is("CDXCIX"));
    assertThat(RomanNumeral.of(500).toString(), is("D"));
    assertThat(RomanNumeral.of(501).toString(), is("DI"));

    assertThat(RomanNumeral.of(999).toString(), is("CMXCIX"));
    assertThat(RomanNumeral.of(1000).toString(), is("M"));
    assertThat(RomanNumeral.of(1001).toString(), is("MI"));

    assertThat(RomanNumeral.of(1249).toString(), is("MCCXLIX"));
    assertThat(RomanNumeral.of(2499).toString(), is("MMCDXCIX"));
    assertThat(RomanNumeral.of(3999).toString(), is("MMMCMXCIX"));
  }

  @Test
  public void testConversionOfRomanNumeral() throws Exception {
    assertThat(RomanNumeral.of("I").toInt(), is(1));
    assertThat(RomanNumeral.of("II").toInt(), is(2));
    assertThat(RomanNumeral.of("III").toInt(), is(3));

    assertThat(RomanNumeral.of("IV").toInt(), is(4));
    assertThat(RomanNumeral.of("V").toInt(), is(5));
    assertThat(RomanNumeral.of("VI").toInt(), is(6));

    assertThat(RomanNumeral.of("IX").toInt(), is(9));
    assertThat(RomanNumeral.of("X").toInt(), is(10));
    assertThat(RomanNumeral.of("XI").toInt(), is(11));

    assertThat(RomanNumeral.of("XIV").toInt(), is(14));
    assertThat(RomanNumeral.of("XV").toInt(), is(15));
    assertThat(RomanNumeral.of("XVI").toInt(), is(16));

    assertThat(RomanNumeral.of("XLIX").toInt(), is(49));
    assertThat(RomanNumeral.of("L").toInt(), is(50));
    assertThat(RomanNumeral.of("LI").toInt(), is(51));

    assertThat(RomanNumeral.of("XCIX").toInt(), is(99));
    assertThat(RomanNumeral.of("C").toInt(), is(100));
    assertThat(RomanNumeral.of("CI").toInt(), is(101));

    assertThat(RomanNumeral.of("CDXCIX").toInt(), is(499));
    assertThat(RomanNumeral.of("D").toInt(), is(500));
    assertThat(RomanNumeral.of("DI").toInt(), is(501));

    assertThat(RomanNumeral.of("CMXCIX").toInt(), is(999));
    assertThat(RomanNumeral.of("M").toInt(), is(1000));
    assertThat(RomanNumeral.of("MI").toInt(), is(1001));

    assertThat(RomanNumeral.of("MCCXLIX").toInt(), is(1249));
    assertThat(RomanNumeral.of("MMCDXCIX").toInt(), is(2499));
    assertThat(RomanNumeral.of("MMMCMXCIX").toInt(), is(3999));
  }
}
