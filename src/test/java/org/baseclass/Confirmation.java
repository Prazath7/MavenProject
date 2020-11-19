package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation extends BaseClass {

	public Confirmation() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_no")
	private WebElement getOrderNo;


	public WebElement getGetOrderNo() {
		return getOrderNo;
	}


	public void setGetOrderNo(WebElement getOrderNo) {
		this.getOrderNo = getOrderNo;
	}


	
	
	
}
