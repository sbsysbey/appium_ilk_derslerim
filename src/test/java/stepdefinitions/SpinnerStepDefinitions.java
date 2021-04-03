package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.SpinnerPage;
import utilities.Driver;

public class SpinnerStepDefinitions {
SpinnerPage spinnerPage=new SpinnerPage();


    @And("kullanici spinner sayfasina gider")
    public void kullaniciSpinnerSayfasinaGider() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");
spinnerPage.viewSpinnerPage.click();
    }

    @And("kullanici ilk dropdownda Blue secer")
    public void kullaniciIlkDropdowndaBlueSecer() {
        spinnerPage.spinnerColor.click();
        spinnerPage.spinnercolorBlue.click();
    }

    @Then("{string} secildigini onaylar")
    public void blueSecildiginiOnaylar(String color) {
        System.out.println(spinnerPage.spinnerColorKontrol.getText()+"  :  gelen -beklenen :   "+color);
        Assert.assertTrue(spinnerPage.spinnerColorKontrol.getText().equals(color));
    }

    @And("kullanici ikinci dtopdownda Mars secer")
    public void kullaniciIkinciDtopdowndaMarsSecer() {
        spinnerPage.spinnerPlanet.click();
        spinnerPage.spinnerPlanetMars.click();
    }

    @Then("{string} secildigini onayla")
    public void secildiginiOnayla(String planet) {
        System.out.println(spinnerPage.spinnerPlanetKontrol.getText()+"  :  gelen -beklenen :   "+planet);
        Assert.assertTrue(spinnerPage.spinnerPlanetKontrol.getText().equals(planet));
    }
}
