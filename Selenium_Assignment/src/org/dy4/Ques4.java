/* QUESTION 4
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html 

NOTE: Print the paragraph displayed below testimonial.
  */

package org.dy4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		WebElement dwn= driver.findElement(By.xpath("//div[@id=\"box-wrapper\"]/div[2]"));
	WebElement rev= driver.findElement(By.xpath("//div[contains(@id,'box-wrapper')]"));
			System.out.println(rev.getText());
			scroll.executeScript("arguments[0].scrollIntoView(true)",dwn);
			WebElement rev1= driver.findElement(By.xpath("//div[@id=\"box-wrapper\"]/div[2]"));
			System.out.println(rev1.getText());
			WebElement rev3= driver.findElement(By.xpath("//div[@id=\"box-wrapper\"]/div[3]"));
			System.out.println(rev3.getText());
	driver.close();
		

	}

}
