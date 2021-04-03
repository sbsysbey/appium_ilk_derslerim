package stepdefinitions;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import pages.android.*;
import utilities.Driver;

import java.time.Duration;

public class ScrollingStepDefinition {
    HomePage homePage = new HomePage();
static int counter=0;
    ViewPage viewPage=new ViewPage();
    @Given("kullanici webview sayfasına gider")
    public void kullaniciWebviewSayfasinaGider() throws InterruptedException {
        Dimension dimension= Driver.getAppiumDriver().manage().window().getSize();
        int bas_x=(int)(dimension.height*0.5);
        int bas_y=(int)(dimension.height*0.9);
        int son_x=(int)(dimension.width*0.5);
        int son_y=(int)(dimension.width*0.2);
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(bas_x,bas_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(son_x,son_y)).release().perform();
        touchAction.press(PointOption.point(bas_x,bas_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(son_x,son_y)).release().perform();
Thread.sleep(5000);
        viewPage.ScrollingTab.click();
    }

    @Given("kullanici Ui ile webview sayfasina gider")
    public void kullaniciUiIleWebviewSayfasinaGider() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
   viewPage.ScrollingTab.click();
    }

    @And("kullanici textSwitcher sayfasine gider")
    public void kullaniciTextSwitcherSayfasineGider() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"))");
        viewPage.textSwitcher.click();

    }

    @And("kullanici {int} kez  next butonunu tiklar")
    public void kullaniciKezNextButonunuTiklar(int kez) {
        for (int i=1;i<=kez;i++){
            viewPage.nextButton.click();
            counter++;
        }

    }



    @Then("kullnici sayiyiyi kontrol eder")
    public void kullniciSayiyiyiKontrolEder() {
        System.out.println("Yazan Rakam: "+Integer.parseInt(viewPage.rakam.getText()));
           Assert.assertTrue(Integer.parseInt(viewPage.rakam.getText())==counter);

    }

    @And("kullanici Tabs sekmesine gider")
    public void kullaniciTabsSekmesineGider() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))");

        viewPage.viewTabSekmesi.click();
    }

    @And("kullanici scrolling sekmesine gider")
    public void kullaniciScrollingSekmesineGider() {
viewPage.viewTabScrolling.click();
    }

    @And("kullanici TABonyedi sekmesine gider")
    public void kullaniciTABSekmesineGider() {
        Dimension dimension= Driver.getAppiumDriver().manage().window().getSize();

        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(900,300))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(030,300)).release().perform();

        touchAction.press(PointOption.point(900,300))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(030,300)).release().perform();
        touchAction.press(PointOption.point(900,300))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(030,300)).release().perform();

        viewPage.viewTab17.click();

    }

    @Then("kullanici yaziyi kontrol eder")
    public void kullaniciYaziyiKontrolEder() {
        System.out.println(viewPage.tab17Yazisi.getText());
        Assert.assertTrue(viewPage.tab17Yazisi.getText().equals("Content for tab with tag Tab 17"));
    }

    @And("tabonyedi")
    public void tabonyedi() {
        viewPage.viewTab17.click();
        System.out.println(viewPage.tab17Yazisi.getText());
    }
}
