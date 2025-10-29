package Tnsif_dayten_JUnit_testing;

import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;

public class AssertDemo {

	@Test
	public void testForAssertEquals()
	{
		int result = 1;
		int expected = 1;
		
		assertEquals(result,expected);
		
	}
	
	@Test
	public void testForAssertTrue()
	{
	assertTrue("Hello".contains("i"));
		
		
	}
	
	@Test
	public void testForAssertFalse()
	{
	assertFalse("Hello".contains("r"));
		
		
	}
	
	
	@Test
	public void testForNull()
	{
	
		String s = null;
		assertNull(s);
		
		
	}
	
	@Test
	public void testFail()
	{
	fail("It is suppose to be fail");
		
		
	}
	
	
}

