package Appium;

import Bases.YouTube10Base;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Youtube10 extends YouTube10Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();

     //   driver.get("https://youtube.com");

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='Search']").click();


        Actions action =new Actions(driver);

        action.click(driver.findElementById("com.google.android.youtube:id/search_edit_text")).sendKeys("aser resa excel dersleri").perform();
        action.sendKeys(Keys.ENTER).perform();

        driver.findElementById("com.google.android.youtube:id/channel_item").click();
        //  action.click(driver.findElementById("com.google.android.youtube:id/channel_name")).perform();
        action.click(driver.findElementByXPath("//android.widget.Button[@content-desc='Playlists']")).perform();
        action.click(driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Aman Dikkat - by Aser Resa Excel Dersleri - 4 videos']")).perform();
        action.click(driver.findElementById("com.google.android.youtube:id/playlist_fab")).perform();
       /* action.click(driver.findElementByXPath("//android.widget.Button[@content-desc='Oynatma listeleri']")).perform();
        action.click(driver.findElementByXPath("//android.view.ViewGroup[@content-desc='Aman Dikkat - Oluşturan: Aser Resa Excel Dersleri - 4 video']")).perform();
        action.click(driver.findElementById("com.google.android.youtube:id/playlist_fab")).perform();*/
    }}



