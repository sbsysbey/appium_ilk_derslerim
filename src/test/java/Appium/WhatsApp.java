package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class WhatsApp extends Base{
    @Test
    public void test() throws MalformedURLException, InterruptedException {


        AndroidDriver driver = lunchAndroid();


        driver.findElementById("com.whatsapp:id/fab").click();
        driver.findElementById("com.whatsapp:id/menuitem_search").click();
        driver.findElementById("com.whatsapp:id/search_src_text").sendKeys("cvt");
        driver.findElementById("com.whatsapp:id/contactpicker_row_name").click();
        driver.findElementById("com.whatsapp:id/entry").sendKeys("sizede iyi günler");
        driver.findElementById("com.whatsapp:id/send").click();




        System.out.println(driver.findElementByClassName("android.widget.TextView").getAttribute("text"));
        Assert.assertEquals("merhaba",driver.findElementByClassName("android.widget.TextView").getText());


    }}
