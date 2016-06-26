package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UISelector {
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File("src");
		File app = new File(appDir,"BookMyShow–Movie Tickets,Plays_4.3.6_apk-dl.com.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Thread.sleep(3000);
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		Thread.sleep(5000);
		//List<WebElement> count=driver.findElementByAndroidUIAutomator("new UiSelector().checkable(true)");
		//System.out.println(count.size());
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Hyderabad\")").click();
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		driver.sendKeyEvent(AndroidKeyCode.MENU);
		
	}

}
