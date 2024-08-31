package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.wait.ExplicitDriverWait;

public class HomePage extends WebPageBase {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By getFreeTrialBtn = By.xpath("//a[text()='Get A Free Trial']");

    private final By acceptCookiesBtn = By.id("onetrust-accept-btn-handler");

    public void clickAcceptCookiesBtn(){
        new ExplicitDriverWait(webDriver).waitUntilElementBeClickable(10,acceptCookiesBtn);

        webDriver.findElement(acceptCookiesBtn).click();
    }
    public void clickGetFreeTrial() {
        new ExplicitDriverWait(webDriver).waitUntilElementAppear(10,getFreeTrialBtn);
        webDriver.findElement(getFreeTrialBtn).click();
    }


}
