package day3.OlaSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HybridApp_TestLeaf {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "f6daa833");
		dc.setCapability("appPackage", "com.testleaf.leaforg");
		dc.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		dc.setCapability("nativeWebScreenshots", true);
		dc.setCapability("autoWebview", true);

		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByLinkText("Create an Account").click();

		driver.findElementByXPath("//input[@formcontrolname='fname']").click();
		driver.findElementByXPath("//input[@formcontrolname='fname']").sendKeys("Sivaram");
		driver.findElementByXPath("//input[@formcontrolname='lname']").click();
		driver.findElementByXPath("//input[@formcontrolname='lname']").sendKeys("Sel");
		driver.findElementByXPath("//input[@formcontrolname='dob']").click();
		
		driver.context("NATIVE_APP");
		driver.findElementByXPath("//android.view.View[@content-desc='01 September 2017']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Set']").click();
	
		driver.context("WEBVIEW_com.testleaf.leaforg");
		/*Set<String> context = driver.getContextHandles();
		for (String string : context) {
			System.out.println(string);
		}*/
		
		driver.findElementByXPath("//input[@formcontrolname='email']").click();
		driver.findElementByXPath("//input[@formcontrolname='email']").sendKeys("Svrmsivaram@gmail.com");
		
		driver.findElementByXPath("//span[text()='Continue']").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
