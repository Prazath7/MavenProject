package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotels extends BaseClass {

	public Hotels() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioclick;
	
	@FindBy(id="continue")
    private WebElement continueclick;

	public WebElement getRadioclick() {
		return radioclick;
	}

	public WebElement getContinueclick() {
		return continueclick;
	}
	
	
	
	
	
	
	
}
