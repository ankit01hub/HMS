 package seleniumwebdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='75%'");
		// take screenshot whole screen
	/*	TakesScreenshot ts=(TakesScreenshot)driver;
	File ankit=	ts.getScreenshotAs(OutputType.FILE);
	
	File targetfile=new File("C:\\Selenium\\seleniumwebdriver\\Screenshot/ankus.png");
	ankit.renameTo(targetfile);
		*/
		// Take a screenshot a webelement
	WebElement featureproduct=	driver.findElement(By.xpath("//*[@id=\"header-inner\"]/div[1]/h1"));
	
	 File sourcefile=featureproduct.getScreenshotAs(OutputType.FILE);
	 File targetfile= new File("C:\\Selenium\\seleniumwebdriver\\Screenshot/elementh.png");
	 sourcefile.renameTo(targetfile);
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
