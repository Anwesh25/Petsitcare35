package petsitcare_Admin_TestCases;



	
import petsitcare_Admin_PageObjects.DashboardPage;
import petsitcare_Admin_PageObjects.SubscribersPage;

import petsitcare_Admin_base.Base;

import java.io.IOException;

import org.testng.annotations.Test;

	
	//import utils.ScreenshotUtil;


	public class ManageSubscribersTest extends Base {
		@Test
	 public void testSubscribersActions() throws InterruptedException, IOException {
	       login lg=new login();
	    	lg.login1();

	        Thread.sleep(2000);
	        DashboardPage dashboard = new DashboardPage(driver);
	        dashboard.navigateToSubscribers();
	        dashboard.subscribersOption();
	        
	        SubscribersPage subscribers = new SubscribersPage(driver);

	        subscribers.clickHome();
	        dashboard.navigateToSubscribers();
	        dashboard.subscribersOption();
	        
	        
	        
	        Thread.sleep(3000);
	        subscribers.selectRecords("50");
	        
	        Thread.sleep(3000);
	        subscribers.clickExcel();
	        
	        Thread.sleep(3000);
	        subscribers.searchSubscriber("sunil");
	       

	        Thread.sleep(3000);
	        subscribers.deleteSubscriber();
	        
	        Thread.sleep(3000);
	        // Optionally confirm delete too
	         subscribers.confirmDelete();

	    }
	}



