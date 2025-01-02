package Test;

import org.testng.annotations.Test;

public class HelperAttribute {
	
	@Test(dependsOnMethods= {"B"})
	public void A() {
		System.out.println("Should be executed second");
		}
	@Test
	public void B() {
		System.out.println("Should be executed first");
	}
	
	@Test(enabled=false)
	public void failedMethod() {
		System.out.println("Failed method");
	}

}
