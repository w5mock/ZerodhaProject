package com.Zerodha.TestPackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC02_AddToWatchListVerify extends TestBaseClass
{
    @Test
	public void AddToWatchListVerify() throws InterruptedException
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickonsearchtextbox();
		System.out.println("perform actions");
		hp.clickonsearchstock();
		System.out.println("Stock searched");
		String actualStockName=hp.verifystockadded();
		String expectedStockName="RELIANCE";
		Assert.assertEquals(actualStockName, expectedStockName);
			
	}
	

	
	
	
	
}
