package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserSetup {
	static WebDriver dr;

	public  WebDriver browserSetupconnection(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
		    dr= new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup(); 
			dr= new InternetExplorerDriver();
			
		}
		return dr;
	}
	
	browserSetup(WebDriver driver){
		
		this.dr=driver;
		PageFactory.initElements(this.dr, this);
		
		
	}
	

	/*
	 * public static void main(String[] args) { browserSetup bs = new
	 * browserSetup(); bs.browserSetupconnection("Chrome");
	 * dr.get("https://www.google.com");
	 * 
	 * }
	 */

}
