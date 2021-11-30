package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import pages.CreateAccountPage;

public class AutomationFormTest extends BaseTest {

    @Test
    public void shouldInputGendercheckBox(){
        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");

        CreateAccountPage createAccount = new CreateAccountPage(driver);

        createAccount.enterUserData("test2@test.pl", 0, "TwojaStara@", 10, 5, 2000, "Daniel", "Zalewski");

    }
}
