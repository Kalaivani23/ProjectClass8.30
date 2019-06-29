package org.bini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/index.html");
		WebElement element = w.findElement(By.xpath("//div[@class='trainer-info'][2]"));
		String s=element.getText();
		System.out.println(s);

	}

}
