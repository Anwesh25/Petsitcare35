package petsitcare_Admin_TestCases;

import org.testng.annotations.Test;

import base.BaseClass;
import petsitcare_Admin_PageObjects.DashboardPage;
import petsitcare_Admin_PageObjects.LoginPage;
import petsitcare_Admin_PageObjects.SubscribersPage;

import utils.ScreenshotUtil;

public class TC_01LOGIN extends BaseClass {
	@Test
	 public void ManageSubscribersTest() throws InterruptedException {
	        
	       
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.username("admin");
	        loginPage.password("admin123");
	        loginPage.login();
	        
	        
	        DashboardPage dashboard = new DashboardPage(driver);
	        dashboard.navigateToSubscribers();
	        dashboard.subscribersOption();
	        
	        SubscribersPage subscribers = new SubscribersPage(driver);

	        subscribers.clickHome();
	        dashboard.navigateToSubscribers();
	        dashboard.subscribersOption();
	       
	        Thread.sleep(1000);
	        subscribers.selectRecords("25");
	        
	        
	        Thread.sleep(1000);
	        subscribers.clickExcel();
	       	        
	        Thread.sleep(1000);
	        subscribers.searchSubscriber("Vinesh");
	        
	        
	        Thread.sleep(1000);
	        subscribers.deleteSubscriber();
	        
	        
	        
	     // Optionally confirm delete too
	        // subscribers.confirmDelete();

	       
	    }
	        
	 }


