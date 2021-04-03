package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import pages.android.AnimasyonPages;
import utilities.Driver;

import java.util.List;

public class animasyonStepDefination {

AnimasyonPages animasyonPages=new AnimasyonPages();
    @Given("kullanici controls sayfasina gider")
    public void kullaniciControlsSayfasinaGider() {
        animasyonPages.viewControlSayfasi.click();

    }

    @Given("kullanici customtheme sayfasina gider")
    public void kullaniciCustomthemeSayfasinaGider() {
        animasyonPages.viewControlCustomTheme.click();
    }

    @And("kullanici Radiobutonu tiklar")
    public void kullaniciRadiobutonuTiklar() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.navigate().back();
                       animasyonPages.viewControlRadioButon1.click();
    }

    @Given("kullanici stari tiklar")
    public void kullaniciStariTiklar() {





        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();




        List<WebElement> radioBox1 =  driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"io.appium.android.apis:id/star\").checked(false)");



        if(radioBox1.size()>0){
            radioBox1.get(0).click();
        }
        animasyonPages.viewControlRadioStar.click();
        Assert.assertTrue(radioBox1.size()==0);



    }

    @Given("kullanici ilkbutonu on yapar")
    public void kullaniciIlkbutonuOnYapar() {
        animasyonPages.viewControlRadioToggle1.click();

    }

    @Given("kullanici merkuru secer ve test eder")
    public void kullaniciMerkuruSecerVeTestEder() {
        animasyonPages.viewControlmercury1.click();
        animasyonPages.viewControlVenus.click();

        Assert.assertTrue(animasyonPages.viewControlmercury1.getText().equals("Venus"));
    }

    @Given("kullanici text yazar")
    public void kullaniciTextYazar() {
        animasyonPages.viewControlhinText.sendKeys("merhaba");

    }

    @Given("kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        animasyonPages.viewControlSaveButton.click();
    }
}