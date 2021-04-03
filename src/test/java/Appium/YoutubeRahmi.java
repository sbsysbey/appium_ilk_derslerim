package Appium;

import Bases.YouTube10Base;
import Bases.YouTube7Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class YoutubeRahmi extends YouTube7Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();

        driver.get("https://youtube.com");

Thread.sleep(4);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='Ara']").click();
        Thread.sleep(3);

        Actions action =new Actions(driver);

      action.click(driver.findElementById("com.google.android.youtube:id/search_edit_text")).sendKeys("aser resa excel dersleri").perform();
      action.sendKeys(Keys.ENTER).perform();

        driver.findElementById("com.google.android.youtube:id/channel_item").click();
     //  action.click(driver.findElementById("com.google.android.youtube:id/channel_name")).perform();

        action.click(driver.findElementByXPath("//android.widget.Button[@content-desc='Oynatma listeleri']")).perform();
        action.click(driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Aman Dikkat - Oluşturan: Aser Resa Excel Dersleri - 4 video']")).perform();
        action.click(driver.findElementById("com.google.android.youtube:id/playlist_fab")).perform();
}}

