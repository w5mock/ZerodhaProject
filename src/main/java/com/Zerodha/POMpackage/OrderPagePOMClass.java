package com.Zerodha.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPagePOMClass
{

	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orderbtn;
	
	public void clickonOrderBtn()
	{
		orderbtn.click();
	}
	
	
	@FindBy(xpath="//span[text()='AMO REQ RECEIVED']")
	private WebElement VerifyOrder;
	
	public String GetTextToVerifyOrderAMO()
	{
		String actual=VerifyOrder.getText();
		return actual;
	}
	public OrderPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
}
