/* QUESTION 10
-----------
URL : https://www.amazon.in/

NOTE: Search motorolo and click 4 phone and  take the screenshot.
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
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Moto E5 Plus (B')]")).click();
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		TakesScreenshot ss = (TakesScreenshot)driver;
		for (String chld : child) {
			if(!chld.equals(main))
			{
				driver.switchTo().window(chld);
				File src = ss.getScreenshotAs(OutputType.FILE);
				File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q10.jpg");
				FileUtils.copyFile(src, des);
			}
		}
	}

}
