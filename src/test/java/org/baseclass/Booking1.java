package org.baseclass;

import java.io.IOException;

import org.junit.Test;

public class Booking1 extends BaseClass {

	@Test
	public void bookin() throws IOException {
	
			SelectPage s=new SelectPage();
			selectByIndex(s.getSlocation(), 3);
			selectByIndex(s.getShotel(), 2);
			selectByIndex(s.getSroomtype(), 4);
			selectByIndex(s.getSroom(), 2);
			entervalue(s.getSdatepick(), excelData(1, 2));
			entervalue(s.getSdatepick(), excelData(1, 3));
			selectByIndex(s.getSadult(), 2);
			selectByIndex(s.getSchild(), 2);
            clickbutton(s.getSsubmit());
		}
	}


	
