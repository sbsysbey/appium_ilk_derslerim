package Appium;

import Bases.ApiDemos_Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;


import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Switch10 extends ApiDemos_Base {
  @Test
    public void Switch10() throws MalformedURLException, InterruptedException {

    AndroidDriver driver=lunchAndroid();
      driver.findElementByXPath("//android.widget.TextView[@content-desc='Preference']").click();
      Thread.sleep(2000);
      driver.findElementByXPath("//android.widget.TextView[@text='5. Preferences from code']").click();
      //driver.findElementByClassName("(android.widget.TextView)[8]").click();
        driver.findElementById("android:id/switch_widget").click();
/*
        List<WebElement> checkbox1=driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"")
        TouchAction touchAction=new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element())).perform();
*/
}
}
