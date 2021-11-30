package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateAccountPage extends BasePage {


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_create")
    private WebElement userEmailInput;

    @FindBy(xpath = "//input[@name='id_gender']")
    List<WebElement> genderCheckBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameInput;

    @FindBy(xpath = "//div[@class='selector']")
    List<WebElement> selectorsOfDOBInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;


    public void enterUserData(String email, int gender, String password, int days, int months, int years, String firstName, String lastName) {
        userEmailInput.click();
        userEmailInput.clear();
        userEmailInput.sendKeys(email);
        submitButton.click();

        genderCheckBox.get(gender).click();
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        passwordInput.sendKeys(password);

    }

}
