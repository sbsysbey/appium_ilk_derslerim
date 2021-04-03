package Appium;

import Bases.Print_Alma_Base;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import java.net.MalformedURLException;

public class Rahmi_2 extends Print_Alma_Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();
        Actions actions=new Actions(driver);
actions.clickAndHold(driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/com.sec.samsung.gallery.glview.composeView.ThumbObject[1]")).perform();
Thread.sleep(3000);
driver.findElementById("com.sec.android.gallery3d:id/action_share").click();
Thread.sleep(3000);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ScrollView/android.widget.LinearLayout/com.android.internal.widget.ViewPager/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[4]/android.widget.FrameLayout").click();
        Thread.sleep(3000);
driver.findElementById("com.android.printspooler:id/destination_spinner").click();
driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]").click();
driver.findElementById("com.android.printspooler:id/print_button").click();
    }}

