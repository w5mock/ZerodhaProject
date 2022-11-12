package com.Zerodha.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Zerodha.POMpackage.BuyAndSellWindowPOMClass;
import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC04_BuyTextBoxDefault1 extends TestBaseClass
{
	
@Test	
public void VerifyBuyTextBoxDefault1() throws InterruptedException
{
	HomePagePOMClass hp=new HomePagePOMClass(driver);
	hp.clickonsearchtextbox();
	System.out.println("click and send stock value");
	hp.clickonsearchstock();
	System.out.println("Click on perticular stock");
	hp.clickonbuybtn();
	System.out.println("Click on buy button");
	
	BuyAndSellWindowPOMClass bs=new BuyAndSellWindowPOMClass(driver);
	String actual=bs.gettextqtytextbox();
	System.out.println(actual);
	String expected="1 Qty";
	Assert.assertEquals(actual, expected);
		
}
}
