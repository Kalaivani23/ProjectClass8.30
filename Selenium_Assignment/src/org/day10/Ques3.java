/* QUESTION 3
----------
URL : https://www.snapdeal.com/ 

NOTE: Search iphones 7 and click 1st phone and add it to cart.print the you pay cost displayed.
 */

package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iPhone 7");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//p[@class='product-title ']")).click();
		String main = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String chld : child) {
			if(!chld.equals(main))
			{
				driver.switchTo().window(chld);
				driver.findElement(By.xpath("//span[text()='add to cart']")).click();
				WebElement pay = driver.findElement(By.xpath("//div[text()='You Pay: ']"));
				System.out.println(pay.getText());
			}
		}
	}

}
