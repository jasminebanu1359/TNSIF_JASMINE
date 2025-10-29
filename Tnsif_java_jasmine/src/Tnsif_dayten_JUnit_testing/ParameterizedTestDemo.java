package Tnsif_dayten_JUnit_testing;

import static org.junit.Assert.assertTrue;


public class ParameterizedTestDemo {

	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","radar","madam","string"})
	void testPalindromes(String word)
	{
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
	}
	
}