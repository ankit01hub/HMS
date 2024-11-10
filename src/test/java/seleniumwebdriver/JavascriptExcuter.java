package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExcuter {


	private static JavascriptExecutor js;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//zoom in and zoom out
		js.executeScript("document.body.style.zoom='75%'");
		// to send the text
WebElement name=driver.findElement(By.xpath("//*[@id=\"name\"]"));

	js.executeScript("arguments[0].setAttribute('value','ankit')",name);	
	// to perfrom click operation
WebElement  button=	driver.findElement(By.xpath("//*[@id=\"male\"]"));
	js.executeScript("arguments[0].click()",button);
	
	// to find tha domain name of webpage
String s1=	js.executeScript("return document.domain;").toString();
System.out.println(s1);
		// to find the url of the page
 String s2=js.executeScript("return document.URL;").toString();		
		System.out.println(s2);
		
		// to nevigate another webpage
		js.executeScript("window.location.href ='https://www.google.co.in';");
		

	}



}
