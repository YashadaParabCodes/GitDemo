package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void before() {
		System.out.println("Test execution is started");
	}
	

}
