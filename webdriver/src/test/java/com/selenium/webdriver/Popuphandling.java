package com.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
       driver.findElement(By.xpath("Registerc9842acf")).click();
       Alert alert= driver.switchTo().alert();
      System.out.println(alert.getText());
      
      String text = alert.getText();
      
       if(text.equals("Please ennter correct user name "));{
       System.out.println("print currect message ");
       }
       //else{
//    	   System.out.print("in correct message ");
//    	   
//       }
//       alert.accept();
//       
       
       
       
       }
	}





















































































































































































































































































































































































