package org.baseclass;

import java.io.IOException;

import org.junit.Test;

public class JunitClass4 extends BaseClass {

	@Test
	public void booking() throws IOException {
	
		Booking b=new Booking();
		entervalue(b.getTxtfirstname(), excelData(1, 4));
		entervalue(b.getTxtlastname(), excelData(1, 5));
		entervalue(b.getTxtaddress(), excelData(1, 6));
		entervalue(b.getTxtcc(), excelData(1, 7));
		
        selectByIndex(b.getDdnmonth(), 5);
		selectByIndex(b.getDdnyear(), 11);
		entervalue(b.getTxtcvv(), excelData(1, 8));
		clickbutton(b.getClickbook());
		
		String attribute = b.getGetOrderNo().getAttribute("value");
		System.out.println("Booking id:"+ attribute);
	}
	
	 
	
	
}
