/* QUESTION  11
------------
URL : http://www.adactin.com/HotelApp/ 

NOTE: Print the UserName and Password that you are entered.
 */

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("username");
		System.out.println(user.getAttribute("value"));
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("password");
		System.out.println(pwd.getAttribute("value"));
		driver.close();
	}

}
