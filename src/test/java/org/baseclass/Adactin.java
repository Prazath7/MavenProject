package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin extends BaseClass {

          	public static void main(String[] args) throws IOException, InterruptedException {
				
          	
				browserLaunch();
				enterUrl("http://adactinhotelapp.com/SearchHotel.php");
          		
          		Login log=new Login();
          		entervalue(log.getTxtuser(), "PrasathP");
          		entervalue(log.getTxtpass(), "Prasath@2020");
          		clickbutton(log.getBtnlogin());
          		
          		SelectPage s=new SelectPage();
          		selectByIndex(s.getSlocation(), 3);
          		selectByVisibletext(s.getShotel(), "Hotel Sunshine");
          		selectByIndex(s.getSroomtype(), 2);
          		selectByVisibletext(s.getSroom(), "7 - Seven");
          		entervalue(s.getSdatepick(), excelData(1, 2));
          		entervalue(s.getSdateout(), excelData(1, 3));
                selectByIndex(s.getSadult(), 3);
	            selectByIndex(s.getSchild(), 2);
	            clickbutton(s.getSsubmit());
	
	             Hotels h=new Hotels();
	             clickbutton(h.getRadioclick());
	             clickbutton(h.getContinueclick());		 
	             
	             
	             Booking b=new Booking();
	             entervalue(b.getTxtfirstname(), excelData(1, 4));
	             entervalue(b.getTxtlastname(), excelData(1, 5));	 
	             entervalue(b.getTxtaddress(), excelData(1, 6));
	             entervalue(b.getTxtcc(), "1234567852314568");
	             selectByIndex(b.getDdncctype(), 3);
	             selectByIndex(b.getDdnmonth(), 12);
	             selectByIndex(b.getDdnyear(), 12);
	             entervalue(b.getTxtcvv(), excelData(1, 8));
	             clickbutton(b.getClickbook());
	             
	             
	             
	             Confirmation c=new Confirmation();
	             System.out.println("Booking id:");
	             Attribute(c.getGetOrderNo()); 
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	
}	
}
