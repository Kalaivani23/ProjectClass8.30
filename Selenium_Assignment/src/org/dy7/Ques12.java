/* QUESTION 12
-----------
URL : https://www.snapdeal.com/

NOTE: search HP laptop and take the screenshot of it.
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

public class Ques12 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("HP Laptop");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'HP 14s')]")).click();
		TakesScreenshot ss = (TakesScreenshot)driver;
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String chld : child) {
			if(!chld.equals(main))
			{
				driver.switchTo().window(chld);
				File src = ss.getScreenshotAs(OutputType.FILE);
				File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q12.jpg");
				FileUtils.copyFile(src, des);
			}
		}
		driver.quit();
	}

}
