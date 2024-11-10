package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);		
		// method-1
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("10/12/1995");
		// method-2
		
	 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	    String Date="19";
	    String month="December";
	    String year="2010"; 
	    // select for datepicker
	while(true)
	{  String actualmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	 String actualyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	  
	 if (actualmonth.equals(month)&& actualyear.equals(year))
	 { 
		 break;
	 }
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		// driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		 
	 }
	 
	//selected the date
	
List<WebElement>allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));

for(WebElement dt:allDate)
{
	if(dt.getText().equals(Date))
	{dt.click();
	break;
	}
}

	}

	}
 
	
	
	
	
	
	
	
	
	
	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   



