package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	void manual()
	{ System.out.println("this is manual");
	}
	@Test(priority=1)
	void automation()
	{ System.out.println("this is automation");
	}
	@Test(priority=5)
	void Api()
	{ System.out.println("this is mysql");
	}
	@Test(priority=4)
	void mysql()
	{ System.out.println("this is Api");
	}
	@Test(priority=2)
	void ankit()
	{ System.out.println("this is ankit");
	 }
	
}
	
	
	
	
	
	
	
	
	
	
		
	

