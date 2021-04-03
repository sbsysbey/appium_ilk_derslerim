package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class GeneralStorePage {
    public GeneralStorePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkelerdrop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='France']")
    public WebElement ulkelerFrance;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement name;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    public WebElement cinsiyet;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public WebElement letsShop;


    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement urun;



}

