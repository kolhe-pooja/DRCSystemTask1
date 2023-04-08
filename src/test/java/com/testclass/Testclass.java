package com.testclass;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.drcsystem.Testpack.TestBaseClass;
import com.drcsystem.pompack.HomePom;
import com.drcsystem.pompack.LoginPom;

public class Testclass extends TestBaseClass{
	LoginPom lp;
	HomePom hp;

	@BeforeClass

	public void openBrowser()
	{
	InitializeBrowser();
     lp= new LoginPom(driver);
	 hp= new HomePom(driver);
	
	}
	

@BeforeMethod()
public void login() throws IOException, InterruptedException
{
	lp.signin();
	Thread.sleep(2000);
	lp.sendUsername();
	Thread.sleep(2000);
	lp.sendPassword();
	Thread.sleep(2000);
	lp.clickLoginButton();
	Thread.sleep(2000);
	hp.beautyclick();
	Thread.sleep(2000);
	hp.selectproduct();
	Thread.sleep(2000);
	hp.addedtocart();
	Thread.sleep(2000);
	hp.clickmycart();
	Thread.sleep(2000);
	hp.clickproceed();
	Thread.sleep(2000);
	hp.clickcontinuecheck();
	Thread.sleep(2000);
	hp.clickcontinue1();
	Thread.sleep(2000);
	hp.clickcontinue2();
	Thread.sleep(2000);
	hp.entercvv();
	Thread.sleep(2000);
	hp.clickcontinuesubmit();
	
	
	
}
}
