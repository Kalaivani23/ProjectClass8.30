/* QUESTION 6
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Take the screenshot of Best Selenium training institute in Adayar use scrolldown to go to bottom of webpage.
 */

package org.dy7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement inst = driver.findElement(By.xpath("//h2[contains(text(),'in Adyar')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		TakesScreenshot ss = (TakesScreenshot)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", inst);
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q6.jpg");
		FileUtils.copyFile(src, des);
		driver.close();
	}
}