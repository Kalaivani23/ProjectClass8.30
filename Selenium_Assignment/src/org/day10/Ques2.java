/* QUESTION 2
----------
URL : https://www.amazon.com/

NOTE: NOTE: Search iphones X and click 1st phone and add it to cart.click Proceed to checkout print the 1 st line 
from thr popoup.
 */

package org.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone x");
		driver.findElement(By.xpath("(//input[@type = 'submit'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'(A')]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='submit'])[16]")).click();
		WebElement txt = driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));
		System.out.println(txt.getText());
		driver.close();
	}

}
