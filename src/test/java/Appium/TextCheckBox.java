package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import java.net.MalformedURLException;


public class TextCheckBox extends Base{
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        /*
        Api demos => preference => preference dependencies
        => Wifi check box   tikla
        => wifi settings => text kutusuna "Hello World" => OK
         */
        AndroidDriver driver = lunchAndroid();
        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/edit").sendKeys("Hello World");
        Thread.sleep(3000);
        driver.findElementById("android:id/button1").click();
    }
}
