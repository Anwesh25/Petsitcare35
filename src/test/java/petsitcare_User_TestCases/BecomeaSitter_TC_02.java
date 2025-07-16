package petsitcare_User_TestCases;

import java.io.IOException;

import org.junit.Test;

import petsitcare_Admin_base.Base;
import petsitcare_User_PageObjects.BecomeaSitter_PO_02;

public class BecomeaSitter_TC_02 extends Base{
	BecomeaSitter_PO_02 BAS;
	
	@Test
	public void BecomeaSitter_TC_02() throws InterruptedException,IOException { 
		BAS= new BecomeaSitter_PO_02(driver);
		BAS.BecomeaSitter();
		BAS.Firstname("srikanth");
		BAS.Lastname("kondrapally");
		BAS.Email("srikanth@gmail.com");
		BAS.password("srikanth@123");
		BAS.cpassword("srikanth@123");
		BAS.captcha();
		BAS.signup();
	
	}
	}

