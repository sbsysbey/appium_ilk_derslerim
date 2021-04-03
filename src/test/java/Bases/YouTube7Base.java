package Bases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class YouTube7Base {
    public static AndroidDriver lunchAndroid() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "02157df22c9fda16");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Apps\\scroll-dragNdrop.apk");
        desiredCapabilities.setCapability("appPackage", "com.google.android.youtube");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");

        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
