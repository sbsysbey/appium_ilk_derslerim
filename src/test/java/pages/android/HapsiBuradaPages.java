package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class HapsiBuradaPages{
        public HapsiBuradaPages(){
            PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
        }

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    public WebElement googlesearch;

    @AndroidFindBy(id ="com.android.chrome:id/url_bar")
    public WebElement googlesearch2;

    @AndroidFindBy(xpath ="com.android.chrome:id/url_bar")
    public WebElement hepsiburadaSearch;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='hepsiburada']")
    public WebElement hepsiburadaSearchclick;

    @AndroidFindBy(id ="com.android.chrome:id/infobar_close_button")
    public WebElement locateclose;

    @AndroidFindBy(xpath ="//android.view.View[@content-desc='https://www.hepsiburada.com Hepsiburada']/android.view.View[1]/android.view.View")
    public WebElement hepsiburadaSayfasi;

    @AndroidFindBy(id ="com.android.chrome:id/negative_button")
    public WebElement hepsiBuradapopupClose;

    @AndroidFindBy(xpath ="//android.view.View[@text='Ürün, kategori veya marka ara']")
    public WebElement hepsiburadaaramatiklamakicin;

    @AndroidFindBy(id ="mHeader_e362ce41-1499-4f74-1aea-edc41ef4aebc")
    public WebElement hepsiburadaAramakicin;


    @AndroidFindBy(xpath ="//android.widget.Button[@text='Sırala']")
    public WebElement hepsiburadaSiralamaButonu;


    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View/android.widget.Image")
    public WebElement hepsiburadaAkilliSiralama;

    @AndroidFindBy(xpath ="(//android.widget.Image[@text=''])[2]")
    public WebElement hepsiburadailkSira;


}
