package com.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.locators.Login_form_locators;
import com.qa.locators.Surat_registration_form_locators;

public class Surat_Registration_Form extends BaseClass {
	
	@Test(priority=0)
	public void intiate_browser() throws Throwable
	{
		BaseClass b = new BaseClass();
		b.launchApp();
	}
	
	@Test(priority=1)
   public void registration_form_details() throws Throwable
   {
		Surat_registration_form_locators s = PageFactory.initElements(dr, Surat_registration_form_locators.class);
		s.fill_registration_form_info();
//		Surat_registration_form_locators s1 = new Surat_registration_form_locators(dr);
		//s1.fill_registration_form_info();
		
	}
	
	@Test(priority=2)
	public void loginFormLocatorsTest() throws Throwable
	{
		launchAppStaff();
		Login_form_locators l = PageFactory.initElements(dr, Login_form_locators.class);
		Surat_registration_form_locators staff = PageFactory.initElements(dr, Surat_registration_form_locators.class);
		l.surat_AdmissionProcessStaffSide();
		staff.admissionProcessStaffSide();
	}
	
}
