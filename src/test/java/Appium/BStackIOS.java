package Appium;



import java.net.URL;
        import java.util.List;
        import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.support.ui.ExpectedConditions;

        import io.appium.java_client.MobileBy;

        import io.appium.java_client.ios.IOSElement;

public class BStackIOS {


@Test
        public  void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "skoru1");
        caps.setCapability("browserstack.key", "z7jEUCnCjxrvpeyWyNec");

        // Set URL of the application under test
        caps.setCapability("app", "bs://711313ebf6e8009771867efc095171574c7cc240");

        // Specify device and os_version for testing
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("os_version", "12");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java iOS");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);


    driver.findElementById("Text Button").click();
    IOSElement title = driver.findElementById("Text Output");
    Assert.assertTrue(title.isDisplayed());
    driver.findElementByXPath("//XCUIElementTypeTextField[@name='Text Input']").sendKeys("IOS");
    Thread.sleep(3000);
    driver.findElementByXPath("(//XCUIElementTypeButton[@name='UI Elements'])[1]").click();
    driver.findElementById("Alert Button").click();
    IOSElement alert = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Alert']");
    Assert.assertTrue(alert.isDisplayed());
    driver.findElementById("OK").click();
        /* Write your Custom code here */
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }

}