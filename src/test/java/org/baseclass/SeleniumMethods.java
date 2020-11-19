package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethods extends BaseClass {

	public static void main(String[] args) {
		browserLaunch();
		
		enterUrl("https://www.facebook.com/");
		
		WebElement txtuser = driver.findElement(By.id("email"));
		entervalue(txtuser, "hii java");
		
		WebElement btnclick = driver.findElement(By.id("u_0_2"));
		clickbutton(btnclick);
		
		
		
		
		
		
		
		
		
		
		
	}
	    
	            
	
	
}
