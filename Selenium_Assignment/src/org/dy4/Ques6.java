/* QUESTION 6
----------
URL : http://www.greenstechnologys.com/testimonial.html 

NOTE: Print Sekhar C (Infosys, Chennai) statement.
 */

package org.dy4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		List<WebElement> txt = driver.findElements(By.tagName("strong"));
		WebElement frt = driver.findElement(By.xpath("//*[@id='article-wrapper']/strong[2]"));
		System.out.println(frt.getAttribute("placeholder"));
		for (WebElement text : txt) {
			if(text.getText().contains("Sekhar C"))
			{
				System.out.println(text.getText());
		}
		}
		driver.close();//*[@id="article-wrapper"]/text()[2]
}
}
