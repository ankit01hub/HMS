package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HMS {
	@Test
	public void loginhms()
{ WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
  ChromeDriver driver = new ChromeDriver(options);
  driver.manage().window().maximize();
driver.get("https://project1.qualibytes.com/backend/admin/index.php");

		
}		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
