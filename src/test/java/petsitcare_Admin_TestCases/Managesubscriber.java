package petsitcare_Admin_TestCases;


	import petsitcare_Admin_PageObjects.DashboardMS;
	import petsitcare_Admin_PageObjects.subscribers;

	import petsitcare_Admin_base.Base;

	import java.io.IOException;

	import org.testng.annotations.Test;

		
		//import utils.ScreenshotUtil;


		public class Managesubscriber extends Base {
			@Test
		 public void testSubscribersActions() throws InterruptedException, IOException {
		       login lg=new login();
		    	lg.login1();

		        Thread.sleep(2000);
		        DashboardMS dashboard = new DashboardMS(driver);
		        dashboard.navigateToSubscribers();
		        dashboard.subscribersOption();
		        
		        subscribers subscribers = new subscribers(driver);

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


