/* QUESTION 16
-----------
URL : https://www.shopclues.com/wholesale.html 

NOTE: Add any fasttrack watch to cart 
      Print the cost in cart . */

package org.dy4;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement item = driver.findElement(By.xpath("(//span[@class='prod_name'])[2]"));
		item.click();
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String chld : child) {
			driver.switchTo().window(chld);
			if(!chld.equals(main))
			{
				driver.findElement(By.id("add_cart")).click();
				driver.findElement(By.xpath("//a[@href='https://secure.shopclues.com/atom/acart/getcart']")).click();
				WebElement gt=driver.findElement(By.xpath("//p[text()='Grand Total']"));
				System.out.println(gt.getText());
			}
		}
		driver.close();
	}

}
