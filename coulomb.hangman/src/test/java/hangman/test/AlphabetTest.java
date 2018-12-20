package hangman.test;

import org.junit.Test;

import hangman.util.Alphabet;
import junit.framework.TestCase;

public class AlphabetTest extends TestCase {
	
	@Test
	public void testAlphabet() {
		
		//Test getting the fourth letter of the alphabet (index starts at 0)
		assertEquals(Alphabet.getLetter(3), 'D');
		
		// Test the inverse direction
		assertEquals(Alphabet.getNummber('a'), 0);

		
		// Test case insensitivity
		assertEquals(Alphabet.getNummber('A'), 0);
		
	}
}
