package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.PopUpPage;
import utilities.Driver;

public class PopUpStepDefination {

PopUpPage popUpPage=new PopUpPage();


    @Given("click Expandable Lists")
    public void clickExpandableLists() {
        popUpPage.viewExpandableLists.click();
    }

    @Given("click Custom Adapter")
    public void clickCustomAdapter() {
        popUpPage.popCustomAdapter.click();
    }

    @Given("then long pres People NamesGiven click sample action popup")
    public void thenLongPresPeopleNamesGivenClickSampleActionPopup() {
     //   AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
touchAction.longPress(ElementOption.element(popUpPage.popPeopleNames)).perform();
        Assert.assertTrue(popUpPage.popPopup1.isDisplayed());
        popUpPage.popPopup1.click();

    }

    @Then("verify toast message")
    public void verifyToastMessage() {
        System.out.println(popUpPage.popToast);
        Assert.assertTrue(popUpPage.popToast.getText().contains("People"));

    }

    @Given("kullanici popup menu sayfasina gider")
    public void kullaniciPopupMenuSayfasinaGider() {
        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");
        popUpPage.popPopmenu.click();

    }

    @Given("make  popup tikla")
    public void makePopupTikla() {
        popUpPage.popMakePopUp.click();
    }

    @Then("popup acildimi onayla")
    public void popupAcildimiOnayla() {
       Assert.assertTrue( popUpPage.popAdd.isDisplayed());
    }

    @And("kullanici add tiklar")
    public void kullaniciAddTiklar() {
        popUpPage.popAdd.click();

    }

    @Then("toast mesaj onayla {string}")
    public void toastMesajOnayla(String mesaj) {
        System.out.println(popUpPage.popToast.getText());
        System.out.println(popUpPage.popToast.getAttribute("name"));
        Assert.assertTrue(popUpPage.popToast.getAttribute("name").equals(mesaj));
    }
}
