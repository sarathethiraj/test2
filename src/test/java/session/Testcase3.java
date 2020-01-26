package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	bookMyShowHomePage bhm;
	WebDriver driver;
	
	
	
	@Test
	public void bookmyshow1() {
		browserSetup bs = new browserSetup(driver);
		driver=bs.browserSetupconnection("Chrome");
		driver.get("https://in.bookmyshow.com/madurai");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	    bhm = new bookMyShowHomePage(driver);
	    bhm.Letsgobtn.click();
		bhm.txtbox.sendKeys("Learning of Automation");
		
	}

}
