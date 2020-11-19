package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass{
       
	       public Booking() {
		PageFactory.initElements(driver, this);
	       }
	
	@FindBy(id="first_name")
	private WebElement txtfirstname;       
	       
	@FindBy(id="last_name")
	private WebElement txtlastname;        
	       
	@FindBy(id="address")
	private WebElement txtaddress; 
	
	@FindBy(id="cc_num")
	private WebElement txtcc; 
	
	@FindBy(id="cc_type")
	private WebElement ddncctype; 
	
	@FindBy(id="cc_exp_month")
	private WebElement ddnmonth; 

	@FindBy(id="cc_exp_year")
	private WebElement ddnyear; 

	@FindBy(id="cc_cvv")
	private WebElement txtcvv; 

    @FindBy(id="book_now")
	private WebElement clickbook;
    
    @FindBy(id="order_no")
	private WebElement getOrderNo;

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcc() {
		return txtcc;
	}

	public WebElement getDdncctype() {
		return ddncctype;
	}

	public WebElement getDdnmonth() {
		return ddnmonth;
	}

	public WebElement getDdnyear() {
		return ddnyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getClickbook() {
		return clickbook;
	}
	
	public WebElement getGetOrderNo() {
		return getOrderNo;
	}
	
	
}
