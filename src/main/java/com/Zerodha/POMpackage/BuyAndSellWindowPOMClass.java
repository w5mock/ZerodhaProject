package com.Zerodha.POMpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyAndSellWindowPOMClass 
{

	WebDriver driver;
	
	@FindBy(xpath="//label[text()='Regular']")
	private WebElement regularmktbtn;
	public void clickonRegularMKTTypebtn()
	{
		regularmktbtn.click();
	}
	
	@FindBy(xpath="//label[text()='AMO']")
	private WebElement AMOmktbtn;
	public void clickonAMOMKTTypebtn()
	{
		AMOmktbtn.click();
	}
	
	
	@FindBy(xpath="//span[text()='CNC']")
	private WebElement cNCRadiobtn;
	public void clickonCNCradiobtn()
	{
		cNCRadiobtn.click();
	}
	
	@FindBy(xpath="//span[text()='MIS']")
	private WebElement misRadiobtn;
	public void clickonMISradiobtn()
	{
		misRadiobtn.click();
	}
	
	@FindBy(xpath="//label[text()='Market']")
	private WebElement marketRadiobtn;
	public void clickonMarketRadiobtn()
	{
		marketRadiobtn.click();
	}
	
	@FindBy(xpath="//label[text()='Limit']")
	private WebElement limitOrderBtn;
	public void clickonlimitOrderRadioBtn()
	{
	    limitOrderBtn.click();
		
	}
	
	@FindBy(xpath="//input[@label='Price']")
	private WebElement priceTextBox;
	public boolean priceTextBox()
	{
		boolean actualresult=priceTextBox.isEnabled();
		return actualresult;
	}
	
	@FindBy(xpath="(//span[text()='Buy'])[2]")
	private WebElement clickonbuybtn;
	public void clickonBuybtnOption()
	{
		clickonbuybtn.click();
	}
	
	
	@FindBy(xpath="//span[text()='1 Qty']")
	private WebElement qtytextbox;
	
	public String gettextqtytextbox()
	{
		String actualtext=qtytextbox.getText();
		return actualtext;
	}
	
	
	
	 public BuyAndSellWindowPOMClass(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
