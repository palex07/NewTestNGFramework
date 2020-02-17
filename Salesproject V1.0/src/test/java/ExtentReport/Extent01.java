package ExtentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent01 {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	
	public void setReport() 
	{
		htmlReporter =new ExtentHtmlReporter("./Reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("TestNG Framework Autoamtion Report");
		htmlReporter.config().setReportName("Autoamtion Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester","Prasanth Alex");
	}

	@AfterTest
	
	public void endReport()
	{
		extent.flush();
	}
	
	@Test
	
	public void doLogin()
	{
		test=extent.createTest("Logn Test");
		
		System.out.println("Login test done");
		
	}
	
@Test
	
	public void Regression()
	{
		test=extent.createTest("Regression Test	");
		Assert.fail(" Regression failed");
		
	}
@Test

public void Isskip()
{
	test=extent.createTest("Skipping Test");
	throw new  SkipException ("Skipping the TC");
	
	}

@AfterMethod
public void tearDown(ITestResult Result) 
{
if (Result.getStatus()==ITestResult.FAILURE)
{
	
}else if(Result.getStatus()==ITestResult.SKIP)

{
	
}else if(Result.getStatus()==ITestResult.SUCCESS) {
	
}

}}

	




