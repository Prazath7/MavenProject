package org.baseclass;

import org.junit.Test;

public class JunitClass3 extends BaseClass {

	@Test

    public void hotel() {
	Hotels h=new Hotels();
	clickbutton(h.getRadioclick());
	clickbutton(h.getContinueclick());		

	}
	
	
	
}
