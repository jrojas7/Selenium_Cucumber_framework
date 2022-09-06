package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;


public class Contact_Us_Steps extends Base_PO {
    private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the automation practice contact us page")
    public void i_access_the_automation_practice_contact_us_page() {
        contact_us_po.navigateTo_AutomationPractice_Contact_Us_Page();
    }

    @When("I select a subject heading")
    public void i_select_a_subject_heading() {
        contact_us_po.select_SubjectHeading();
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
        contact_us_po.set_EmailAddress();
    }

    @And("I enter an order reference")
    public void i_enter_an_order_reference() {
        contact_us_po.set_OrderReference();
    }

    @And("I attach a file")
    public void i_attach_a_file() {
        contact_us_po.upload_File();
    }

    @And("I enter a comment")
    public void i_enter_a_comment() {
        contact_us_po.set_Comment();
    }

    @And("I enter a comment with only spaces")
    public void i_enter_a_comment_with_only_spaces() {
        contact_us_po.set_Comment_With_Only_Spaces();
    }

    @And("I click on the send button")
    public void i_click_on_the_send_button() {
        contact_us_po.clickOn_Send_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contact_us_po.validate_Successful_SubmissionMessage_Text();
    }

    @Then("I should be presented with a missing subject message")
    public void i_should_be_presented_with_a_missing_subject_message() {
        contact_us_po.validate_Missing_SubjectMessage_Text();
    }

    @Then("I should be presented with an invalid email message")
    public void i_should_be_presented_with_an_invalid_email_message() {
        contact_us_po.validate_Invalid_EmailMessage_Text();
    }

    @Then("I should be presented with message cannot be blank")
    public void i_should_be_presented_with_message_cannot_be_blank_text() {
        contact_us_po.validate_Message_Cannot_Be_Blank_Text();
    }

}
