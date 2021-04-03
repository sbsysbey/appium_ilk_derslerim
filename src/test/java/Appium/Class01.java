package Appium;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Class01 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");
//        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
        desiredCapabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Apps\\GestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);
        //id
        driver.findElementById("com.davemac327.gesture.tool:id/addButton");
        // driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton"));
        //xpath text ile
        driver.findElementByXPath("//*[@text='Add gesture']");
        //xpath index ile
        driver.findElementByXPath("(//android.widget.Button)[1]");
        //xpath attribute
        driver.findElementByXPath("//android.widget.Button[@text='Add gesture']").click();
       Thread.sleep(5);
        driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("aslan");

    }
}