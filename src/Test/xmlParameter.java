package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class xmlParameter {
	@Parameters ({"url"})
	@Test
	public void urlhit(String url) {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}

}
