package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	youtubeHomePage yhm;
	WebDriver driver;
	
	
	
	@Test
	public void youtube1() {
		browserSetup bs = new browserSetup(driver);
		driver=bs.browserSetupconnection("Chrome");
		driver.get("https://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    yhm = new youtubeHomePage(driver);
	    yhm.notnowbtn.click();
		yhm.txtbox.sendKeys("Learning of Automation");
		
	}

}
