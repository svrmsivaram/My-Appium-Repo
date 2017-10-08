package day3.OlaSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LeafTapOrg_Login {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "f6daa833");
		dc.setCapability("appPackage", "com.testleaf.leaforg");
		dc.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		dc.setCapability("nativeWebScreenshots", true);
		dc.setCapability("autoWebview", true);

		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//input[@formcontrolname='email']").click();
		driver.findElementByXPath("//input[@formcontrolname='email']").sendKeys("saravanan1@testleaf.com");
		driver.findElementByXPath("//input[@formcontrolname='password']").click();
		driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys("Appium@123");
		driver.findElementByXPath("//span[text()='Login']").click();
		driver.findElementByXPath("//span[text()='Settings']").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
