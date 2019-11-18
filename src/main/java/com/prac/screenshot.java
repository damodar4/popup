package com.prac;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) throws IOException{
	System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.get("http://www.gmail.com");
	
	//take screenshot and store file format	
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//now copy the screenshot to desire location using copy file method
	FileUtils.copyFile(src,new File("C://Users//Damodar//eclipse-workspace//Popup//google.png"));
	}

}
