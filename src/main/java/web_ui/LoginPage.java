package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends WebPageBase{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    private final By emailTB = By.id("email");
    private final By nextButton = By.cssSelector("button.btn.btn-accent.u-w100.loader-button");

    public void addEmail(String email){
        webDriver.findElement(emailTB).sendKeys(email);

    }
    public void clickNext(){
        webDriver.findElement(nextButton).click();
    }
}
