package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
				
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get(" ");
		driver.manage().window().maximize();
		
		

	}

}
