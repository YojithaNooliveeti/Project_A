package framework.Juit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class First_junit {

	@Test
	void test() {
		System.out.println("test is executed");
	}
	
	@Test
	public void test1()
	{
		System.out.println("2 executed");
	}

	@Before
	public void testa() {
		
	}
}
