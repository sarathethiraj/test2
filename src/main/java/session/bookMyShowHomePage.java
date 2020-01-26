package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookMyShowHomePage extends browserSetup {
	
	bookMyShowHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="search")
	WebElement txtbox;
	
	
	
	@FindBy(id="wzrk-cancel")
	WebElement Letsgobtn;
	
	@FindBy(partialLinkText="NOT")
	WebElement notnowbtn;
	
	
	

}
