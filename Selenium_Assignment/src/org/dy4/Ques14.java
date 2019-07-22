/* QUESTION 14
-----------
URL : https://www.flipkart.com/ 

NOTE: Print electronic,tv and applicances,men,women,baby&kids,home&furniture and offerzone.(findElement by xpath,text)
 */

package org.dy4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		List<WebElement> lst2 = driver.findElements(By.xpath("//span[@class='_25Wjx4']"));
		for (WebElement flp : lst) {
			System.out.println(flp.getText());
		}
		for (WebElement flp : lst2) {
			System.out.println(flp.getText());
		}
		driver.close();
	}

}
