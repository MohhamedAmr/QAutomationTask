package test_runner;

import constants.DataProviderManagement;
import constants.UserConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import test_base.WebTestBase;
import web_ui.FreeTrialPage;
import web_ui.HomePage;
import web_ui.LoginPage;
import web_ui.RegisterPage;

public class RegistrationTest extends WebTestBase {
    HomePage homePage;
    RegisterPage registerPage;
    LoginPage loginPage;
    FreeTrialPage freeTrialPage;

    @Description("This test attempts to successfully registration cycle via free trial")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "checkoutData", dataProviderClass = DataProviderManagement.class)
    public void verifyRegistrationSuccess(String firstName, String lastName, String companyName, String password, String phoneNumber) {
        homePage = new HomePage(webDriver);
        registerPage = new RegisterPage(webDriver);
        loginPage = new LoginPage(webDriver);
        freeTrialPage = new FreeTrialPage(webDriver);
        homePage.clickGetFreeTrial();
        homePage.clickAcceptCookiesBtn();
        freeTrialPage.clickKendoUiBtn();
        freeTrialPage.scrollToTryNowBtn(webDriver);
        freeTrialPage.selectUiReact();
        loginPage.addEmail(UserConstants.EMAIL);
        loginPage.clickNext();
        registerPage.sentPassword(password);
        registerPage.sentFirstName(firstName);
        registerPage.sentLastName(lastName);
        registerPage.sentCompanyName(companyName);
        registerPage.sentPhoneNumber(phoneNumber);
        registerPage.scrollToCreateAccountField(webDriver);
        registerPage.selectEgypt(UserConstants.Country);
        registerPage.clickCreateAccount();

    }
}
