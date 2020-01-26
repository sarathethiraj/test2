package session;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase  {
	
	youtubeHomePage yhm;
	googleHomePage ghm;
	WebDriver driver;
	
	
	
	@Test
	public void google1() {
		browserSetup bs = new browserSetup(driver);
		driver=bs.browserSetupconnection("Chrome");
		driver.get("https://www.google.com");
		ghm=new googleHomePage(driver);
		ghm.serachbox.sendKeys("automation");
		
		
	}

}
