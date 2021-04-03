package Appium;

import Bases.WhatsApp10Base;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

import java.net.MalformedURLException;

public class WhatsApp10 extends WhatsApp10Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

    AndroidDriver driver = lunchAndroid();

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView").click();
        driver.findElementById("com.whatsapp:id/fab").click();

        driver.findElementById("com.whatsapp:id/menuitem_search").click();
        driver.findElementById("com.whatsapp:id/search_src_text").sendKeys("skpl");
       driver.findElementById("com.whatsapp:id/contactpicker_row_name").click();
       driver.findElementById("com.whatsapp:id/entry").sendKeys("olm");

    //  Thread.sleep(3);
     // driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Voice call']").click();



}}
