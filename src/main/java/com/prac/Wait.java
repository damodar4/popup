package com.prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.santabanta.com");
		driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
