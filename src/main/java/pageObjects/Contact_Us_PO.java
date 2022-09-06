package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Global_Vars;

import java.io.File;

public class Contact_Us_PO extends Base_PO {

    private @FindBy(id = "id_contact")
    WebElement subject_Selector;

    private @FindBy(id = "email")
    WebElement emailAddress_TextField;

    private @FindBy(id = "id_order")
    WebElement orderReference_TextField;

    private @FindBy(id = "fileUpload")
    WebElement fileUpload_Field;

    private @FindBy(id = "message")
    WebElement comment_TextField;

    private @FindBy(id = "submitMessage")
    WebElement send_Button;

    private @FindBy(css = ".alert-success")
    WebElement successfulSubmission_Message_Text;

    private @FindBy(css = "div#center_column li")
    WebElement warning_Message_Text;



    public Contact_Us_PO() {
        super();
    }


    public void navigateTo_AutomationPractice_Contact_Us_Page() {
        navigateTo_URL(Global_Vars.AUTOMATION_PRACTICE_HOMEPAGE_URL + "?controller=contact");
    }
    public void select_SubjectHeading() {

        Select menuSubject = new Select(subject_Selector);
        menuSubject.selectByValue("2");
    }
    public void set_EmailAddress() {
        sendKeys(emailAddress_TextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }
    public void set_OrderReference() {
        sendKeys(orderReference_TextField, "AutoOR" + generateRandomNumber(5));
    }
    public void upload_File() {
    WebElement uploadElement = fileUpload_Field;
    File file = new File("./cucumber.png");
    uploadElement.sendKeys(file.getAbsolutePath());
    }
    public void set_Comment() {
        sendKeys(comment_TextField, "Hello World! " + generateRandomString(20));
    }

    public void set_Comment_With_Only_Spaces() {
        sendKeys(comment_TextField, "                 ");
    }

    public void clickOn_Send_Button() {
        waitForWebElementAndClick(send_Button);
    }
    public void validate_Successful_SubmissionMessage_Text() {
        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Your message has been successfully sent to our team.");
    }
    public void validate_Missing_SubjectMessage_Text() {
        waitFor(warning_Message_Text);
        Assert.assertEquals(warning_Message_Text.getText(), "Please select a subject from the list provided.");
    }
    public void validate_Invalid_EmailMessage_Text() {
        waitFor(warning_Message_Text);
        Assert.assertEquals(warning_Message_Text.getText(), "Invalid email address.");
    }

    public void validate_Message_Cannot_Be_Blank_Text() {
        waitFor(warning_Message_Text);
        Assert.assertEquals(warning_Message_Text.getText(), "The message cannot be blank.");
    }
}
