package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// date picker with the help select class
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
// expacted data
String expactedyear="2025";
String expactedmonth="Jan";
String expactedday="10";
// selected year and month

driver.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
 WebElement month= driver.findElement(By.xpath("//select[@class ='ui-datepicker-month']"));
 Select sc= new Select(month);
 sc.selectByVisibleText(expactedmonth);
 // select year
WebElement year= driver.findElement(By.xpath("//select[@class ='ui-datepicker-year']"));
Select sc1=new Select(year);
sc1.selectByVisibleText(expactedyear);
// select date 
 List<WebElement>date=  driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//tbody//tr//td//a`"));
for ( WebElement dt:date)
{
	if( dt.getText().equals(expactedday))
{ dt.click();

 break;
}

}
	}
}
 
		
	
		
		
		
		
		
		
		
		
			
		
	


