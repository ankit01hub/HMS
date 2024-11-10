package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
				
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
WebElement rome =driver.findElement(By.xpath("//*[@id=\"box6\"]"));
 WebElement itly=driver.findElement(By.xpath("//*[@id=\"box106\"]"));	
 act.dragAndDrop(rome, itly).build().perform();
 Actions act1=new Actions(driver);
  WebElement mad=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
   WebElement span=   driver.findElement(By.xpath("//*[@id=\"box107\"]"));
   act1.dragAndDrop(mad, span).build().perform();  
   Actions act2= new Actions (driver);
 WebElement wasi=  driver.findElement(By.id("box3"));
       WebElement usa=driver.findElement(By.id("box103"));
       act2.dragAndDrop(wasi, usa).build().perform();
       Actions act3=  new Actions (driver);
   WebElement stock= driver.findElement(By.id("box2"));
 WebElement swden=  driver.findElement(By.id("box102"));
 act.dragAndDrop(stock, swden).build().perform();
   
   
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}
}
		
		
