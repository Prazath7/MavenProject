package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	// 1
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\MavenProject\\driver\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	// 2
	public static void enterUrl(String data) {
		driver.get(data);
	}

	// 3
	public static void entervalue(WebElement element, String i) {
		element.sendKeys(i);
	}

	// 4
	public static void clickbutton(WebElement element1) {
		element1.click();

	}

	// 5
	public static void Attribute(WebElement element) {
		String st = element.getAttribute("value");
		System.out.println(st);
		
	}

	// 6
	public static void getText(WebElement element1, String Value) {
		element1.getText();
	}

	// 7
	public static void rightClick(WebElement element2) {
		Actions ac = new Actions(driver);
		ac.contextClick(element2).perform();
	}

	// 8
	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	// 9
	public static void moveToElements(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	// 10
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2).perform();
	}

	// 11
	public static void simpleAlert(WebElement element) {
		element.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 12
	public static void confirmAlert(WebElement element) {
		element.click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	// 13
	public static void promptAlert(WebElement element, String Value) {
		element.click();
		Alert a = driver.switchTo().alert();
		element.sendKeys(Value);
		a.accept();
	}

	// 14
	public static void selectByValue(WebElement element, String data) {
		Select se = new Select(element);
		se.selectByValue(data);
	}

	// 15
	public static void selectByVisibletext(WebElement element, String data) {
		Select se = new Select(element);
		se.selectByVisibleText(data);
	}

	// 16
	public static void selectByIndex(WebElement element, int string) {
		Select se = new Select(element);
		se.selectByIndex(string);
	}

	// 17
	public static void getOptions(WebElement element) {
		Select se = new Select(element);
		se.getOptions();
	}

	// 18
	public static void getAllSelectedOptions(WebElement element) {
		Select se = new Select(element);
		List<WebElement> op = se.getOptions();
		for (int i = 0; i < op.size(); i++) {
			System.out.println(i);
		}
	}

	// 19
	public static void getFirstSelectedOptions(WebElement element) {
		Select se = new Select(element);
		se.getFirstSelectedOption();
	}

	// 20
	public static void isMultiple(WebElement element) {
		Select se = new Select(element);
		se.isMultiple();
	}

	// 21
	public static void deSelectByIndex(WebElement element, int data) {
		Select se = new Select(element);
		se.deselectByIndex(data);
	}

	// 22
	public static void deselectByValue(WebElement element, String data) {
		Select se = new Select(element);
		se.deselectByValue(data);
	}

	// 23
	public static void deselectByVisibletext(WebElement element, String data) {
		Select se = new Select(element);
		se.deselectByVisibleText(data);
	}

	// 24
	public static void deSelectAll(WebElement element) {
		Select se = new Select(element);
		se.deselectAll();
	}

	// 25
	public static void getScreenShot() throws IOException {
		TakesScreenshot tks = (TakesScreenshot) driver;
		File s = tks.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Prasath");
		FileUtils.copyFile(s, d);
	}

	// 26
	public static void printSelectedfropdownoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for (WebElement ref : alloptions) {
			String text = ref.getText();
			System.out.println(text);
		}
	}

	// 27
	public static void scrollUP(WebElement element) {
		JavascriptExecutor jks = (JavascriptExecutor) driver;
		jks.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 28
	public static void scrollDown(WebElement element) {
		JavascriptExecutor jks = (JavascriptExecutor) driver;
		jks.executeScript("arguments[0}.scrollIntoView(false)", element);
	}

	// 29
	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor jks = (JavascriptExecutor) driver;
		jks.executeScript("arguments[0}.click()", element);
	}

	// 30
	public static void frameID(String id) {
		driver.switchTo().frame(id);
	}

	// 31
	public static void frameName(String name) {
		driver.switchTo().frame(name);
	}

	// 32
	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// 33
	public static void frmaeIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 34
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}

	// 35
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 36
	public static void navigateUrl(String data) {
		driver.navigate().to(data);
	}

	// 37
	public static void navigateRferesh() {
		driver.navigate().refresh();
	}

	// 38
	public static void forward() {
		driver.navigate().forward();
	}

	// 39
	public static void back() {
		driver.navigate().back();
	}

	// 40
	public static void submit(WebElement element) {
		element.submit();
	}

	// 41
	public static void getTagName(WebElement element) {
		String tg = element.getTagName();
		System.out.println(tg);
	}

	// 42
	public static void clear(WebElement element) {
		element.clear();
	}

	// 43
	public static void radioClick(WebElement element) {
		element.click();
	}

	// 44
	public static void threadSleep() throws InterruptedException {
		Thread.sleep(4000);
	}

	// 45
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	// 46
	public static void quit() {
		driver.quit();
	}

	// 47
	public static void close() {
		driver.close();
	}

	// 48
	public static void pageSource() {
		String ps = driver.getPageSource();
		System.out.println(ps);
	}

	// 49
	public static void keyDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// 50
	public static void keyEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 51
	public static void tab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// 52
	public static void controlKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 53
	public static void controlCut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 54
	public static void controlPaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
	}

	// 55
	public static void delay(int seconds) throws AWTException {
		Robot r = new Robot();
		r.delay(seconds);
	}

	// 56
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	// 57
	public static void printWindowId() {
		String wc = driver.getWindowHandle();
		System.out.println(wc);
	}

	// 58
	public static void allWindowId() {
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh);
	}

	// 59
	public static void childWindow() {
		String parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String s : childwindow) {
			if (!parentwindow.equals(s)) {
				driver.switchTo().window(s);
			}
		}
	}

	// 60
	public static void upperCase(WebElement element) {
		Actions ac = new Actions(driver);
		ac.keyDown(element, Keys.SHIFT).sendKeys(element, "text").keyUp(element, Keys.SHIFT).perform();

	}

	
	
	public static void selectById(WebElement element, int value) {
		Select s=new Select(element);
		s.selectByIndex(value);

	}
	
	//61
	public static String excelData(int rowNo, int columnNo) throws IOException {
		
		File f=new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\Excel.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook wb= new XSSFWorkbook(stream);
		
		Sheet sh = wb.getSheet("Sheet1");
		
        Row row = sh.getRow(rowNo);
        
        Cell c = row.getCell(columnNo);
        String value="";
        
        int ct = c.getCellType();
        
        if (ct==1) {
        	value = c.getStringCellValue();
			
        }else if (DateUtil.isCellDateFormatted(c)) {
			Date dcv = c.getDateCellValue();	
        	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
        	value = sdf.format(dcv);
        	
			}
        else {
			double ncv = c.getNumericCellValue();
        	long l=(long) ncv;
        	String valueOf = String.valueOf(l);
        	
        	
		}
		return value;
        	
        	
		}
	
	
	
	
	
	
	

	
	
	
	
	
	
}