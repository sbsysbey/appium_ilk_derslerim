package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.android.ApiDemosPage;
import pages.android.DragAndDropPage;
import pages.android.MovePage;
import pages.android.ViewPage;
import utilities.Driver;

public class DragAndDropStepDefinination {
    ApiDemosPage apiDemosPage=new ApiDemosPage();
    ViewPage viewPage=new ViewPage();
    DragAndDropPage dragAndDropPage=new DragAndDropPage();
MovePage movePage=new MovePage();

    @Given("kullanici Views sayfasina gider")
    public void kullanici_views_sayfasina_gider() {
viewPage.viewPageSayfasi.click();
    }

    @Given("kullanici DragAndDrop Sayfasına gider")
    public void kullanici_drag_and_drop_sayfasına_gider() {
        dragAndDropPage.dragAndDrop.click();

    }

    @Given("kullanici ilk daireyi ikinci dairenin ustune tasiyacak")
    public void kullanici_ilk_daireyi_ikinci_dairenin_ustune_tasiyacak() {
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());

        touchAction.longPress(ElementOption.element(movePage.daire1))
                .moveTo(ElementOption.element(movePage.daire2)).release().perform();
    }

    @Then("kontrol yapilacak")
    public void kontrol_yapilacak() throws InterruptedException {

     Thread.sleep(5000);
     Assert.assertTrue(movePage.ResultText.isDisplayed());
        System.out.println("calısıyor bu");
    }


}
