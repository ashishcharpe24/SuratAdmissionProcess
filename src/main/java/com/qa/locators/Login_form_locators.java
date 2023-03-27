package com.qa.locators;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.base.BaseClass;


public class Login_form_locators extends BaseClass{
	
//	WebDriver d;
//	
//	public Login_form_locators(WebDriver d)
//	{
//		this.d=d;
//	}
//	
	@FindBy(how=How.ID,using="userId")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="userPassword")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="select2-select-campus-login-container")
	@CacheLookup
	WebElement campus;
	
	@FindBy(how=How.XPATH,using="//input[@type='search']")
	@CacheLookup
	WebElement searchCampus;
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	@CacheLookup
	WebElement loginBtn;
	

	
	
   public void surat_AdmissionProcessStaffSide() throws InterruptedException
   {
	   username.sendKeys(p.getProperty("username"));
	   Thread.sleep(500);
	   password.sendKeys(p.getProperty("password"));
	   Thread.sleep(500);
	   campus.click();
	   Thread.sleep(500);
	   searchCampus.sendKeys(p.getProperty("campus"),Keys.ENTER);
	   Thread.sleep(500);
	   loginBtn.click();
	   Thread.sleep(2000);
	   
   }
}
