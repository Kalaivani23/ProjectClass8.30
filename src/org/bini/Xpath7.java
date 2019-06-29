package org.bini;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	WebElement e=w.findElement(By.id("email"));
	JavascriptExecutor js=(JavascriptExecutor)w;
	js.executeScript("arguments[0].setAttribute('value', 'bini')",e);
	Object o = js.executeScript("return arguments[0].getAttribute('value')", e);
	String s=(String)o;
	System.out.println(s);
	WebElement element = w.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value', 'bini123')",element);
	Object o1 = js.executeScript("return arguments[0].getAttribute('value')", element);
	String s1=(String)o1;
	System.out.println(s1);
		
	}

}
