package scripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Script1 {
	
	@Test
	public void test1()
	{
		System.out.println(System.getProperty("os.name"));
		//System.out.println("Test1 passed!");
		assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 passed!");
		assertTrue(true);
	}

}
