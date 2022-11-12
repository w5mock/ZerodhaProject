package com.Zerodha.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.BuyAndSellWindowPOMClass;
import com.Zerodha.POMpackage.HomePagePOMClass;
import com.Zerodha.POMpackage.OrderPagePOMClass;

public class TC09_AMOVerify extends TestBaseClass
{
	@Test
	public void VerifyAMO() throws InterruptedException
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
	bs.clickonAMOMKTTypebtn();
	System.out.println("Clicked on AMO button");
	Thread.sleep(2000);
 	bs.clickonCNCradiobtn();
	System.out.println("Click on CNC radio button");
	Thread.sleep(2000);
	bs.clickonMarketRadiobtn();
	System.out.println("Click on market Order radio button");
	Thread.sleep(2000);
	bs.clickonBuybtnOption();
	System.out.println("Click on buy button");
	
	Thread.sleep(2000);
	OrderPagePOMClass op=new OrderPagePOMClass(driver);
	op.clickonOrderBtn();
	System.out.println("Click on order button");
	String actual=op.GetTextToVerifyOrderAMO();
	String expected="AMO REQ RECEIVED";
	Assert.assertEquals(actual, expected);
	
	}
	
	
	
	
	
	
	
	
}
