package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException   {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		 driver.switchTo().alert().accept();  
		
		
		 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		 
		 driver.switchTo().alert().dismiss();	 
	String s=	driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();		
		System.out.println(s);
		
		// aleart box by send message 
		 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		 driver.switchTo().alert().sendKeys("ankit");
		 driver.switchTo().alert().accept();
		 String a= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		 System.out.println(a);
		 
		
		
		
		
		
		
		
		
		
		 

	}

}
