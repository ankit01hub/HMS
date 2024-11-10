package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.rediff.com/");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("moneyiframe");
			//driver.switchTo().frame(0); 
			
		WebElement element= driver.findElement(By.xpath("//*[@id=\"nseindex\"]"));
	  String s1=element.getText();
		System.out.println(s1);
		driver.switchTo().defaultContent();
		
		

	}

}
