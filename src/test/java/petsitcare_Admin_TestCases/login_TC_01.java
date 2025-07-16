package petsitcare_Admin_TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import petsitcare_Admin_PageObjects.login_po_01;
import petsitcare_Admin_base.Base;
import utils.XLUtils;

public class login_TC_01 extends Base{
	
	@Test(priority = 1)
	public void login1() throws IOException, InterruptedException {
		
		login_po_01 Db=new login_po_01(driver);
		
		String path1=System.getProperty("user.dir");
		String path2="\\excel\\Book1.xlsx";
		String file=path1+path2;
		
		System.out.println(file);
		 //String file= "C:\\Users\\NISHITH\\git\\Petsitcare35\\excel\\Book1.xlsx";
	    // String file= "System.getProperty(\"user.dir\")+\"\\\\excel\\\\\"+\"Book1.xlsx\"";
		  int xlrow=XLUtils.getRowCount(file, "Sheet1");
		
		  for(int r=1;r<=xlrow;r++) {
			  
		 String user1= XLUtils.getCellData(file, "Sheet1", r, 1);
		 String psw1  =  XLUtils.getCellData(file, "Sheet1", r, 2);
		 Db.username(user1);
		 Db.password(psw1);
		 Db.login();
		 
		 
		 String actitle=driver.getTitle();
			System.out.println(actitle);
			String exptitle="Welcome to Admin Panel - NCT Petsitcare";
			
			if(actitle.equals(exptitle)) {
				System.out.println("login  Passed,  vaid credentials ");
				screenshot(null);
				
				Thread.sleep(3000);
				
				WebElement username=driver.findElement(By.xpath("//li[@class='dropdown user']"));
				Actions ac=new Actions(driver);
				ac.moveToElement(username).perform();
				
				Thread.sleep(3000);
				if(r!=xlrow) {
				
			//WebElement logout=driver.findElement(By.xpath("(//i[@class='fa fa-key'])[1]"));
		    WebElement logout=driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[2]/a"));
			ac.moveToElement(logout).perform();
			ac.click(logout).perform();
				}
			Thread.sleep(3000);
			//logout.click();
						
			}else {
				System.out.println("login failed, invalid credentials "+user1+" ,  "+psw1);
				
			}
		  }
	}
	
	
}
