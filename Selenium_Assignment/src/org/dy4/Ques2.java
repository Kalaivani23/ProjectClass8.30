/* QUESTION 2
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html
 
NOTE: Print 3rd paragraph.

*/

package org.dy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement text =  driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
		System.out.println(text.getText());
		driver.close();
	}

}
