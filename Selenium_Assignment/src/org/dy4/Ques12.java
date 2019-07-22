/* QUESTION 12
-----------
URL : https://www.snapdeal.com/ 

NOTE: Add any  two items you want in the cart 
      Print the total cost in cart.
 */

package org.dy4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement cmp = driver.findElement(By.xpath("//span[text()='Computers & Gaming']"));
		cmp.click();
		driver.findElement(By.xpath("//span[text()='Core i3 Laptops']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Asus Vivobook 15')]")).click();
		String mainWind = driver.getWindowHandle();
		Set<String> childWind = driver.getWindowHandles();
		for (String child : childWind) {
			if(!child.equals(mainWind))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//span[text()='add to cart']")).click();
				driver.findElement(By.id("inputValEnter")).sendKeys("kitchen container");
				driver.findElement(By.xpath("//span[text()='Search']")).click();
				driver.findElement(By.xpath("//p[contains(text(),'Floraware PET')]")).click();
			}
		}
		int c=0;
		String mainWind1 = driver.getWindowHandle();
		Set<String> childWind1 = driver.getWindowHandles();
		for (String child : childWind1) {
			if(c==2) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			}
			c++;
		}
		WebElement amt = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		System.out.println(amt.getText());
		driver.quit();
	}

}
