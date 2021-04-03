package Bases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ScrollBase {


        public static AndroidDriver lunchAndroid() throws MalformedURLException, InterruptedException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
          //  desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Apps\\scroll-dragNdrop.apk");
            desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Apps\\apiDemos.apk");
            desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
            desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
            URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
            AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
        public static IOSDriver<IOSElement> lunchiOS() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8");
            desiredCapabilities.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
            URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
            IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(url,desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
    }


