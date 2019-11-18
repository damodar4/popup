package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.get("https://www.spicejet.com/");
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	driver.findElement(By.linkText("SpiceBiz")).click();
	

	}

}
