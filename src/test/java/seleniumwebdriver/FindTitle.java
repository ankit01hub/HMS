package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		  String s1 =driver.getTitle();
		System.out.println(s1);
		 String s2=driver.getCurrentUrl();
		 System.out.println(s2);
		 Thread.sleep(2000);
		 driver.navigate().to("https://fast.com/");
		 Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//driver.navigate().forward();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
