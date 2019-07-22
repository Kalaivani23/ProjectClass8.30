/* QUESTION 1
----------
URL : http://www.greenstechnologys.com/

NOTE: Take screenshot of homepage.
 */

package org.dy7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ques1 {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/");
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\gt.jpg");
		FileUtils.copyFile(src, des);

	}

}
