package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class Login_PO extends Base_PO{
    private @FindBy(id = "email")
    WebElement emailAddress_TextField;

    private @FindBy(id = "passwd")
    WebElement password_TextField;

    private @FindBy(id = "SubmitLogin")
    WebElement signin_Button;

    private @FindBy(css = "div#center_column > .info-account")
    WebElement successfulLogin_Message_Text;

    private @FindBy(css = "div#center_column li")
    WebElement unsuccessfulLogin_Message_Text;



    public Login_PO() {
        super();
    }

    public void navigateTo_AutomationPractice_LoginPage() {
        navigateTo_URL(Global_Vars.AUTOMATION_PRACTICE_HOMEPAGE_URL + "?controller=authentication&back=my-account");
    }

    public void setEmail(String email) {

        sendKeys(emailAddress_TextField, email);
    }
    public void setPassword(String password) {

        sendKeys(password_TextField, password);
    }

    public void clickOn_Signin_Button() {
        waitForWebElementAndClick(signin_Button);
    }

    public void validate_SuccessfulLogin_Message() {
        waitFor(successfulLogin_Message_Text);
        Assert.assertEquals(successfulLogin_Message_Text.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitFor(unsuccessfulLogin_Message_Text);
        Assert.assertEquals(unsuccessfulLogin_Message_Text.getText(), "Authentication failed.");
    }
}
