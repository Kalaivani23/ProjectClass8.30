package org.bini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/oracle-training.html");
		WebElement element = w.findElement(By.xpath("//p[text()='Awarded as the ']"));
		String s=element.getText();
		System.out.println(s);
		WebElement element2 = w.findElement(By.xpath("//p[text()='Rated as ']"));
		String s1=element2.getText();
		System.out.println(s1);

	}

}
