/* QUESTION 1
----------
URL : http://www.greenstechnologys.com 

NOTE: Print Greens Overall review text at the last.
 */

package org.dy4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/");
		JavascriptExecutor scroll = ((JavascriptExecutor)driver);
		scroll.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("(//p[@class='description'])")));
		List<WebElement> desc = driver.findElements(By.xpath("(//p[@class='description'])"));
			for (WebElement txt : desc) {
				String text = txt.getText();
				System.out.println(text);
				Thread.sleep(5000);
			}
		driver.close();
	}

}
