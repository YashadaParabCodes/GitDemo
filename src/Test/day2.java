package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void demo() {
		System.out.println("World");
		System.out.println("Testing completed for day2");
	}
	@Test
	public void demo1() {
		System.out.println("Test2");
	}
	
	@AfterTest
	public void after() {
		System.out.println("Testing is completed for Test ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute before class day2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Execute after class day2");
	}

}
