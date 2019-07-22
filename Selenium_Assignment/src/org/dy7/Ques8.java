/* QUESTION 8
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: In testpaper click day 6 Take the Screenshot of 2 nd qns(program) use scrolldown
          */

package org.dy7;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tp = driver.findElement(By.xpath("//a[text()=' Day6_String']"));
		tp.click();
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		TakesScreenshot ss = (TakesScreenshot)driver;
		for (String chld : child) {
			if (!chld.equals(main)) {
				driver.switchTo().window(chld);
				js.executeScript("scroll(0,500)");
				File src = ss.getScreenshotAs(OutputType.FILE);
				File dst = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q8.jpg");
				FileUtils.copyFile(src, dst);
			}
		}
		driver.quit();
	}

}
