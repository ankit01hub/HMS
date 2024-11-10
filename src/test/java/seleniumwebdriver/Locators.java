package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 


import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static   void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Posts (Atom)")).click();
		driver.findElement(By.partialLinkText("posts")).click();
		Thread.sleep(2000);
		driver.close();// closed current window
		driver.quit();/// closed all window
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}