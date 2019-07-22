/* QUESTION 8
----------
URL : http://www.google.com/

NOTE: Search greens velmurugan and click the 1st link.
 */

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("// input[@name='q']")).sendKeys("greens velmurugan");
		driver.findElement(By.xpath("(// input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'http://www.greenstec')]")).click();
		driver.close();
	}

}
