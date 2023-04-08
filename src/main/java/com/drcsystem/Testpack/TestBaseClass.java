package com.drcsystem.Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBaseClass {
public WebDriver driver;   
	
	public void InitializeBrowser()
	{
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.get(" http://php.dev.drcsystems.ooo/meydan/meydan-marketplace/users/home ");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
	
		


}
}

