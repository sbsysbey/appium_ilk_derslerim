package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ViewPage {

    public ViewPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement viewPageSayfasi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public WebElement ScrollingTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TextSwitcher']")
    public WebElement textSwitcher;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/next")
    public WebElement nextButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextSwitcher/android.widget.TextView")
    public WebElement rakam;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tabs']")
    public WebElement viewTabSekmesi;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='5. Scrollable']")
    public WebElement viewTabScrolling;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='TAB 17']")
    public WebElement viewTab17;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView")
    public WebElement tab17Yazisi;

}

