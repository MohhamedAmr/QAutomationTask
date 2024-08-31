package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.actions.WebActions.scrollIntoView;

public class FreeTrialPage extends WebPageBase {

    public FreeTrialPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By kendoUiTryNowBtn = By.className("Dropdown-control");
    private final By uiReactOptionText = By.xpath("//a[text()='UI for React']");
    private final By uiReactOption = By.xpath("//a[@href='/try/kendo-react-ui']");

    public void scrollToTryNowBtn(WebDriver driver) {
        WebElement webElement = webDriver.findElement(uiReactOptionText);
        scrollIntoView(driver, webElement);
    }

    public void clickKendoUiBtn() {
        webDriver.findElement(kendoUiTryNowBtn).click();

    }

    public void selectUiReact() {
        webDriver.findElement(uiReactOption).click();
    }

}
