package Tnsif_dayten_JUnit_testing;

import org.junit.jupiter.api.AfterAll;


@TestInstance(Lifecycle.PER_CLASS)

public class TestLifeCycleDemo {

	
	@BeforeEach
	void beforeEachTest()
	{
		System.out.println("Before Each test"); //2nd test
	}
	
	@AfterEach
	void afterEachTest()
	{
		System.out.println("After Each test"); //4th test
	}
	
	@BeforeAll
	void beforeAllTests()
	{
		System.out.println("Before All test"); //1st test
	}
	
	@AfterAll
	void afterAllTests()
	{
		System.out.println("After Each All"); //5th test
	}
	
	@Test
	void Test1()
	{
		System.out.println("Test Method"); //3rd test
	}
	
	
}