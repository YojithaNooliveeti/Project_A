package framework.testng;

import org.testng.annotations.Test;

public class InvaCation_Count 
{

	int count = 0;

	@Test(invocationCount = 10) // Repeat test 10 times
	public void test() {
		System.out.println("Test Executed");
		count = count + 1;
		System.out.println(count);
	}
}
