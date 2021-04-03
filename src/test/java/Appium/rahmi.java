package Appium;

import Bases.YouTube10Base;
import Bases.YouTube7Base;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class rahmi extends YouTube7Base{
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Ara\"]").click();
        driver.findElementById("com.google.android.youtube:id/search_edit_text").sendKeys("ares sera ümit sönmez");
        Actions action=new Actions(driver);
       action.sendKeys(Keys.ENTER).perform();
driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Kanala git\"])[1]").click();
driver.findElementByXPath("//android.widget.Button[@content-desc='Oynatma listeleri']").click();
driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"okumalar - Oluşturan: Ares Sera - 8 video\"]").click();
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]").click();
Thread.sleep(5000);
driver.quit();

    }}
