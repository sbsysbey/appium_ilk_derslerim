package Appium;

import Bases.ScrollBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.time.Duration;

public class Scroll extends ScrollBase {
    @Test
    public void test() throws MalformedURLException, InterruptedException{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        AndroidDriver driver=lunchAndroid();

        driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']").click();
        Dimension dimension=driver.manage().window().getSize();
        int bas_x=(int)(dimension.height*0.5);
        int bas_y=(int)(dimension.height*0.8);
        int son_x=(int)(dimension.width*0.5);
        int son_y=(int)(dimension.width*0.2);
TouchAction touchAction=new TouchAction(driver);
touchAction.press(PointOption.point(bas_x,bas_y))
        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
        .moveTo(PointOption.point(son_x,son_y)).release().perform();

}}
