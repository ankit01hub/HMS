package TestNG;

import org.testng.annotations.Test;

public class Innovacation { 

	@Test(invocationCount=3,priority=3)
	void maven()
	{ System.out.println("this is manual");
	}
	@Test( invocationCount=2,priority=2)
	
	void java()
	{ System.out.println("this is manual");
	}
	
	@Test(priority=1,enabled=true)   // if i want this method is not be executed
	void test3()
	{ System.out.println("this is manual");  
	}
	
}
