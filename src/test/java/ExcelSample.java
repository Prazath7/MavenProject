import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\Excel.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook wb= new XSSFWorkbook(stream);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row row = sh.getRow(3);
		Cell cell = row.getCell(5);
		
		String scv = cell.getStringCellValue();
		System.out.println(scv);
		
		if (scv.equals("Malayalam, English")) {
			cell.setCellValue("Tamil");
		
		}
		
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		System.out.println("done");
		
	}

}
