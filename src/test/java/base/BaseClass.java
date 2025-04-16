package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

public static WebDriver driver;

@BeforeSuite
public void openurl() {
	
	driver= new ChromeDriver();
	driver.get("https://products.ncryptedprojects.com/petsitcare/admin-nct/modules-nct/login-nct/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@AfterClass
public void closeurl() {
	driver.close();
}


public void screenshot() throws IOException {
	
	String timestamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new java.util.Date(0, 0, 0, 0, 0, 0));
	TakesScreenshot sc=(TakesScreenshot)driver;
	File sourcefile=sc.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\R.K COMPUTERS\\git\\Petsitcare35\\screenshots\\"+timestamp+".png");
	FileUtils.copyFile(sourcefile, destination);
	
}


}

