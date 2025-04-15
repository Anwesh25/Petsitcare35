package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
public static WebDriver driver;
	
	@BeforeSuite
	public void openurl() {
		driver= new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/petsitcare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void closeurl() {
		driver.close();
	}

    public String screenshot(String testname) throws IOException {
		
		String timestamp= new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String destination= System.getProperty("user.dir")+"\\screenshots\\"+timestamp+"_"+testname+"_img.png";
		try {
		FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
			e.getStackTrace();
		}
		return destination;
	}


	
	}


