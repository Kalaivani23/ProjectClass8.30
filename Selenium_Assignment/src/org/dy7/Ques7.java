/* QUESTION 7
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Click HTC global services take the screenshot of first 10 questions.
 */

package org.dy7;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		WebElement htc = driver.findElement(By.xpath("//a[text()='HTC global services']"));
		htc.click();
		TakesScreenshot ss = (TakesScreenshot)driver;
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String cld : child) {
			if (!cld.equals(main)) {
				driver.switchTo().window(cld);
				Thread.sleep(10000);
				File src = ss.getScreenshotAs(OutputType.FILE);
				File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q7.jpg");
				FileUtils.copyFile(src, des);
			}
		}
		driver.quit();
	}

}
