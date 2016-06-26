package Appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BookMyShow {

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
		System.out.println(driver.isLocked());
		
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		//driver.scrollTo("Bhimavaram").click();
		Thread.sleep(2000);
		MobileElement me= (MobileElement) driver.findElementByClassName("android.widget.CheckedTextView");
		Thread.sleep(1000);
		System.out.println(driver.getContext());
		me.swipe(SwipeElementDirection.UP, 2000);
		me.zoom();
		/*driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/signUp").click();
		List<WebElement> el= driver.findElements(By.className("android.widget.EditText"));
		el.get(0).sendKeys("Rajeev");
		el.get(1).sendKeys("Maddipati");
		el.get(2).sendKeys("rajeev.maddipati");
		el.get(4).sendKeys("6129408584");*/
		
		
	}

}
