package petsitcare_User_TestCases;

import org.testng.annotations.Test;
import petsitcare_User_PageObjects.Login_PO_01;
import petsitcare_User_PageObjects.Wallet_PO_12;
import petsitcare_user_base.User_base;

public class TC_12_wallet extends User_base {
	
	Login_PO_01 lg; 
	Wallet_PO_12 wt;

	@Test (priority=4)
	public void myservice() throws InterruptedException {
		 lg= new Login_PO_01(driver) ; 
		  lg.sign();
			lg.email("buyer.ncrypted@gmail.com");
			lg.password("123456");
			lg.signin();

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
	
	