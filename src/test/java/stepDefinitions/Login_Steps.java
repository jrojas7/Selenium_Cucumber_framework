package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps extends Base_PO {
    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access the automation practice login page")
    public void i_access_the_atomation_practice_login_page() {
        login_po.navigateTo_AutomationPractice_LoginPage();
    }
    @When("I enter an email address {}")
    public void i_enter_an_email(String email) {
        login_po.setEmail(email);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @And("I click on the sign in button")
    public void i_click_on_the_signin_button() {
        login_po.clickOn_Signin_Button();
    }
    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        login_po.validate_SuccessfulLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        login_po.validate_UnsuccessfulLogin_Message();
    }

}
