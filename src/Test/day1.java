package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void demo() {
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("Welcome to new beginnings of 2025 year");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void before() {
		System.out.println("Test execution is started");
	}
	

}
