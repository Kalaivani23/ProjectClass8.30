/* QUESTION 2
----------
URL : http://toolsqa.com/

NOTE: Go to down of the webpage using scrolldown.
 */

package org.dy7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dwn = driver.findElement(By.xpath("//a[text()='About Us']"));
		js.executeScript("arguments[0].scrollIntoView(true)", dwn);
		driver.close();
	}

}
