package com.qa.locators;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class Surat_registration_form_locators extends BaseClass {

	WebDriver dr;

	public Surat_registration_form_locators(WebDriver dr) {

		this.dr=dr;
	}

	@FindBy(how=How.NAME,using="Country")
	@CacheLookup
	WebElement country;
	@FindBy(how=How.NAME,using="Campus")
	@CacheLookup
	WebElement campus;
	@FindBy(how=How.NAME,using="AdmissionFor")
	@CacheLookup
	WebElement session;
	@FindBy(how=How.ID,using="FatherFirstName")
	@CacheLookup
	WebElement f_name;
	@FindBy(how=How.NAME,using="FatherLastName")
	@CacheLookup
	WebElement l_name;
	@FindBy(how=How.NAME,using="FatherEmailAddress")
	@CacheLookup
	WebElement email;
	@FindBy(how=How.NAME,using="FatherhMobileNumber")
	@CacheLookup
	WebElement m_number;
	@FindBy(how=How.ID,using="SaveAndContinueButtonPageOne")
	@CacheLookup
	WebElement Save1;

	// Parent section locators
	By f_f_name= By.name("FatherFirstName");
	By f_l_name=By.name("FatherLastName");
	By f_nat=By.name("FatherNationality");
	By f_id_type=By.name("FatherIdentification");
	By f_id_no=By.name("FatherIdentificationNumber");
	By f_edu=By.name("FatherEducation");
	By f_anu_income=By.name("FatherAnnualIncome");
	By f_emp_name = By.id("FatherEmployerName");
	By f_exp = By.id("FthExp");
	By f_desig = By.name("FatherCurrentPosition");
	By f_home_phone = By.name("FatherhHomeNumber");
	By f_socio = By.name("FthSocioEconomic");
	By f_email = By.xpath("//span[@class='required-field ng-scope']//following::input[@name='FatherEmailAddress']");
	By f_mobNum = By.xpath("//span[@class='required-field ng-scope']//following::input[@name='FatherhMobileNumber']");		
	By f_photo = By.xpath("//a[contains(@ng-click,'Father') and text()='Upload Photograph']");
	//Mother Information
	By m_f_name= By.name("MotherFirstName");
	By m_l_name = By.name("MotherLastName");
	By m_nat = By.name("MotherNationality");
	By m_id_type = By.name("MotherIdentification");
	By m_id_num = By.name("MotherIdentificationNumber");
	By m_edu = By.name("MotherEducation");
	By m_anu_income = By.name("MotherAnnualIncome");
	By m_emp_name = By.name("MotherEmployerName");
	By m_exp = By.name("MthExp");
	By m_desig = By.name("MotherCurrentPosition");
	By m_email = By.name("MotherEmailAddress");
	By m_mobile = By.name("MotherhMobileNumber");
	By m_socio = By.name("MthSocioEconomic");
	By Save2=By.xpath("//*[@ng-click='submitPartOne(admissionPartOne)']");
	By m_photo = By.xpath("//a[contains(@ng-click,'Mother') and text()='Upload Photograph']");
	//Student section locators
	By s_fname=By.id("FirstName");
	By s_lname=By.id("LastName");
	By s_id_type=By.name("Identification");
	By s_id_no=By.name("IdentificationNumber");
	By s_nat=By.name("Nationality");
	By s_passport_no = By.name("StudPassportNo");
	By s_seeking_grade = By.name("ClassStuding");
	By s_sch_name= By.name("PresentSchoolName");
	By s_sch_sity = By.name("PresentSchoolCity");
	By s_res_status = By.name("ResidentialStatus");
	By s_block = By.name("Block");
	By s_add1 = By.name("AddressLine1");
	By s_add2 = By.name("AddressLine2");
	By s_lmark = By.name("FlatNo");
	By s_city = By.name("City");
	By s_country = By.name("CurrentHomeCountry");
	By s_zip = By.name("PostalCode");
	By Save3=By.xpath("//button[@ng-click='submitPartTwo(admissionPartTwo)']");
	By s_photo = By.xpath("//a[contains(@ng-click,'Student') and text()='Upload Photograph']");
	//Health Info & Documents
	By s_indivAutPickupName=By.xpath("//input[@name='AuthorizationPickupName']");
	By s_indivAutPickupNumCode = By.xpath("//button[@data-id='AuthorizationPickupMobileCode']");
	By s_indivAutNumber= By.xpath("//input[@name='AuthorizationPickupPhoneNumber']");
	By s_indivAuthAddress = By.xpath("//input[@name='AuthorizationPickupAddressLine1']");
	By s_indivAuthRelWithChild= By.xpath("//input[@name='AuthorizationRelationshiptoChild']");
	By s_indivAuthBuilName=By.xpath("//input[@name='AuthorizationOtherInfo']");
	By s_indivAuthIDNum= By.xpath("//input[@name='AuthorizationIdentificationNumber']");
	By s_scale = By.xpath("//input[@name='SatisfactionLevel'][@value='4']");
	By feedback = By.name("AdditionalFeedback");
	By Save4 = By.xpath("//button[normalize-space(text())='Submit' and @ng-click='submitPartThree(admissionPartThree)']");

	// Admission process from staff side 
	By staff_admissions = By.xpath("//span[text()='Admissions']");
	By staff_admissionAndEnq = By.xpath("//span[text()='Admission And Enquiry']");
	By staff_viewRegForm = By.xpath("//span[text()='View Registration Forms']");
	By staff_academicSess = By.xpath("//select[@id='ddlSession']");
	By staff_collectPaymentLink=By.xpath("//table[@id='gvListAdmissEnq']//tr[2]//td//a[normalize-space(text())='Collect Payment']");
	By staff_iFrameAtCollectPayment = By.xpath("//iframe[contains(@src,'frmRegistrationFees')]");
	By staff_amount = By.xpath("//span[@class='amount']");
	By staff_byCashChkBox = By.xpath("//input[@name='chkCash']");
	By staff_amountTextBox = By.xpath("//input[@name='txtCash']");
	By staff_submitBtn = By.xpath("//input[@name='btnsave']");
	By staff_close = By.xpath("//div[@title='Click to Close']");
	By staff_admissionLink = By.xpath("//table[@id='gvListAdmissEnq']//tr[2]//td//a[normalize-space(text())='Admission']");


	public void fill_registration_form_info() throws Throwable {
		Select co = new Select(country);
		co.selectByValue("India");
		Thread.sleep(500);
		Select cm = new Select(campus);
		//cm.selectByValue("Surat");
		cm.selectByVisibleText(p.getProperty("campus"));
		Thread.sleep(500);
		Select se = new Select(session);
		//se.selectByValue(p.getProperty("Session"));
		se.selectByVisibleText(p.getProperty("Session"));
		Thread.sleep(500);
		f_name.sendKeys(p.getProperty("name"));
		l_name.sendKeys(p.getProperty("priorityParent"));
		email.sendKeys(p.getProperty("email"));
		m_number.sendKeys("9876543210", Keys.TAB);
		Thread.sleep(500);
		dr.findElement(By.xpath("//input[@name='ParentPriority'][@value='"+p.getProperty("priorityParent")+"']")).click();
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(15000);

		//Parent Information

		if(p.getProperty("priorityParent").equalsIgnoreCase("Father"))
		{


			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[1]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> years = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthFather = p.getProperty("DOBFather");
			Thread.sleep(2000);
			String[] dateSplitF =  dateOfBirthFather.split("-");
			String yearExp = dateSplitF[2];
			String monthExp=dateSplitF[1];
			String dateExp=dateSplitF[0];
			int yearMatched=0;
			for(int i=0;(i<5) &&  yearMatched<=0 ;i++)
			{
				for(int j=0;(j<years.size()) && yearMatched<=0;j++)
				{
					years = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = years.get(j).getText();
					System.out.println(year);	
					if(yearExp.equalsIgnoreCase(year))
					{
						yearMatched=1;
						years.get(j).click();
						break;
					}
				}
				if(yearMatched==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExp+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExp+"']")).click();


			Thread.sleep(500);
			Select fn = new Select(dr.findElement(f_nat));
			fn.selectByValue("Indian");
			Thread.sleep(500);
			Select fid=new Select(dr.findElement(f_id_type));
			fid.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(f_id_no).sendKeys("1111111");
			Thread.sleep(500);
			Select fms=new Select(dr.findElement(f_edu));
			fms.selectByValue("Post Graduate - Commerce");
			Thread.sleep(500);
			Select fai = new Select(dr.findElement(f_anu_income));
			fai.selectByValue("500000 to 1000000");
			Thread.sleep(500);
			dr.findElement(f_emp_name).sendKeys("OWNER");
			Thread.sleep(500);
			dr.findElement(f_exp).sendKeys("8");
			Thread.sleep(500);
			Select f_curr_desig = new Select(dr.findElement(f_desig));
			f_curr_desig.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(f_home_phone).sendKeys("9876543210");
			Thread.sleep(500);
			Select fse = new Select(dr.findElement(f_socio));
			fse.selectByValue("7");
			dr.findElement(f_photo).click();
			Thread.sleep(500);
			dr.findElement(f_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("father_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			dr.findElement(m_f_name).sendKeys(p.getProperty("name"));
			Thread.sleep(500);
			dr.findElement(m_l_name).sendKeys("Mother");
			Thread.sleep(500);

			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[2]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> yearsM = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthMother =  p.getProperty("DOBMother");;
			Thread.sleep(2000);
			String[] dateSplitM =  dateOfBirthMother.split("-");
			String yearExpM = dateSplitM[2];
			String monthExpM=dateSplitM[1];
			String dateExpM=dateSplitM[0];
			int yearMatchedM=0;
			for(int k=0;(k<5) &&  yearMatchedM<=0 ;k++)
			{
				for(int l=0;(l<yearsM.size()) && yearMatchedM<=0;l++)
				{
					yearsM = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = yearsM.get(l).getText();

					if(yearExpM.equalsIgnoreCase(year))
					{
						yearMatchedM=1;
						yearsM.get(l).click();
						break;
					}
				}
				if(yearMatchedM==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExpM+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExpM+"']")).click();

			Thread.sleep(500);
			Select mnat = new Select(dr.findElement(m_nat));
			mnat.selectByValue("Indian");
			Thread.sleep(500);
			Select midtype = new Select(dr.findElement(m_id_type));
			midtype.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(m_id_num).sendKeys("2222222");
			Thread.sleep(500);
			Select medu = new Select(dr.findElement(m_edu));
			medu.selectByValue("Post Graduate – Science");
			Thread.sleep(500);
			Select mai = new Select(dr.findElement(m_anu_income));
			mai.selectByValue("100000 to 500000");
			Thread.sleep(500);
			dr.findElement(m_emp_name).sendKeys("OWNER");
			Thread.sleep(500);
			dr.findElement(m_exp).sendKeys("6");
			Select mdesig = new Select(dr.findElement(m_desig));
			mdesig.selectByValue("Other");
			dr.findElement(m_email).sendKeys("gifte459@gmail.com");
			Thread.sleep(500);
			dr.findElement(m_mobile).sendKeys("9876543210");
			Thread.sleep(500);
			Select mse = new Select(dr.findElement(m_socio));
			mse.selectByValue("7");
			Thread.sleep(500);
			dr.findElement(m_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("mother_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);
			dr.findElement(Save2).click();
			Thread.sleep(10000);

			//Student Information
			dr.findElement(s_fname).sendKeys(p.getProperty("name"));
			Thread.sleep(500);
			dr.findElement(s_lname).sendKeys("Student");
			Thread.sleep(500);
			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[3]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> yearsS = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthStudent =p.getProperty("DOBFather");;
			Thread.sleep(2000);
			String[] dateSplitS =  dateOfBirthStudent.split("-");
			String yearExpS = dateSplitS[2];
			String monthExpS=dateSplitS[1];
			String dateExpS=dateSplitS[0];
			int yearMatchedS=0;
			for(int m=0;(m<5) &&  yearMatchedS<=0 ;m++)
			{
				for(int n=0;(n<yearsS.size()) && yearMatchedS<=0;n++)
				{
					yearsS = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = yearsS.get(n).getText();

					if(yearExpS.equalsIgnoreCase(year))
					{
						yearMatchedS=1;
						yearsS.get(n).click();
						break;
					}
				}
				if(yearMatchedS==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExpS+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExpS+"']")).click();

			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@name='Gender'][@value='"+p.getProperty("GenderStudent")+"']")).click();
			Thread.sleep(500);
			Select id_tp = new Select(dr.findElement(s_id_type));
			id_tp.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(s_id_no).sendKeys("3333333");
			Thread.sleep(500);
			Select snat = new Select(dr.findElement(s_nat));
			snat.selectByValue("Indian");
			Thread.sleep(500);
			dr.findElement(s_passport_no).sendKeys("34234234");
			Thread.sleep(500);
			Select s_grade = new Select(dr.findElement(s_seeking_grade));
			s_grade.selectByVisibleText(p.getProperty("AdmissionInClass"));
			Thread.sleep(500);
			dr.findElement(s_sch_name).sendKeys("DPS");
			Thread.sleep(500);
			dr.findElement(s_sch_sity).sendKeys("Nagpur");
			Thread.sleep(500);
			dr.findElement(s_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("student_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);
			Select s_res_stat = new Select(dr.findElement(s_res_status));
			s_res_stat.selectByValue("Own");
			Thread.sleep(500);
			dr.findElement(s_block).sendKeys("926");
			Thread.sleep(500);
			dr.findElement(s_add1).sendKeys("1st Floor Esatate Building");
			Thread.sleep(500);
			dr.findElement(s_add2).sendKeys("SP Infinity");
			Thread.sleep(500);
			dr.findElement(s_lmark).sendKeys("Near Infocept");
			Thread.sleep(500);
			dr.findElement(s_city).sendKeys("Nagpur");
			Thread.sleep(500);
			Select s_cou = new Select(dr.findElement(s_country));
			s_cou.selectByValue("India");
			Thread.sleep(500);
			dr.findElement(s_zip).sendKeys("441108");
			Thread.sleep(500);
			dr.findElement(Save3).click();
			Thread.sleep(10000);

			WebElement s_pickup = dr.findElement(By.xpath("//input[@name='ConvenceType'][@value='"+p.getProperty("studentPickup")+"']"));
			String pickup = p.getProperty("studentPickup");
			Thread.sleep(500);
			if(pickup.equalsIgnoreCase("Another Individual"))
			{
				s_pickup.click();
				Thread.sleep(1000);
				dr.findElement(s_indivAutPickupName).sendKeys("Authorization Name");
				Thread.sleep(500);
				dr.findElement(s_indivAutPickupNumCode).click();
				Thread.sleep(500);
				dr.findElement(By.xpath("//*[@id='admissionPartThree']/div[7]/div[1]/div/div[2]/div/div/div/div/div/div/div/div/input")).sendKeys("+91",Keys.ENTER);
				Thread.sleep(500);
				dr.findElement(s_indivAutNumber).sendKeys("9088987890");
				Thread.sleep(500);
				dr.findElement(s_indivAuthAddress).sendKeys("Nagpur");
				Thread.sleep(500);
				WebElement s_indivAuthIDType = dr.findElement(By.xpath("//select[@name='AuthorizationIdentification']"));
				Select selID = new Select(s_indivAuthIDType);
				selID.selectByVisibleText("Other");
				Thread.sleep(500);
				dr.findElement(s_indivAuthIDNum).sendKeys("6567");
				Thread.sleep(500);
				dr.findElement(s_indivAuthRelWithChild).sendKeys("Uncle");
				Thread.sleep(500);
				dr.findElement(s_indivAuthBuilName).sendKeys("Red House");
				Thread.sleep(500);

			}
			else 
			{
				s_pickup.click();
			}

			// Upload Birth Certificate
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[4]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("BirthCertificate"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Upload Passport Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[5]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("PassportDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//NRIC/FIN Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[6]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("NRIC/FIN_Doc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Upload transfer certificate
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[7]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("TransferCertificate"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Immunization Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[8]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("ImmunizationCert"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//MarkSheet/Report Card
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[9]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("MarksheetOrReportCard"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Medical Report
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[10]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("MedicalDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Other Document
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[11]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("OtherDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);



			dr.findElement(s_scale).click();
			Thread.sleep(500);
			dr.findElement(feedback).sendKeys("NA");
			Thread.sleep(500);
			dr.findElement(Save4).click();
			Thread.sleep(10000);

		}



		//If priority parent is mother
		else if(p.getProperty("priorityParent").equalsIgnoreCase("Mother"))
		{

			Thread.sleep(1000);
			dr.findElement(By.xpath("(//input[@name='FatherFirstName'])[2]")).sendKeys(p.getProperty("name"));
			Thread.sleep(500);
			dr.findElement(By.xpath("(//input[@name='FatherLastName'])[2]")).sendKeys("Father");

			Thread.sleep(500);
			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[1]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> years = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthFather = p.getProperty("DOBFather");
			Thread.sleep(2000);
			String[] dateSplitF =  dateOfBirthFather.split("-");
			String yearExp = dateSplitF[2];
			String monthExp=dateSplitF[1];
			String dateExp=dateSplitF[0];
			int yearMatched=0;
			for(int i=0;(i<5) &&  yearMatched<=0 ;i++)
			{
				for(int j=0;(j<years.size()) && yearMatched<=0;j++)
				{
					years = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = years.get(j).getText();
					System.out.println(year);	
					if(yearExp.equalsIgnoreCase(year))
					{
						yearMatched=1;
						years.get(j).click();
						break;
					}
				}
				if(yearMatched==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExp+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExp+"']")).click();


			Thread.sleep(500);
			Select fn = new Select(dr.findElement(f_nat));
			fn.selectByValue("Indian");
			Thread.sleep(500);
			Select fid=new Select(dr.findElement(f_id_type));
			fid.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(f_id_no).sendKeys("1111111");
			Thread.sleep(500);
			Select fms=new Select(dr.findElement(f_edu));
			fms.selectByValue("Post Graduate - Commerce");
			Thread.sleep(500);
			Select fai = new Select(dr.findElement(f_anu_income));
			fai.selectByValue("500000 to 1000000");
			Thread.sleep(500);
			dr.findElement(f_emp_name).sendKeys("OWNER");
			Thread.sleep(500);
			dr.findElement(f_exp).sendKeys("8");
			Thread.sleep(500);
			Select f_curr_desig = new Select(dr.findElement(f_desig));
			f_curr_desig.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(f_home_phone).sendKeys("9876543210");
			Thread.sleep(500);
			Select fse = new Select(dr.findElement(f_socio));
			fse.selectByValue("7");
			Thread.sleep(500);
			dr.findElement(f_email).sendKeys(p.getProperty("email"));
			Thread.sleep(500);
			dr.findElement(f_mobNum).sendKeys("3232879890");
			Thread.sleep(500);
			dr.findElement(f_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("father_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[2]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> yearsM = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthMother =  p.getProperty("DOBMother");;
			Thread.sleep(2000);
			String[] dateSplitM =  dateOfBirthMother.split("-");
			String yearExpM = dateSplitM[2];
			String monthExpM=dateSplitM[1];
			String dateExpM=dateSplitM[0];
			int yearMatchedM=0;
			for(int k=0;(k<5) &&  yearMatchedM<=0 ;k++)
			{
				for(int l=0;(l<yearsM.size()) && yearMatchedM<=0;l++)
				{
					yearsM = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = yearsM.get(l).getText();

					if(yearExpM.equalsIgnoreCase(year))
					{
						yearMatchedM=1;
						yearsM.get(l).click();
						break;
					}
				}
				if(yearMatchedM==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExpM+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExpM+"']")).click();

			Thread.sleep(500);
			Select mnat = new Select(dr.findElement(m_nat));
			mnat.selectByValue("Indian");
			Thread.sleep(500);
			Select midtype = new Select(dr.findElement(m_id_type));
			midtype.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(m_id_num).sendKeys("2222222");
			Thread.sleep(500);
			Select medu = new Select(dr.findElement(m_edu));
			medu.selectByValue("Post Graduate – Science");
			Thread.sleep(500);
			Select mai = new Select(dr.findElement(m_anu_income));
			mai.selectByValue("100000 to 500000");
			Thread.sleep(500);
			dr.findElement(m_emp_name).sendKeys("OWNER");
			Thread.sleep(500);
			dr.findElement(m_exp).sendKeys("6");
			Select mdesig = new Select(dr.findElement(m_desig));
			mdesig.selectByValue("Other");
			Select mse = new Select(dr.findElement(m_socio));
			mse.selectByValue("7");
			Thread.sleep(500);
			dr.findElement(m_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("mother_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);
			dr.findElement(Save2).click();
			Thread.sleep(1000);

			//Student Information
			dr.findElement(s_fname).sendKeys(p.getProperty("name"));
			Thread.sleep(500);
			dr.findElement(s_lname).sendKeys("Student");
			Thread.sleep(500);
			dr.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[3]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			dr.findElement(By.xpath("//button[contains(@id,'datepicker')]")).click();
			Thread.sleep(2000);
			List<WebElement> yearsS = dr.findElements(By.xpath("//tbody//tr//td//button//span"));

			String dateOfBirthStudent =p.getProperty("DOBFather");;
			Thread.sleep(2000);
			String[] dateSplitS =  dateOfBirthStudent.split("-");
			String yearExpS = dateSplitS[2];
			String monthExpS=dateSplitS[1];
			String dateExpS=dateSplitS[0];
			int yearMatchedS=0;
			for(int m=0;(m<5) &&  yearMatchedS<=0 ;m++)
			{
				for(int n=0;(n<yearsS.size()) && yearMatchedS<=0;n++)
				{
					yearsS = dr.findElements(By.xpath("//tbody//tr//td//button//span"));
					String year = yearsS.get(n).getText();

					if(yearExpS.equalsIgnoreCase(year))
					{
						yearMatchedS=1;
						yearsS.get(n).click();
						break;
					}
				}
				if(yearMatchedS==0)
				{
					Thread.sleep(2000);
					dr.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				}


			}


			dr.findElement(By.xpath("//span[text()='"+monthExpS+"']")).click();

			dr.findElement(By.xpath("//tbody//tr//td//span[@class='ng-binding' and text()='"+dateExpS+"']")).click();

			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@name='Gender'][@value='"+p.getProperty("GenderStudent")+"']")).click();
			Thread.sleep(500);
			Select id_tp = new Select(dr.findElement(s_id_type));
			id_tp.selectByValue("Other");
			Thread.sleep(500);
			dr.findElement(s_id_no).sendKeys("3333333");
			Thread.sleep(500);
			Select snat = new Select(dr.findElement(s_nat));
			snat.selectByValue("Indian");
			Thread.sleep(500);
			dr.findElement(s_passport_no).sendKeys("34234234");
			Thread.sleep(500);
			Select s_grade = new Select(dr.findElement(s_seeking_grade));
			s_grade.selectByVisibleText(p.getProperty("AdmissionInClass"));
			Thread.sleep(500);
			dr.findElement(s_sch_name).sendKeys("DPS");
			Thread.sleep(500);
			dr.findElement(s_sch_sity).sendKeys("Nagpur");
			Thread.sleep(500);
			dr.findElement(s_photo).click();
			Thread.sleep(500);
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("student_photo"));
			Thread.sleep(1000);
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);
			Select s_res_stat = new Select(dr.findElement(s_res_status));
			s_res_stat.selectByValue("Own");
			Thread.sleep(500);
			dr.findElement(s_block).sendKeys("926");
			Thread.sleep(500);
			dr.findElement(s_add1).sendKeys("1st Floor Esatate Building");
			Thread.sleep(500);
			dr.findElement(s_add2).sendKeys("SP Infinity");
			Thread.sleep(500);
			dr.findElement(s_lmark).sendKeys("Near Infocept");
			Thread.sleep(500);
			dr.findElement(s_city).sendKeys("Nagpur");
			Thread.sleep(500);
			Select s_cou = new Select(dr.findElement(s_country));
			s_cou.selectByValue("India");
			Thread.sleep(500);
			dr.findElement(s_zip).sendKeys("441108");
			Thread.sleep(500);
			dr.findElement(Save3).click();
			Thread.sleep(10000);

			//					//Health Info & Document
			WebElement s_pickup = dr.findElement(By.xpath("//input[@name='ConvenceType'][@value='"+p.getProperty("studentPickup")+"']"));
			String pickup = p.getProperty("studentPickup");
			Thread.sleep(500);
			if(pickup.equalsIgnoreCase("Another Individual"))
			{
				s_pickup.click();
				Thread.sleep(1000);
				dr.findElement(s_indivAutPickupName).sendKeys("Authorization Name");
				Thread.sleep(500);
				dr.findElement(s_indivAutPickupNumCode).click();
				Thread.sleep(500);
				dr.findElement(By.xpath("//*[@id='admissionPartThree']/div[7]/div[1]/div/div[2]/div/div/div/div/div/div/div/div/input")).sendKeys("+91",Keys.ENTER);
				Thread.sleep(500);
				dr.findElement(s_indivAutNumber).sendKeys("9088987890");
				Thread.sleep(500);
				dr.findElement(s_indivAuthAddress).sendKeys("Nagpur");
				Thread.sleep(500);
				WebElement s_indivAuthIDType = dr.findElement(By.xpath("//select[@name='AuthorizationIdentification']"));
				Select selID = new Select(s_indivAuthIDType);
				selID.selectByVisibleText("Other");
				Thread.sleep(500);
				dr.findElement(s_indivAuthIDNum).sendKeys("6567");
				Thread.sleep(500);
				dr.findElement(s_indivAuthRelWithChild).sendKeys("Uncle");
				Thread.sleep(500);
				dr.findElement(s_indivAuthBuilName).sendKeys("Red House");
				Thread.sleep(500);
			}
			else 
			{
				s_pickup.click();
			}

			// Upload Birth Certificate
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[4]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("BirthCertificate"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Upload Passport Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[5]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("PassportDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//NRIC/FIN Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[6]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("NRIC/FIN_Doc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Upload transfer certificate
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[7]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("TransferCertificate"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Immunization Doc
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[8]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("ImmunizationCert"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//MarkSheet/Report Card
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[9]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("MarksheetOrReportCard"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Medical Report
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[10]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("MedicalDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			//Other Document
			dr.findElement(By.xpath("(//a[text()='Upload Photograph'])[11]")).click();
			dr.findElement(By.xpath("//input[@id='UploadPhotoModal']")).sendKeys(p.getProperty("OtherDoc"));
			dr.findElement(By.xpath("//button[@ng-click='UploadPhoto()']")).click();
			Thread.sleep(2000);

			dr.findElement(s_scale).click();
			Thread.sleep(500);
			dr.findElement(feedback).sendKeys("NA");
			Thread.sleep(500);
			dr.findElement(Save4).click();
			Thread.sleep(10000);
		}
	}


	public void admissionProcessStaffSide() throws InterruptedException
	{


		Thread.sleep(5000);

		dr.findElement(staff_admissions).click();
		Thread.sleep(500);
		dr.findElement(staff_admissionAndEnq).click();
		Thread.sleep(500);
		dr.findElement(staff_viewRegForm).click();
		Thread.sleep(1000);


		ArrayList<String> newTab = new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(newTab.get(1));
		Thread.sleep(2000);
		Select academSess= new Select(dr.findElement(staff_academicSess));
		academSess.selectByVisibleText(p.getProperty("Session"));
		//Thread.sleep(500);
		//		dr.findElement(staff_collectPaymentLink).click();
		//		Thread.sleep(500);
//		boolean flag = false;
		try 
		{
			if(dr.findElement(By.xpath("//table[@id='gvListAdmissEnq']//tr[2]//td//span[@id='gvListAdmissEnq_ctl03_lblInvoiceAmount']")).isDisplayed())
			{
				//Having some issue related to page loading hence admission needs to done manually for now.
				System.out.println("hello");	
				//			//table[@id='gvListAdmissEnq']//tr[2]//td//a[@id='gvListAdmissEnq_ctl03_HypLnkRegister']
				//			dr.findElement(By.xpath("//table[@id='gvListAdmissEnq']//tr[2]//td//a[@id='gvListAdmissEnq_ctl03_HypLnkRegister']")).click();
				//			Thread.sleep(1000);
				//			ArrayList<String> admissionForm =new ArrayList<String>(dr.getWindowHandles()) ;
				//			System.out.println(admissionForm);
				//			dr.switchTo().window(admissionForm.get(2));
				//			Thread.sleep(1000);
				//			//dr.manage().window().maximize();
				//			System.out.println(dr.getTitle());
				//			dr.findElement(By.xpath("//input[@name='txtbplace']")).sendKeys("Nagpur");
				//			WebElement classSect = dr.findElement(By.xpath("//select[@name='lstclasssec']"));
				//			Select selClassSec= new Select(classSect);
				//			selClassSec.selectByIndex(1);
				//			Thread.sleep(1000);
				//			dr.findElement(By.xpath("//input[@name='txtpstd']")).sendKeys("PresentClass");
				//			Thread.sleep(1000);
				//			WebElement motherTongue = dr.findElement(By.xpath("//select[@name='cmbMotherTongue']"));
				//			Select selMothetTongue = new Select(motherTongue);
				//			selMothetTongue.selectByIndex(3);
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Element is not present, hence not displayed as well");
			dr.findElement(By.xpath("//table[@id='gvListAdmissEnq']//tr[2]//td//a[normalize-space(text())='Collect Payment']")).click();
			Thread.sleep(500);
			dr.switchTo().frame(dr.findElement(staff_iFrameAtCollectPayment));
			String amountToPay = dr.findElement(staff_amount).getText();
			Thread.sleep(500);
			dr.findElement(staff_byCashChkBox).click();
			Thread.sleep(1000);
			dr.findElement(staff_amountTextBox).sendKeys(amountToPay);
			Thread.sleep(1000);
			dr.findElement(staff_submitBtn).click();
			Thread.sleep(1000);
			dr.switchTo().window(newTab.get(1));
			Thread.sleep(1000);
			dr.findElement(staff_close);
			Thread.sleep(1000);
			dr.switchTo().defaultContent();
			Thread.sleep(1000);
			dr.findElement(staff_close);
			Thread.sleep(1000);
		}



		}
	}





