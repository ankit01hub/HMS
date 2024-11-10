package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.facebook.com/reg/?next=%2FPHP%2F%3Flocal");
		driver.manage().window().maximize();
		
	      WebElement day= driver.findElement(By.id("day"));
	      WebElement month= driver.findElement(By.id("month"));
	      WebElement year= driver.findElement(By.id("year"));
	      Select sc= new Select(day);
	     // sc.selectByVisibleText("2");
	     // sc.selectByValue("13");
	      sc.selectByIndex(30);
	      Select sc1= new Select(month);
	      //sc1.selectByVisibleText("oct");
	      
	     // sc1.selectByValue("5");
	      sc1.selectByIndex(5);
	      Select sc2= new Select(year);

	    //  sc2.selectByVisibleText("2000");
	     // sc2.selectByValue("2010");
	      sc2.selectByIndex(10);
	      
		
	}

	

}
