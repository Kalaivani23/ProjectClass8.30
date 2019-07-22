/* QUESTION 15
-----------
URL : https://www.flipkart.com/ 

NOTE: Click login/signup and give the details and press submit.
      Print the details you are given.
 */

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("9876543210");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("password");
		System.out.println(user.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.close();

	}

}
