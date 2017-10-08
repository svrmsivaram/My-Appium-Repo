package day1.session1;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "f6daa833");
		dc.setCapability("appPackage", "com.testleaf.leaforg");
		dc.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		 
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("svrmsivaram@gmail.com");
		driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("apache@1L");
		driver.findElementByXPath("//android.widget.Button[@content-desc='LOGIN']").click();
		
		
		

	}

}
