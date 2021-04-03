package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Spinner']")
    public WebElement viewSpinnerPage;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/next/spinner1")
    public WebElement spinnerColor;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/next/spinner2")
    public WebElement spinnerPlanet;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]")
    public WebElement spinnercolorBlue;

    @AndroidFindBy(xpath ="//android.widget.CheckedTextView[@text='Mars']")
    public WebElement spinnerPlanetMars;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView")
    public WebElement spinnerColorKontrol;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")
    public WebElement spinnerPlanetKontrol;






}
