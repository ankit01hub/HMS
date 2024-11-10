package seleniumwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionaMouseOver {
		public static  void main(String[] args) throws InterruptedException   {
			WebDriverManager.chromedriver().setup();
				
			 ChromeOptions options = new ChromeOptions();
					
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);	
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			
			Actions act  = new Actions(driver);
		WebElement desktop=	driver.findElement(By.xpath("nav-link dropdown-toggle"));
		act.moveToElement(desktop).build().perform();
		// WebElement mac=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
	//	 mac.click();
		 
	//	 act.moveToElement(mac).build().perform(); 
	//	Thread.sleep(2000);
//act.moveToElement(desktop).moveToElement(mac).build().perform(); 
       //   Actions act1=new Actions(driver);
       //  WebElement comp=  driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a"));
          // act1.moveToElement(comp).build().perform();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
}
}
