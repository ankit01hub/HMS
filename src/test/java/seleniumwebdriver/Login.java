package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 



public class Login { 

	public static  void main(String[] args) throws InterruptedException   {
	WebDriverManager.chromedriver().setup();
		
	 ChromeOptions options = new ChromeOptions();
			
	options.addArguments("--remote-allow-origins=*");
			//(1)-launch beowser(chrome)
	WebDriver driver=new ChromeDriver(options);	
		//(2)- launch URL

	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();// full size window launch
	Thread.sleep(2000);
		//(3)- intract with web elemant
WebElement user=  driver.findElement(By.id("email"));
user.sendKeys("ankit01");
	   Thread.sleep(2000);		

WebElement pass=	driver.findElement(By.id("pass"));
pass.sendKeys("1234");
driver.findElement(By.id("login")).click();	
		
	
		
		
		

	}

}
