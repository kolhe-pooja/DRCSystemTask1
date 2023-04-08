package com.drcsystem.pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePom {
WebDriver driver;
	
	@FindBy(xpath ="//ul[@class='ng-star-inserted']//a[contains(text(),'Beauty')]")
	WebElement beauty;
	
	public void beautyclick()
	{
		beauty.click();
	}
	

	@FindBy(xpath ="//img[@alt='Hair color']")
	WebElement productclick;
	
	public void selectproduct()
	{
		productclick.click();
	}

	@FindBy(xpath ="//button[@class='btn t-green-btn ng-star-inserted']")
	WebElement addtocart;
	
	public void addedtocart()
	{
		addtocart.click();
	}
	
	
	@FindBy(xpath ="//a[normalize-space()='My Cart']")
	WebElement mycart;
	
	public void clickmycart()
	{
		mycart.click();
	}
	
	
	
	@FindBy(xpath ="//button[text()='Proceed']")
	WebElement proceed;
	
	public void clickproceed()
	{
		proceed.click();
	}
	
	
	@FindBy(xpath ="//button[normalize-space()='Continue to checkout']")
	WebElement continuecheckout;
	
	public void clickcontinuecheck()
	{
		continuecheckout.click();
	}
	
	
	@FindBy(xpath ="//button[normalize-space()='Continue'])[1]")
	WebElement continueordersummery;
	
	public void clickcontinue1()
	{
		continueordersummery.click();
	}
	
	@FindBy(xpath ="//button[normalize-space()='Continue'])[1]")
	WebElement continuee2;
	
	public void clickcontinue2()
	{
		continuee2.click();
	}
	
	
	@FindBy(xpath ="//input[@type='text'])[1]")
	WebElement cvv;
	
	public void entercvv()
	{
		cvv.sendKeys("733");
	}
	
	@FindBy(xpath ="//button[normalize-space()='Continue'])[1]")
	WebElement continuesub;
	
	public void clickcontinuesubmit()
	{
		continuesub.click();
	}
	
	public HomePom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
}
