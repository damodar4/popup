package com.prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Damodar\\eclipse-workspace\\Demo\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		
		alert.accept();
		
	}
	
}
