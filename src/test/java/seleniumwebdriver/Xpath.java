package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
	
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		// Xpath with and operatar
	driver.findElement(By.xpath("//input[@id='email'and @type='text']")).sendKeys("ankush");
	// Xpath with OR operater
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7389064931");
	// xpath with text method
	 String s=driver.findElement(By.xpath("//h3[text()='GUI Elements']")).getText();
	 System.out.println(s);
		
		// xpath if value change --- 1)if id valve change (last value change hoge)
	 driver.findElement(By.xpath("//span[contains(@id='value']")).click();
	 // xpath if valve change--- 2)  in a id value ka (starting chatrer change horhe ho)
	 driver.findElement(By.xpath("//span[starts-with(@'value']")).click(); 
		
	
	
		
		
		
		
		
		


	}

}
