package com.Zerodha.TestPackage;

import org.testng.annotations.Test;

import com.Zerodha.POMpackage.BuyAndSellWindowPOMClass;
import com.Zerodha.POMpackage.HomePagePOMClass;

public class TC03_BuyFunctionality extends TestBaseClass
{
	
    @Test
	public void BuyFunctionalityVerify() throws InterruptedException
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
     	bs.clickonMISradiobtn();
    	System.out.println("Click on MIS radio button");
    	Thread.sleep(2000);
    	bs.clickonMarketRadiobtn();
    	System.out.println("Click on market radio button");
    	bs.clickonBuybtnOption();
    	System.out.println("click on buy button");
    	
    	
    	
    	
    	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
