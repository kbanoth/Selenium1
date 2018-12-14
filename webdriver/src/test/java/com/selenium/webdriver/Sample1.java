/**
 * 
 */
package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fpages.ebay.com%2Fcl%2Fen-us%2Fmobile%2Fiphone_half.html");
	
	driver.findElement(By.id("firstname")).sendKeys("satya");
	driver.findElement(By.name("lastname")).sendKeys("banoth");
	driver.findElement(By.id("email")).sendKeys("satyabanoth@gmail.com");
	driver.findElement(By.id("PASSWORD")).sendKeys("Aaradhya");
	driver.findElement(By.name("checkbox-default")).click();
	
	
		
	}

}
