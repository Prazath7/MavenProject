package org.baseclass;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testNG.BookingOptions;

public class JunitMainClasses extends BaseClass {

	@BeforeClass
	public static void browser() {
		browserLaunch();
		enterUrl("http://adactinhotelapp.com/");
		windowMaximize();
	}

	@Before
	public void implicitWait() {
		implicitWait(2000);

	}
	
	@Test
	public void Login() throws IOException {
		Login l=new Login();
		entervalue(l.getTxtuser(), excelData(1, 0));
		entervalue(l.getTxtpass(), excelData(1, 1));
		clickbutton(l.getBtnlogin());
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
}
