package constants;

import org.testng.annotations.DataProvider;

public class DataProviderManagement {
    @DataProvider(name = "checkoutData")
    public static Object[][] getCheckoutData() {
        return new Object[][]{
                {"Mohamed", "Amr", "Qoyod", "1234567890", "+201092933113"},
                {UserConstants.FIRST_NAME, UserConstants.LAST_NAME, UserConstants.Company, UserConstants.PASSWORD, UserConstants.PHONE_NUMBER}
        };
    }
}
