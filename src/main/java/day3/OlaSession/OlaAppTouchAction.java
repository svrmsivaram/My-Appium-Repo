package day3.OlaSession;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class OlaAppTouchAction {

@Test
public static void ola() throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "OnePlus");
		dc.setCapability("platformVersion", "7.1.1");
		//dc.setCapability("udid", "96d6bc4a");
		//dc.setCapability("platformName", "android");
		/*dc.setCapability("deviceName", "Nexus");
		dc.setCapability("udid", "TA93301A0H");
*/
		dc.setCapability("appPackage", "com.olacabs.customer");
		dc.setCapability("appActivity", "com.olacabs.customer.ui.SplashActivity");
		dc.setCapability("noReset",true);
		 
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://192.168.43.5:4444/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//Single Touch
		TouchAction action = new TouchAction(driver);
		action.press(driver.findElementByXPath("//android.widget.TextView[@text='Prime']")).waitAction(Duration.ofSeconds(5))
		.moveTo(driver.findElementByXPath("//android.widget.TextView[@text='Auto']")).release().perform();
		
		
		//Multitouch
		
		
		WebElement map = driver.findElementByXPath("//android.view.View[@content-desc='Google Map']");
		int height= map.getSize().height;
		int width = map.getSize().width;
		
		
		MultiTouchAction multitouch = new MultiTouchAction(driver);

		MultiTouchAction multitouch1 = new MultiTouchAction(driver);
		
		TouchAction touch1 = new TouchAction(driver);
		TouchAction touch2 = new TouchAction(driver);
		TouchAction touch3 = new TouchAction(driver);
		TouchAction touch4 = new TouchAction(driver);
		
		touch1.press(360, 580).waitAction(Duration.ofSeconds(2)).moveTo(600,300).release();
		touch2.press(360, 580).waitAction(Duration.ofSeconds(2)).moveTo(50,860).release();
				
		
		touch3.press(600,300).waitAction(Duration.ofSeconds(5)).moveTo(360, 580).release();
		touch4.press(50,860).waitAction(Duration.ofSeconds(5)).moveTo(360, 580).release();
	
		multitouch.add(touch1).add(touch2).perform();

		multitouch1.add(touch3).add(touch4).perform();
		driver.close();
		
		
}

}
