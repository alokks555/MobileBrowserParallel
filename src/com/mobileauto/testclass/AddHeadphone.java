package com.mobileauto.testclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddHeadphone extends Login {

	@Test
	public void Navigatetoheadphone() throws IOException {
		
		WebElement DepartmentBtn = key.returnElement(classDataMap.get("HP_Department_Btn"));
		DepartmentBtn.click();
		
		WebElement ElectronicsOpt = key.returnElement(classDataMap.get("HP_Electronics_Btn"));
		ElectronicsOpt.click();
		
		WebElement HeadphoneLbl = key.returnElement(classDataMap.get("HP_Headphone_Btn"));
		HeadphoneLbl.click();
		
		WebElement FirstOpt = key.returnElement(classDataMap.get("HP_FirstOption_Btn"));
		FirstOpt.click();
		
	
		
		
		
	}
	
}
