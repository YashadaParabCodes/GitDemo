package Test;

import org.testng.annotations.Test;

public class MobileLogin {
	
	@Test(groups= {"Smoke"})
	public void homeLogin() {
		System.out.println("Home unlocked");
	}
	
	@Test
	public void carLogin() {
		System.out.println("Car unlocked");
	}

}
