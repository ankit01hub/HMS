package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RevisionClass {
 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
				
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);	
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();	
		Actions act = new Actions(driver);
	WebElement sbi=	driver.findElement(By.className("has-submenu highlighted"));
		act.moveToElement(sbi).build().perform();
		
	 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
