/* QUESTION 9
----------
URL : http://www.google.com/

NOTE: Open all the google app using debug.
 */

package org.dy4;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Ques9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement src = driver.findElement(By.xpath("//a[@title='Google apps']"));
				src.click();
		List<WebElement> app = driver.findElements(By.xpath("//a[@class='gb_c']"));
		for (WebElement webApp : app) {
			a.dragAndDrop(src, webApp);
			a.contextClick(webApp).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		}

	}

}
