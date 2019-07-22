/* QUESTION  9
------------
URL : https://www.flipkart.com/

NOTE: Search iphone and click 1st  phone and take the screenshot.
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

public class Ques9 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement iphn = driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		iphn.sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone X (Space Gray, 64')]")).click();
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		TakesScreenshot ss = (TakesScreenshot)driver;
		for (String chld : child) {
			if(!chld.equals(main))
			{
				driver.switchTo().window(chld);
				File src = ss.getScreenshotAs(OutputType.FILE);
				File des = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q9.jpg");
				FileUtils.copyFile(src, des);
			}
		}
	}
}
