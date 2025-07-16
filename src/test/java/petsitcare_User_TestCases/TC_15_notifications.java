package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Notifications_PO_15;
import petsitcare_user_base.User_base;
	
	public class TC_15_notifications extends User_base {

	    
	    Notifications_PO_15 n;
		
		@Test(priority=7)
		 public void validLoginTest() throws InterruptedException {
			TC_14_Recivedservice rs=new TC_14_Recivedservice();
			rs.validLoginTest();
			
	        
	        n=new Notifications_PO_15(driver);
	        n.Notification();
	        n.acceptrequest();
	        n.rejectrequest();
	        n.acceptservice();
	        n.servicebooked();
	        n.wallet();
	        n.servicesomplete();
	        n.closeservice();
	        n.passwordchange();
	        n.sendmsg();
	        n.service();
	        n.makepayment();
	        n.cancel();
	        n.rating();
	        n.added();
	        n.adminaccept();
	        n.password();
	        
	        

}
	}
