package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ManualLogin {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute before class");
	}
	
	@Test (groups= {"Smoke"})
	public void homeLogin() {
		System.out.println("Home unlocked manually");
	}
	
	@Test
	public void carLogin() {
		System.out.println("Car unlocked manually");
	}
	@Test
	public void mobileLogin1() {
		System.out.println("Mobile1 unlocked manually");
	}
	@Test
	public void mobileLogin2() {
		System.out.println("Mobile2 unlocked manually");
	}
	@Test
	public void mobileLogin3() {
		System.out.println("Mobile3 unlocked manually");
	}
	@Test
	public void mobileLogin4() {
		System.out.println("Mobile4 unlocked manually");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Runs before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Runs after suite");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Execute after each method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executes before each method");
	}
}
