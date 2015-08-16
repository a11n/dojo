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
    assertThat(alphabet.spell('a'), is("Alfa"));
    assertThat(alphabet.spell('b'), is("Bravo"));
    assertThat(alphabet.spell('c'), is("Charlie"));
    
    assertThat(alphabet.spell('d'), is("Delta"));
    assertThat(alphabet.spell('e'), is("Echo"));
    assertThat(alphabet.spell('f'), is("Foxtrot"));
    
    assertThat(alphabet.spell('g'), is("Golf"));
    assertThat(alphabet.spell('h'), is("Hotel"));
    assertThat(alphabet.spell('i'), is("India"));
    
    assertThat(alphabet.spell('j'), is("Juliett"));
    assertThat(alphabet.spell('k'), is("Kilo"));
    assertThat(alphabet.spell('l'), is("Lima"));
    
    assertThat(alphabet.spell('m'), is("Mike"));
    assertThat(alphabet.spell('n'), is("November"));
    assertThat(alphabet.spell('o'), is("Oscar"));

    assertThat(alphabet.spell('p'), is("Papa"));
    assertThat(alphabet.spell('q'), is("Quebec"));
    assertThat(alphabet.spell('r'), is("Romeo"));

    assertThat(alphabet.spell('s'), is("Sierra"));
    assertThat(alphabet.spell('t'), is("Tango"));
    assertThat(alphabet.spell('u'), is("Uniform"));

    assertThat(alphabet.spell('v'), is("Victor"));
    assertThat(alphabet.spell('w'), is("Whiskey"));
    assertThat(alphabet.spell('x'), is("X-Ray"));

    assertThat(alphabet.spell('y'), is("Yankee"));
    assertThat(alphabet.spell('z'), is("Zulu"));
  }
}
