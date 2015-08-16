package de.ad.kata.alphabet;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AlphabetTest {

  private Alphabet alphabet;

  @Before
  public void setUp() throws Exception {
    alphabet = new Alphabet();
  }

  @Test
  public void testCharacterSpelling() throws Exception {
    String actual = alphabet.spell('a');

    assertThat(actual, is("alfa"));
  }
}
