package test_base;

import com.beust.jcommander.Parameter;
import constants.SiteConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

public class WebTestBase {
    public static WebDriver webDriver;

    @BeforeMethod
    @Parameter(names = "browserName")
    public void startDriver(@Optional("chrome") String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.navigate().to(SiteConstants.baseUrl);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void endDriver() {
        webDriver.manage().deleteAllCookies();
        webDriver.quit();



    }
}





