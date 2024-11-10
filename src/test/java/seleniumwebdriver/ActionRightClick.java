package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
				
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);

 WebElement rightclick=	driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
 
 act.contextClick(rightclick).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	}

}
