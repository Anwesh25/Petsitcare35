package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_Admin_TestCases.login;
import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_base.Base;

public class Login_TC_01 extends Base{
	@Test
	public void Login() {
		
		LoginPage_PO_01 login= new LoginPage_PO_01 (driver);
		login.signin();
		login.username("buyer.ncrypted@gmail.com");
		login.password("123456");
		login.login();
}
}


