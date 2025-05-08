package petsitcare_User_TestCases;

import org.testng.annotations.Test;
import petsitcare_User_PageObjects.Login_PO_01;
import petsitcare_user_base.User_base;

public class Login_TC_01 extends User_base {
	Login_PO_01 lg; 


	@Test (priority=1)
	public void myservice() throws InterruptedException {
		 lg= new Login_PO_01(driver) ; 
		  lg.sign();
			lg.email("buyer.ncrypted@gmail.com");
			lg.password("123456");
			lg.signin();

	}
}

