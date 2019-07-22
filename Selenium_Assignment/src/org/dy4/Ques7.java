/* QUESTION 7
----------
URL : https://www.facebook.com/ 

NOTE: Print the email and password you are given.
*/

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("chandan@gmail.com");
		System.out.println(user.getAttribute("value"));		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("pwd@123");
		System.out.println(pwd.getAttribute("value"));		
		driver.close();
	}

}
