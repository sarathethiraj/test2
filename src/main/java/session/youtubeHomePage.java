package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class youtubeHomePage extends browserSetup {
	
	youtubeHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="search")
	WebElement txtbox;
	
	
	
	@FindBy(partialLinkText="LET'S")
	WebElement Letsgobtn;
	
	@FindBy(partialLinkText="NOT")
	WebElement notnowbtn;
	
	
	

}
