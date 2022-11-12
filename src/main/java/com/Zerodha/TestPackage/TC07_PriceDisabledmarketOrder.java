package com.Zerodha.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.BuyAndSellWindowPOMClass;
import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC07_PriceDisabledmarketOrder extends TestBaseClass
{
	@Test
	public void VerifyPriceTextboxDisabledMarketOrder() throws InterruptedException
	{

	HomePagePOMClass hp=new HomePagePOMClass(driver);
	hp.clickonsearchtextbox();
	System.out.println("click and send stock value");
	hp.clickonsearchstock();
	System.out.println("Click on perticular stock");
	hp.clickonbuybtn();
	System.out.println("Click on buy button");
	BuyAndSellWindowPOMClass bs=new BuyAndSellWindowPOMClass(driver);
   
	Thread.sleep(2000);
 	bs.clickonCNCradiobtn();
	System.out.println("Click on CNC radio button");
	Thread.sleep(2000);
	bs.clickonMarketRadiobtn();
	System.out.println("Click on market radio button");
	Thread.sleep(2000);
	boolean actualresult=bs.priceTextBox();
	boolean expectedresult=false;
	Assert.assertEquals(actualresult, expectedresult);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
