package Main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobileauto.utilities.KeywordLibrary;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Setup {

	public static WebDriver driver;
	static String projectDir;
	public static WebDriverWait wait; 
	String imageDir;
	String timeStamp;
	protected KeywordLibrary key = new KeywordLibrary();

	
	public void startDevice(String deviceModel, String deviceName, String platformName) throws InterruptedException, IOException {
		
		timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		projectDir = new File(".").getCanonicalPath();
		imageDir ="./reports/screenshots/"+timeStamp+"/";
	
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("model", deviceModel);
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("deviceName",deviceName);
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("noReset", true);

		System.setProperty("webdriver.chrome.driver", projectDir + "/Jars/chromedriver.exe");
		
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.get("https://www.amazon.com");
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		key.setDriver(driver);
		key.setSSImageDir(imageDir);
		key.setWait(wait);
		
		
		System.out.println("Setup Completed and Browser launched !!!");
		
	}

}


