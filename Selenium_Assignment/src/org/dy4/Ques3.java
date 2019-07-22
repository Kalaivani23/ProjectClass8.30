/* QUESTION 3
----------
URL : http://www.greenstechnologys.com/oracle-training.html 

NOTE: Print the first two paragraph */

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),Awarded )]"));
		System.out.println(txt.getText());
		WebElement txt1 = driver.findElement(By.xpath("//p[contains(text(),Rated)][2]"));
		System.out.println(txt1.getText());
		driver.close();
	}

}
