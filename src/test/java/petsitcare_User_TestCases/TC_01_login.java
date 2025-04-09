package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import base.Baseclass;
import petsitcare_User_PageObjects.Login_PO_01;

public class TC_01_login extends Baseclass {
	
	@Test(priority=1)
	public void login() {
		
		Login_PO_01 lg=new Login_PO_01(driver);
		lg.sign();
		lg.email("buyer.ncrypted@gmail.com");
		lg.password("123456");
		lg.signin();
	}

}
