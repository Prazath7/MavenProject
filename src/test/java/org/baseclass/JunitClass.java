package org.baseclass;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitClass extends BaseClass{
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch();
		enterUrl("http://adactinhotelapp.com/");
        windowMaximize();
 	}
	
	@Before
	public void implicitwait() {
		implicitWait(2000);
	}
	

	@Test
	public void logIn() throws IOException {
	
		WebElement txtuser = driver.findElement(By.id("username"));
		entervalue(txtuser, "PrasathP");
		WebElement txtpass = driver.findElement(By.id("password"));
		entervalue(txtpass, excelData(1, 1));
		WebElement btnlogin = driver.findElement(By.id("login"));
		clickbutton(btnlogin);
		WebElement ddn1 = driver.findElement(By.id("location"));
		selectByIndex(ddn1, 2);		
		WebElement ddn2 = driver.findElement(By.id("hotels"));
		selectByIndex(ddn2, 3);
		WebElement ddn3 = driver.findElement(By.id("room_type"));
		selectByIndex(ddn3, 4);
		WebElement ddn4 = driver.findElement(By.id("room_type"));
		selectByIndex(ddn4, 3);
		WebElement ddn5 = driver.findElement(By.id("room_nos"));
		selectByIndex(ddn5, 2);
		WebElement inDate = driver.findElement(By.id("datepick_in"));
		entervalue(inDate, "30/11/2020");
		WebElement outDate = driver.findElement(By.id("datepick_out"));
		entervalue(outDate, "01/11/2020");
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectByIndex(adult, 2);
		WebElement child = driver.findElement(By.id("child_room"));
		selectByIndex(child, 3);
		WebElement search = driver.findElement(By.id("Submit"));
		clickbutton(search);
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		clickbutton(radiobtn);
		WebElement search2 = driver.findElement(By.id("continue"));
		clickbutton(search2);
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		entervalue(txtfirstname, "Prasath ");
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		entervalue(txtlastname, "Anrsp");
		WebElement address = driver.findElement(By.id("address"));
		entervalue(address, "Chennai");
		
		Booking b=new Booking();
		entervalue(b.getTxtcc(), excelData(1, 7));
		selectByIndex(b.getDdncctype(), 3);
		selectByIndex(b.getDdnmonth(), 12);
		selectByIndex(b.getDdnyear(), 12);
		entervalue(b.getTxtcvv(), excelData(1, 8));
		clickbutton(b.getClickbook());
		WebElement attri = driver.findElement(By.id("order_no"));
		Attribute(attri);
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
