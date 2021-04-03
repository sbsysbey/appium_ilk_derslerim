package Appium;

import Bases.Chrome10BAse;
import Bases.Chrome7Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;

public class youtube extends Chrome7Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        /*
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "02157df22c9fda16");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        // desiredCapabilities.setCapability("automationName","UiAutomator2");
       desiredCapabilities.setCapability("chromedriverExecutable", "C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Driver\\chromedriver.exe");
       desiredCapabilities.setCapability("appPackage", "com.android.chrome");
       desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

      // desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
*/

        AndroidDriver driver = lunchAndroid();



      //  driver.findElementById("com.android.chrome:id/search_box_text").sendKeys("https://youtube.com");
        Actions actions=new Actions(driver);
        actions.sendKeys(driver.findElementById("com.android.chrome:id/search_box_text"),"https://youtube.com").sendKeys(Keys.ENTER);
      //  driver.findElementById("com.android.chrome:id/search_box_text").sendKeys(Keys.ENTER);
 //driver.get("https://youtube.com");

        if (driver.findElementByXPath("//button[@class='c3-material-button-button']").isDisplayed()){
            driver.findElementByXPath("(//button[@class='c3-material-button-button'])[1]").click();
        }
        if (driver.findElementByXPath("//button[@class='c3-material-button-button']").isDisplayed()){
            driver.findElementByXPath("(//button[@class='c3-material-button-button'])[2]").click();
        }
       driver.findElementByXPath("(//button[@class='icon-button topbar-menu-button-avatar-button'])[1]").click();
       driver.findElementByXPath("//input[@class='searchbox-input title']").sendKeys("ümit sönmez ares sera cennetten geliyorum");
        driver.findElementByXPath("//input[@class='searchbox-input title']").sendKeys(Keys.ENTER);
Thread.sleep(2);
        driver.findElementByXPath("(//a[@class='compact-media-item-metadata-content'])[1]").click();


        }
}
