package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AnimasyonPages {
    public AnimasyonPages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Controls']")
    public WebElement viewControlSayfasi;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='07. Custom Theme']")
    public WebElement viewControlCustomTheme;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/radio1")
    public WebElement viewControlRadioButon1;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/star")
    public WebElement viewControlRadioStar;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/toggle1")
    public WebElement viewControlRadioToggle1;
    @AndroidFindBy(id = "android:id/text1")
    public WebElement viewControlmercury1;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/edit")
    public WebElement viewControlhinText;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/button")
    public WebElement viewControlSaveButton;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Venus']")
    public WebElement viewControlVenus;

}
