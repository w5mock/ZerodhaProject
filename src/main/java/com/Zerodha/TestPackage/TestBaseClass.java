package com.Zerodha.TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Zerodha.POMpackage.LoginPOMClass;

public class TestBaseClass
{
	WebDriver driver;
	@Parameters("BrowserName")
    @BeforeMethod
	public void setUp(String BrowserName) throws InterruptedException
	{
    	if(BrowserName.equals("chrome"))
    	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
    	}
    	else
    	{
    		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
    		ChromeOptions options=new ChromeOptions();
    		options.addArguments("--disable-notifications");
    		driver=new FirefoxDriver();
    	}
	    System.out.println("open chrome browser");
	    driver.manage().window().maximize();
	    System.out.println("maximize the window");
	    driver.get("https://kite.zerodha.com/");
	    System.out.println("URL open");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //Login
	    LoginPOMClass lp=new LoginPOMClass(driver);
	    lp.sendusername();
	    System.out.println("Username enter");
	    lp.sendpassword();
	    System.out.println("Password enter");
	    lp.clickonloginbtn();
	    System.out.println("click on login button");
	   
	    System.out.println("we are on 2FA page");
	    Thread.sleep(10000);
	    
	    lp.clickonfactorauthbtn();
	    System.out.println("Click on 2FA login button");
	    
	    System.out.println("We are on home page");
	   
    	
	    
	    
  	}
    
//    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    	System.out.println("Browser close");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
