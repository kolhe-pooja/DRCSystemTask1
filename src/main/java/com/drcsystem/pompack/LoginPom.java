package com.drcsystem.pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Sign In']")
	WebElement signin;
	
	public void signin()
	{
		signin.click();
	}
	

	@FindBy(xpath ="//input[@type='email']")
	WebElement userName;
	
	public void sendUsername()
	{
		userName.sendKeys("user@gmail.com");
	}
	
	@FindBy(xpath ="//input[@type='password']")
	WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("User@1234");
	}
	
	
	@FindBy(xpath ="//button[@text()='Sign-in']")
	WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	//4.Const declared
	public LoginPom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}	



