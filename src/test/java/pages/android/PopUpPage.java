package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PopUpPage {
    public PopUpPage () {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
    public WebElement viewExpandableLists;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
    public WebElement popCustomAdapter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public WebElement popPeopleNames;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample action']")
    public WebElement popPopup1;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public WebElement popToast;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Popup Menu']")
    public WebElement popPopmenu;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='MAKE A POPUP!']")
    public WebElement popMakePopUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement popAdd;




}
