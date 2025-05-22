package petsitcare_Admin_base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {

	public static WebDriver driver;
	
	@BeforeClass
	public void openurl() {
		
		driver= new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/petsitcare/admin-nct/modules-nct/login-nct/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	//@AfterClass
	//public void closeurl() {
		//driver.close();
	
	@AfterSuite
	public void tearDownSuite() {
	    if (driver != null) {
	        driver.quit(); // this will close the browser once entire suite is done
	    }
	}

	
	
	public void screenshot(WebElement ele) throws IOException {
	
		if(ele==null) {
		String timestamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		TakesScreenshot sc=(TakesScreenshot)driver;
		File sourcefile=sc.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"\\screenshots\\"+timestamp+".png");
		FileUtils.copyFile(sourcefile, destination);
	}else {
		
		String timestamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		TakesScreenshot sc=(TakesScreenshot)driver;
		File sourcefile=ele.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"\\screenshots\\"+timestamp+".png");
		FileUtils.copyFile(sourcefile, destination);
	}
	}

}
