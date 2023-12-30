package framework.Juit;

import org.junit.Assert;
import org.junit.Test;

public class MyJunitTest 
{
	
	// This annotation organize your test to run without object creation
	// and without using main method
	@Test
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("Test is Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test2 is Executed");
	}

	@Test
	public void test3() {
		System.out.println("Test3 is Executed");
	}

}
