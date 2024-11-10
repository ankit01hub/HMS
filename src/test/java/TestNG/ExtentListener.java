package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ExtentListener  implements ITestListener  {
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest Test;
	@BeforeClass
	public void configurReport()
	{ htmlReporter=new ExtentSparkReporter("Extent Report.html");
	reports=new ExtentReports();
	reports.attachReporter(htmlReporter); 
	// system information
	reports.setSystemInfo("machine","Linux");
	reports.setSystemInfo("name","ankit");
	//change the look and feel
	htmlReporter.config().setDocumentTitle("Extent Report");
	htmlReporter.config().setTheme(Theme.DARK);
	
	
	}
	@Override
	public void onTestStart(ITestResult result) {

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
Test=	reports.createTest(result.getName());
Test.log(Status.PASS, MarkupHelper.createLabel("name of method pass"+result.getName(),ExtentColor.GREEN));
		
				
	}

	@Override
	public void onTestFailure(ITestResult result) {

		Test=	reports.createTest(result.getName());
		Test.log(Status.FAIL, MarkupHelper.createLabel("name of method pass"+result.getName(),ExtentColor.RED));
				
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		configurReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	  
		
	}
	
	

	

}
