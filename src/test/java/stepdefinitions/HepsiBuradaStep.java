package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import pages.android.HapsiBuradaPages;
import utilities.Driver;

import java.time.Duration;

public class HepsiBuradaStep {

    HapsiBuradaPages hapsiBuradaPages=new HapsiBuradaPages();

    @Given("kullanici google ye girer")
    public void kullaniciGoogleYeGirer() {
      hapsiBuradaPages.googlesearch.click();
    }
    @Given("kullanici goglede {string} yazar ve aratir")
    public void kullaniciGogledeYazarVeAratir(String arg0) throws InterruptedException {

      hapsiBuradaPages.googlesearch2.sendKeys(arg0);
        hapsiBuradaPages.hepsiburadaSearchclick.click();
        Thread.sleep(4000);
     /*  if (hapsiBuradaPages.locateclose.isDisplayed()){
          hapsiBuradaPages.locateclose.click();       }
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.tap(PointOption.point(530,1670))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));
        touchAction.tap(PointOption.point(530,1670))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));
        touchAction.tap(PointOption.point(720,1640))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));

      Thread.sleep(4000);
       AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
      driver.switchTo().alert().dismiss();
       hapsiBuradaPages.hepsiBuradapopupClose.click();
*/
     //   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"\"))").click();
       hapsiBuradaPages.hepsiburadaSayfasi.click();




    }

    @Given("kullanici hepsiburada da kedi mamasi urunlerini arar")
    public void kullaniciHepsiburadaDaKediMamasiUrunleriniArar() throws InterruptedException {
         //hapsiBuradaPages.hepsiburadaSearch.sendKeys("kedi maması",Keys.ENTER);
Thread.sleep(3000);
        hapsiBuradaPages.hepsiburadaaramatiklamakicin.click();
hapsiBuradaPages.hepsiburadaAramakicin.sendKeys("kedi maması");
        hapsiBuradaPages.hepsiburadaAramakicin.click();
    }

    @Given("kullanici en ucuz urunu sepete ekler")
    public void kullaniciEnUcuzUrunuSepeteEkler() throws InterruptedException {
        hapsiBuradaPages.hepsiburadaSiralamaButonu.click();
        hapsiBuradaPages.hepsiburadaAkilliSiralama.click();
        Thread.sleep(3000);
        hapsiBuradaPages.hepsiburadailkSira.click();
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.tap(PointOption.point(700,777));
        driver.navigate().back();


    }

    @Given("kullanici siteden ayrilir")
    public void kullaniciSitedenAyrilir() {
    }
}
