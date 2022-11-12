package com.Zerodha.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC05_BuyAndSellButtonVisibility extends TestBaseClass
{
	
    @Test
	public void BuySellButtonVisibilityVerify() throws InterruptedException
	{
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickonsearchtextbox();
		System.out.println("perform actions");
		hp.clickonsearchstock();
		System.out.println("Stock searched");
		hp.moveToStock();
		System.out.println("Cursor move to stock element");
		String actualBuy=hp.gettextofBuybtn();
		String expectedBuy="B";
		Assert.assertEquals(actualBuy, expectedBuy);
		String actualSell=hp.gettextofSellbtn();
		String expectedSell="S";
		Assert.assertEquals(actualSell, expectedSell);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
