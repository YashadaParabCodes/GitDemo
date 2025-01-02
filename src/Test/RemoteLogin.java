package Test;

import org.testng.annotations.Test;

public class RemoteLogin {
	
	@Test
	public void homeLogin() {
		System.out.println("Home unlocked remotely");
	}
	
	@Test
	public void carLogin() {
		System.out.println("Car unlocked remotely");
	}

}
