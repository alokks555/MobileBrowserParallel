package com.mobileauto.testclass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mobileauto.config.LoadPropertiesData;
import com.mobileauto.config.StorePropertiesData;
import com.mobileauto.report.GenerateReport;
import com.mobileauto.utilities.KeywordLibrary;

import Main.Setup;
import io.appium.java_client.functions.ExpectedCondition;

public class Login extends Setup {
	ExtentTest currentTest;
	HashMap<String, String> classDataMap;
	Properties prop;
	

	@BeforeSuite
	public void beforeExecutingSuite() throws IOException, InterruptedException {
		GenerateReport generateReport = new GenerateReport();
		generateReport.extentReporting();

		prop = new LoadPropertiesData()
				.loadPropertiesFile(new File("").getCanonicalPath() + "/data/Android.properties");
		classDataMap = new StorePropertiesData().storePropIntoHashMap(prop);	
		
		
		
	}

	
	@BeforeClass
	@Parameters({"deviceModel", "deviceName", "platformName" })
	  public void initiateDriver(String deviceModel,String deviceName, String platformName) throws InterruptedException, IOException {
		
		startDevice(deviceModel,deviceName,platformName);

		System.out.println("Classes are ready to be executed");
	  }
	 

	
	@Test
	public void verifyElements() throws IOException, InterruptedException {
	
		currentTest = GenerateReport.extent.createTest("Login");
		key.setExtentTest(currentTest);
		System.out.println("Execution Started");
		System.out.println("====================Login Function======================");
		Thread.sleep(5000);
		/*
		 * WebElement SignInBtn =
		 * key.returnElement(classDataMap.get("SignIn_Account_btn")); SignInBtn.click();
		 * currentTest.log(Status.PASS, "Sign In button Clicked");
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		 * 
		 * WebElement EnterEmail =
		 * key.returnElement(classDataMap.get("SignIn_Email_tbx")); EnterEmail.click();
		 * EnterEmail.sendKeys("alok143m@gmail.com"); currentTest.log(Status.PASS,
		 * "Email ID entered");
		 * 
		 * wait = new WebDriverWait(driver, 10); WebElement EnterPass =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//*[contains(text(),'Amazon password')]")));
		 * //key.returnElement(classDataMap.get("SignIn_Password_tbx"));
		 * //EnterPass.click(); EnterPass.sendKeys("Alokkumar121");
		 * currentTest.log(Status.PASS, "Password entered");
		 * 
		 * WebElement SubmitBtn =
		 * key.returnElement(classDataMap.get("SignIn_Submit_btn")); SubmitBtn.click();
		 * currentTest.log(Status.PASS, "Clicked on Submit button");
		 */
		
		/*
		 * WebElement DepartmentBtn =
		 * key.returnElement(classDataMap.get("HP_Department_Btn"));
		 * DepartmentBtn.click();
		 * 
		 * WebElement ElectronicsOpt =
		 * key.returnElement(classDataMap.get("HP_Electronics_Btn"));
		 * ElectronicsOpt.click();
		 * 
		 * WebElement HeadphoneLbl =
		 * key.returnElement(classDataMap.get("HP_Headphone_Btn"));
		 * HeadphoneLbl.click();
		 * 
		 * WebElement FirstOpt =
		 * key.returnElement(classDataMap.get("HP_FirstOption_Btn")); FirstOpt.click();
		 * 
		 * WebElement AddCart = key.returnElement(classDataMap.get("HP_AddCart_Btn"));
		 * AddCart.click();
		 * 
		 * WebElement AmazonLogo = key.returnElement(classDataMap.get("Amazon_logo"));
		 * AmazonLogo.click();
		 */
		
		
		
		
	}

	@AfterSuite
	public void afterExecutingSuite() {
		GenerateReport.extent.flush();
	}

}
