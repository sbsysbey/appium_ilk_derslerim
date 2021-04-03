package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.android.ApiDemosPage;
import pages.android.HomePage;
import pages.android.PreferenceFromCodePage;
import pages.android.PreferencePage;
public class SwitchAndroidStepDefs {
    HomePage homePage = new HomePage();
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PreferencePage preferencePage = new PreferencePage();
    PreferenceFromCodePage preferenceFromCodePage = new PreferenceFromCodePage();
    @Given("kullanici API Demos sayfasina gidecek")
    public void kullanici_api_demos_sayfasina_gidecek() throws InterruptedException {
        Thread.sleep(2000);
        homePage.apiDemos.click();
    }
    @Given("kullanici Preference sayfasina gidecek")
    public void kullanici_preference_sayfasina_gidecek() {
        apiDemosPage.preference.click();
    }
    @Given("kullanici Preference from code sayfasina gidecek")
    public void kullanici_preference_from_code_sayfasina_gidecek() {
        preferencePage.preferenceFromCode.click();
    }
    @Given("kullanici switch tusuna tiklayacak")
    public void kullanici_switch_tusuna_tiklayacak() {
        preferenceFromCodePage.switchButton.click();
    }
}
