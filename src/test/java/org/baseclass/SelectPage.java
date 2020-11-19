package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {

	
	 public SelectPage() {

PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement slocation;
	
	@FindBy(id="hotels")
	private WebElement shotel;
	
	@FindBy(id="room_type")
	private WebElement sroomtype;
	
	@FindBy(id="room_nos")
	private WebElement sroom;
	
	@FindBy(id="datepick_in")
	private WebElement sdatepick;
	
	@FindBy(id="datepick_out")
	private WebElement sdateout;
	
	@FindBy(id="adult_room")
	private WebElement sadult;
	
	@FindBy(id="child_room")
	private WebElement schild;
	
	@FindBy(id="Submit")
	private WebElement ssubmit;

	public WebElement getSlocation() {
		return slocation;
	}

	public WebElement getShotel() {
		return shotel;
	}

	public WebElement getSroomtype() {
		return sroomtype;
	}

	public WebElement getSroom() {
		return sroom;
	}

	public WebElement getSdatepick() {
		return sdatepick;
	}

	public WebElement getSdateout() {
		return sdateout;
	}

	public WebElement getSadult() {
		return sadult;
	}

	public WebElement getSchild() {
		return schild;
	}

	public WebElement getSsubmit() {
		return ssubmit;
	}
	
	
	
}
