/* QUESTION13
-----------
URL : https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp 

NOTE: Print all the input you given for registration.
 */

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fName = driver.findElement(By.id("firstName"));
		fName.sendKeys("chandan");
		WebElement lName = driver.findElement(By.id("lastName"));
		lName.sendKeys("patni");
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("cbp20");
		WebElement pwd = driver.findElement(By.name("Passwd"));
		pwd.sendKeys("chandanpwd");
		WebElement conf = driver.findElement(By.name("ConfirmPasswd"));
		conf.sendKeys("chandanpwd");
		System.out.println(fName.getAttribute("data-initial-value"));
		System.out.println(lName.getAttribute("data-initial-value"));
		System.out.println(uName.getAttribute("data-initial-value"));
		System.out.println(pwd.getAttribute("data-initial-value"));
		System.out.println(conf.getAttribute("data-initial-value"));
		driver.close();
	}

}
