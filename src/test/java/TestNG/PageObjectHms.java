package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectHms {
	
	WebDriver ldriver;
	public PageObjectHms(WebDriver rdriver)
	{ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(name="ad_email")
	WebElement username;
	
	
	@FindBy(name="ad_pwd")
	WebElement password;
	@FindBy(name="admin_login")
	WebElement button;
	
		
		
	
}
