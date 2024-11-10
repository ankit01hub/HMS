package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeClass
	void method1()
	{ System.out.println("hello");
	}
	
	@BeforeMethod
	void method2()
	{ System.out.println("hello");
	}
	@AfterClass
	void method3()
	{ System.out.println("hello");
	}
	@AfterSuite
	void method4()
	{ System.out.println("hello");
	}
	@Test
	void method5()
	{ System.out.println("hello");
	}
@Test
	void method6()
	{ System.out.println("hello");
	}
	
	
	
	
	
	
	
	
	
	
}
	
