package com.Zerodha.POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{

	private WebDriver driver;
	
	 @FindBy(xpath="//input[@id='userid']")
	    private WebElement usename;
	 
	 public void sendusername()
	 {
		 usename.clear();
		 usename.sendKeys("LBM627");
	 }
	
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	 
	 public void sendpassword()
	 {
		 password.clear();
		 password.sendKeys("Dhiru@1234");
	 }
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement loginbtn;
	 
	 public void clickonloginbtn()
	 {
		 loginbtn.click(); 
	 }
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickbtnfactorauth;
	
	public void clickonfactorauthbtn()
	{
		clickbtnfactorauth.click();
		
	}
	
	public String gettitle()
	{
		String actualtitle=driver.getTitle();
		return actualtitle;
	}

	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
