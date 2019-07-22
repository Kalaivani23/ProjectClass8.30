package org.dy7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Ques\\Selenium_Assignment\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		TakesScreenshot ss = (TakesScreenshot)driver;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//h1[text()='RECENT JOB OPENINGS ']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\Selenium_Ques\\Selenium_Assignment\\src\\Screenshot\\q5.jpg");
		FileUtils.copyFile(src, dec);
	}

}
