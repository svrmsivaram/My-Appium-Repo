package day3.OlaSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouch {

	@Test
	public static void Mulititouch() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("deviceName", "f6daa833");
		/*dc.setCapability("deviceName", "Nexus");
		dc.setCapability("udid", "TA93301A0H");
		
		*/
		dc.setCapability("deviceName", "One+");
		//dc.setCapability("udid", "96d6bc4a");
		dc.setCapability("platformVersion", "7.1.1");
		dc.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		dc.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		//dc.setCapability("noReset",true);
		 
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://192.168.43.5:4444/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int height= driver.manage().window().getSize().height;
		int width = driver.manage().window().getSize().width;
		
		
		MultiTouchAction multitouch = new MultiTouchAction(driver);
		
		TouchAction touch1 = new TouchAction(driver);
		TouchAction touch2 = new TouchAction(driver);
		
		/*touch1.press(width/2, height/2).waitAction(Duration.ofSeconds(10)).moveTo(0, width-100).release();
		touch2.press(width/2, height/2).waitAction(Duration.ofSeconds(10)).moveTo(0, height-100).release();
	*/	
		
		
		touch1.press(width-100,0).waitAction(Duration.ofSeconds(5)).moveTo(width/2, height/2).release();
		touch2.press(0,height-100).waitAction(Duration.ofSeconds(5)).moveTo(width/2, height/2).release();
	
		multitouch.add(touch1).add(touch2).perform();
		driver.close();
		
		
		

}
}

