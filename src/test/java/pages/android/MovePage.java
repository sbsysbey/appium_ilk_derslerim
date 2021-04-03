package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class MovePage {
    public MovePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(id= "com.touchboarder.android.api.demos:id/drag_dot_1")
    public WebElement daire1;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_2")
    public WebElement daire2;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_dot_3")
    public WebElement daire3;
    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/drag_result_text")
    public WebElement ResultText;

}
