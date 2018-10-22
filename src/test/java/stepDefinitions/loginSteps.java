package stepDefinitions;
import classes.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class loginSteps {
    @Given("^a user is on the umami website$")
    public void a_user_is_on_the_umami_website() throws Exception {
        LoginPage.startDriver();
        LoginPage.visitUmamiSite();
        LoginPage.locateDrupalLogo();
    }

    @And("^clicks the Log In button$")
    public void clicks_the_Log_In_button() throws Exception {
        LoginPage.clickLoginButton();
    }

    @When("^the user enters \"([^\"]*)\" in the username field$")
    public void theUserEntersInTheUsernameField(String username) throws Throwable {
        LoginPage.enterUsername(username);
    }

    @And("^the user enters \"([^\"]*)\" in the password field$")
    public void theUserEntersInThePasswordField(String password) throws Throwable {
        LoginPage.enterPassword(password);
    }

    @And("^clicks on the Log In button$")
    public void clicksOnTheLogInButton() throws Throwable {
        LoginPage.clickSubmitLoginButton();
    }

    @Then("^the user will be logged in$")
    public void theUserWillBeLoggedIn() throws Throwable {
        //LoginPage.isLogoutButtonPresent();
        //LoginPage.stopDriver();
    }
}
