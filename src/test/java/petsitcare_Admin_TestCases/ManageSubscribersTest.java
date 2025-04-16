package petsitcare_Admin_TestCases;



	import base.BaseClass;
import petsitcare_Admin_PageObjects.DashboardPage;
import petsitcare_Admin_PageObjects.LoginPage;
import petsitcare_Admin_PageObjects.SubscribersPage;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.Test;
	
	import utils.ScreenshotUtil;

	public class ManageSubscribersTest extends TC_01LOGIN {

	    @Test
	    public void testSubscribersActions() throws InterruptedException {
	        
	       super.ManageSubscribersTest();
	        

	        Thread.sleep(2000);
	        DashboardPage dashboard = new DashboardPage(driver);
	        dashboard.navigateToSubscribers();
	        dashboard.subscribersOption();
	        
	        SubscribersPage subscribers = new SubscribersPage(driver);

	        subscribers.clickHome();
	        
	        
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



