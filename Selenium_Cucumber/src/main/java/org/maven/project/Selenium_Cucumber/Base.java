package org.maven.project.Selenium_Cucumber;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Base {
	static Select sel;
	static WebDriver driver;
	
	public static void Launch() {
		
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://adactin.com/HotelApp/index.php");
	}
		
		public static void click(WebElement c) {
			c.click();
		}
		public static void type(WebElement e, String s)
		{
			e.sendKeys(s);
		}
		
		public static void clear(WebElement c) {
			c.clear();
		}
		public static String get(WebElement e)
		{
			String text = e.getAttribute("value");
			return text;
		}
		public static String getList(List<WebElement> e)
		{
			String list = e.get(0).getAttribute("value");
			return list;
		}
		public static void screenShot() throws IOException {
			TakesScreenshot ss = (TakesScreenshot)driver;
			File src = ss.getScreenshotAs(OutputType.FILE);
			File des = new File("D:\\Selenium_Ques\\Selenium_Cucumber\\ScreenShot\\itinary.jpeg");
			FileUtils.copyFile(src, des);
		}
		
		public static void dropDown(WebElement e, String s)
		{
			sel = new Select(e);
			sel.selectByVisibleText(s);
		}
		public static void close() {
			driver.close();
		}
		
	}
