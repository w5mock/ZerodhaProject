package com.Zerodha.POMpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass
{
     private WebDriver driver;
    private Actions act;
     
     @FindBy(xpath="//input[@type='text']")
     private WebElement searchtextbox;
     
     public void clickonsearchtextbox() throws InterruptedException
     {
    	 searchtextbox.click();
    	 Thread.sleep(2000);
    	 searchtextbox.sendKeys("idea");
    	 Thread.sleep(2000);
    	 searchtextbox.click();
     }
     
     @FindBy(xpath="//span[text()='IDEA']")
     private WebElement searchstock;
     
     public void clickonsearchstock()
     {
    	 searchstock.click();
     }
     
     @FindBy(xpath="//span[text()='idea']")
     private WebElement stockverify;
     
     public String verifystockadded()
     {
    	 String actualStockName=stockverify.getText();
    	 return actualStockName;
     }
     
     @FindBy(xpath="//span[text()='IDEA']")
     private WebElement movetostockelement;
     public void moveToStock()
     {
    	 act.moveToElement(movetostockelement).perform();
     }
     
     @FindBy(xpath="//button[text()='B ']")
     private WebElement Buybtngettext;
     
     public String gettextofBuybtn()
     {
    	 String actualvalue=Buybtngettext.getText();
    	 return actualvalue;
     }
     
     @FindBy(xpath="//button[text()='S ']")
     private WebElement Sellbtngettext;
     
     public String gettextofSellbtn()
     {
    	 String actualvalue=Sellbtngettext.getText();
    	 return actualvalue;
     }
     
     @FindBy(xpath="(//button[@type='button'])[1]")
     private WebElement clickonBuyBtn;
     
     public void clickonbuybtn()
     {
    	 clickonBuyBtn.click();
     }
     
     public HomePagePOMClass(WebDriver driver)
     {
    	 this.driver=driver;
         act=new Actions(driver);
    	 PageFactory.initElements(driver, this);
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
