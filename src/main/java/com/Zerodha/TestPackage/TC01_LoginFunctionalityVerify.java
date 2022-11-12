package com.Zerodha.TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.LoginPOMClass;

public class TC01_LoginFunctionalityVerify extends TestBaseClass
{

    @Test
	public void verifyLogin() throws InterruptedException
	{
    	LoginPOMClass lp=new LoginPOMClass(driver);
    	String actualtitle=lp.gettitle();
    	String expected="Kite - Zerodha's fast and elegant flagship trading platform";
		System.out.println("Compare actual and expected title");
		Assert.assertEquals(actualtitle, expected);
	}
}
