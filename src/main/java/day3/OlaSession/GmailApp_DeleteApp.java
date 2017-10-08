package day3.OlaSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GmailApp_DeleteApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "f6daa833");
		dc.setCapability("appPackage","com.google.android.gm");
		dc.setCapability("appActivity","com.google.android.gm.ConversationListActivityGmail");
		dc.setCapability("noReset", true);
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TouchAction touch1 = new TouchAction(driver);
		touch1.press(driver.findElementByXPath("//android.view.View[@content-desc='Unread Google Local Guides, Something new for the festive season, Share the celebration on Google Maps. Share Your Festive Season Photos Across... at 12:16 PM']"))
		.waitAction(Duration.ofSeconds(2))
		.moveTo(driver.findElementByXPath("//android.view.View[@content-desc=' redBus, redBus Ticket - TKAM33042394, print Ticket eTICKET Need help with your trip? Boarding Point Ph. No.:044 438... at 7:24 PM']"))
		.release().perform();
		
		TouchAction touch2 = new TouchAction(driver);
		
	 touch2.press(286,1118).waitAction(Duration.ofSeconds(2))
	 .moveTo(286,220).release().perform();
	 
	 TouchAction touch3 = new TouchAction(driver);
	 
	 touch3.press(95,670).waitAction(Duration.ofSeconds(5))
	 .moveTo(580,670).release().perform();
	 
	 
		

	}

}
