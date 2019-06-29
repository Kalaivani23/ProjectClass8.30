package org.bini;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver w=new ChromeDriver();
		w.get("http://www.adactin.com/HotelApp/");
		WebElement element = w.findElement(By.id("username"));
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("return arguments[0].setAttribute('value','bini')", element);
		Object o = js.executeScript("return arguments[0].getAttribute('value')",element);
		String s=(String)o;
		System.out.println(s);
		WebElement e=w.findElement(By.id("password"));
		js.executeScript("return arguments[0].setAttribute('value','bini123')", e);
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')",e);
		String s1=(String)o1;
		System.out.println(s1);
		
	}

}
