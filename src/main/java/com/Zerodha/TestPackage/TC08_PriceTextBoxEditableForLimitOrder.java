package com.Zerodha.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.BuyAndSellWindowPOMClass;
import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC08_PriceTextBoxEditableForLimitOrder extends TestBaseClass 
{
	@Test
	public void VerifyPriceTextboxEditableForLimitOrder() throws InterruptedException
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
	bs.clickonlimitOrderRadioBtn();
	System.out.println("Click on Limit Order radio button");
	Thread.sleep(2000);
	boolean actualresult=bs.priceTextBox();
	System.out.println(actualresult);
	boolean expectedresult=true;
	Assert.assertEquals(actualresult, expectedresult);
	
	
	}
	
	
}
