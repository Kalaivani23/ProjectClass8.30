/* QUESTION 1
----------
URL : https://www.flipkart.com/

NOTE: Search iphones 7 and click 1st phone and add it to cart.print the amount to be payable in the cart.
 */

package org.day10;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {

	public static void main(String[] args) throws InterruptedException {
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (String chld : child) {
			if(!chld.equals(main))
			{
				driver.switchTo().window(chld);
				js.executeScript("scroll(0,400)");
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				Thread.sleep(5000);
				WebElement pay = driver.findElement(By.xpath("//div[text()='Amount Payable']"));
				System.out.println(pay.getText());
			}
			}
		
	}

}
