package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.GeneralStorePage;
import pages.android.HapsiBuradaPages;
import utilities.Driver;

public class EcommercieSteps {

    AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();

          HapsiBuradaPages hapsiBuradaPages=new HapsiBuradaPages();
GeneralStorePage generalStorePage = new GeneralStorePage();
        @Given("general stora gidilir")
        public void generalStoraGidilir() {


            driver.getKeyboard();
        }

    @And("ulke dropdownundan {string} secilir")
    public void ulkeDropdownundanSecilir(String ulke) {
            generalStorePage.ulkelerdrop.click();
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"France\"))");
         generalStorePage.ulkelerFrance.click();
    }

    @And("name girilir")
    public void nameGirilir() {

            generalStorePage.letsShop.click();
          Assert.assertTrue(driver.findElementByXPath("//android.widget.Toast").getAttribute("name").equals("Please enter your name"));
        System.out.println(driver.findElementByXPath("//android.widget.Toast").getAttribute("name"));
            generalStorePage.name.sendKeys("isim");

    }
    @And("cinsiyet secilir")
    public void cinsiyetSecilir() {
generalStorePage.cinsiyet.click();
    }



    @And("Letsstep butonu tiklanir")
    public void letsstepButonuTiklanir() {
            generalStorePage.letsShop.click();
    }

    @Then("signin yapildigi assert edilir")
    public void signinYapildigiAssertEdilir() throws InterruptedException {
            Thread.sleep(2000);
        Assert.assertTrue(generalStorePage.urun.isDisplayed());
    }



}
