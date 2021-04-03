package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class Calculator {
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
    desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\FUJ\\IdeaProjects\\mobilTesting\\src\\Apps\\Calculator.apk");


        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");




        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);
        //id
        WebElement num0 = driver.findElementById("com.google.android.calculator:id/digit_0");
        WebElement num1 = driver.findElementById("com.google.android.calculator:id/digit_1");
        WebElement num2 = driver.findElementById("com.google.android.calculator:id/digit_2");
        WebElement num3 = driver.findElementById("com.google.android.calculator:id/digit_3");
        WebElement num4 = driver.findElementById("com.google.android.calculator:id/digit_4");
        WebElement num5 = driver.findElementById("com.google.android.calculator:id/digit_5");
        WebElement num6 = driver.findElementById("com.google.android.calculator:id/digit_6");
        WebElement num7 = driver.findElementById("com.google.android.calculator:id/digit_7");
        WebElement num8 = driver.findElementById("com.google.android.calculator:id/digit_8");
        WebElement num9 = driver.findElementById("com.google.android.calculator:id/digit_9");

        WebElement plus = driver.findElementById("com.google.android.calculator:id/op_add");
        WebElement minus = driver.findElementById("com.google.android.calculator:id/op_sub");
        WebElement mul = driver.findElementById("com.google.android.calculator:id/op_mul");
        WebElement div = driver.findElementById("com.google.android.calculator:id/op_div");
        WebElement equal = driver.findElementById("com.google.android.calculator:id/eq");
        //35+24=59
        num3.click();//3
        num5.click();//5
        plus.click();//+
        num5.click();//2
        Thread.sleep(2000);
        num6.click();//4
        mul.click();
        num0.click();
        Thread.sleep(2000);
        WebElement preResult = driver.findElementById("com.google.android.calculator:id/result_preview");
        String exPreResult = preResult.getText();
        equal.click(); //=
        Thread.sleep(2000);
        WebElement acResult = driver.findElementByXPath("//android.widget.TextView[@content-desc='No formula']");

        System.out.println(exPreResult);
        System.out.println(acResult);

       // Assert.assertEquals(exPreResult,acResult.getText());
        Thread.sleep(3000);
        //close app
        driver.quit();
    }
}