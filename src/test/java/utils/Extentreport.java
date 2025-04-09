package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

	public class Extentreport implements ITestListener {
		
		public ExtentSparkReporter sparkreporter;
		public ExtentReports reports;
		public ExtentTest test;
		
		 public void onStart(ITestContext context) {
			   
			 sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\extentsreports\\"+"Report1.html");
			 
			 sparkreporter.config().setDocumentTitle("Testing..");
			 
			 sparkreporter.config().setReportName("smoke test report");
			 
			 sparkreporter.config().setTheme(Theme.STANDARD);
			 
			 reports=new ExtentReports();
			 
			 reports.attachReporter(sparkreporter);
			 
			 reports.setSystemInfo("environment", "qa");
			 
			 reports.setSystemInfo("tester name","srikanth");
			 
			  }
		
		 public void onTestSuccess(ITestResult result) {
		
			 test=reports.createTest(result.getName());
			 test.log(Status.PASS, "test is passed"+"_"+ result.getName());
			  
		 }
		 public void onTestFailure(ITestResult result) {
			 test=reports.createTest(result.getName());
			 test.log(Status.FAIL,"test is failed"+"_"+ result.getName());
			 test.log(Status.FAIL, result.getThrowable());
			  
				    }
		 public void onTestSkipped(ITestResult result) {
			 test=reports.createTest(result.getName());
			 test.log(Status.SKIP, "test is skiped" +"_"+ result.getName());
			 test.log(Status.SKIP, result.getThrowable());
			  }
		 public void onFinish(ITestContext context) {
			  reports.flush();
			  }

		

	}



