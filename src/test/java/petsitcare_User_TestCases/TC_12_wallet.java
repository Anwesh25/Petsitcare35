package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Wallet_PO_12;
import petsitcare_user_base.User_base;

public class TC_12_wallet extends User_base {
	
    LoginPage_PO_01 login; 
	Wallet_PO_12 wt;

	@Test (priority=4)
	 public void validLoginTest() throws InterruptedException {
        login = new LoginPage_PO_01(driver);
        login.signin();
        login.username("buyer.ncrypted@gmail.com");
        login.password("123456");
        login.login();
        
        
		 wt= new Wallet_PO_12(driver);
		 wt.wallett();
		 wt.history();
		 wt.deletet();
		 wt.redeemrequest();
		 wt.request("20");
		 wt.submit("cancel");
		 wt.payment();
	     	
	}
}
	
	