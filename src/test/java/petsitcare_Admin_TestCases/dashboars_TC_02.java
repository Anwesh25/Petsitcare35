package petsitcare_Admin_TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import petsitcare_Admin_PageObjects.Dashboard_PO_02;
import petsitcare_Admin_base.Base;

public class dashboars_TC_02 extends Base{
	@Test
	
	public void dashboard() throws IOException, InterruptedException {
		login_TC_01 lg=new login_TC_01();
		//login
		lg.login1();
		
		//clicking users link in dashboard page
		Dashboard_PO_02 db=new Dashboard_PO_02(driver);
		db.users();
		Thread.sleep(3000);
		String actual=driver.getTitle();
		String expected="Manage User - NCT Petsitcare";
		Assert.assertEquals(actual,expected);
		
		//going back to dashboard page 
		db.home();
		Thread.sleep(3000);
		
		//clicking service link in dashboard page
		db.services_list();
		Thread.sleep(3000);
		String actual1=driver.getTitle();
		String expected1="Manage Service - NCT Petsitcare";
		Assert.assertEquals(actual1,expected1);
		
		//going back to dashboard page 
		db.home();
		Thread.sleep(3000);
		
		//clicking earnings link in dashboard page
		db.earnings();
		Thread.sleep(3000);
		String actual2=driver.getTitle();
		String expected2="Manage Bookings - NCT Petsitcare";
		Assert.assertEquals(actual2,expected2);
		
		//going back to dashboard page 
		db.home();
		
		//selecting month and year in users graph and taking screenshot 
		WebElement users_graph=driver.findElement(By.xpath("//div[@data-report-type='users']"));
		db.users("November","2024");
		Thread.sleep(3000);
		screenshot(users_graph);
		
		//selecting month and year in booking graph and taking screenshot 
		WebElement booking_graph=driver.findElement(By.xpath("//div[@data-report-type='booking']"));
		db.booking("March", "2023");
		Thread.sleep(3000);
		screenshot(booking_graph);
		
		//selecting month and year in services graph and taking screenshot 
		WebElement service_graph=driver.findElement(By.xpath("//div[@data-report-type='service']"));
		db.service("August","2022");
		Thread.sleep(3000);
		screenshot(service_graph);
		
		//selecting month and year in completedservice graph and taking screenshot 
		WebElement completedservice_graph=driver.findElement(By.xpath("//div[@data-report-type='completedservice']"));
		db.completedservice("October", "2021");
		Thread.sleep(3000);
		screenshot(completedservice_graph);
		
	}

}
