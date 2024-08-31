package web_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.actions.WebActions.scrollIntoView;

public class RegisterPage extends WebPageBase {

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    private final By passwordField = By.id("password");
    private final By firstNameField = By.id("fist-name");

    private final By lastNameField = By.id("last-name");
    private final By companyField = By.id("company");
    private final By phoneField = By.name("phone");
    private final By countryOfResidenceField = By.className("k-input-inner");
    private final By createAccountBtn = By.xpath("//button[@type='submit']");

    public void sentPassword(String password) {
        webDriver.findElement(passwordField).sendKeys(password);
    }

    public void sentPhoneNumber(String phoneNumber) {
        webDriver.findElement(phoneField).sendKeys(phoneNumber);

    }


    public void selectEgypt(String countryName) {
        webDriver.findElement(countryOfResidenceField).sendKeys(countryName);

    }


    public void sentFirstName(String firstName) {
        webDriver.findElement(firstNameField).sendKeys(firstName);

    }

    public void sentLastName(String lastName) {
        webDriver.findElement(lastNameField).sendKeys(lastName);

    }

    public void sentCompanyName(String company) {
        webDriver.findElement(companyField).sendKeys(company);

    }

    public void scrollToCreateAccountField(WebDriver driver) {
        WebElement webElement = webDriver.findElement(createAccountBtn);
        scrollIntoView(driver, webElement);
    }

    public void clickCreateAccount() {
        webDriver.findElement(createAccountBtn).click();
    }

}
