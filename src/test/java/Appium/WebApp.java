package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class WebApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Driver\\chromedriver.exe");
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
       /*
       etsy.com git
       sign in tikla
       Sign in continue onayla
       */
        driver.get("https://etsy.com");
        if(driver.findElementsByXPath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']").size()>0){
            driver.findElementsByXPath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']").get(0).click();
        }
//        driver.findElementByXPath("//android.widget.TextView[@text='Sign in']").click();
//        Thread.sleep(3000);
//        WebElement actualText = driver.findElementById("join-neu-overlay-title");
//        String expectedText = "Sign in to continue";
//
//        Assert.assertEquals(expectedText,actualText);
    }
}
