package TestNG;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	@Test
	public void testLogin() throws FileNotFoundException
	{  WebDriverManager.chromedriver().setup();
	 ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	ReadConfig config=new ReadConfig();
	driver.get(config.getURL());
	driver.findElement(By.name("ad_email")).sendKeys(config.getUsername());
	driver.findElement(By.name("ad_pwd")).sendKeys(config.getPassword());
	
	}		
		
		
}
