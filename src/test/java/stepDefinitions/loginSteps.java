package stepDefinitions;
import classes.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
    @Given("^a user is on the umami website$")
    public void a_user_is_on_the_umami_website() throws Exception {
        LoginPage.visitUmamiSite();
        LoginPage.locateUmamiLogo();
    }

    @And("^clicks the log in button$")
    public void clicksTheLogInButton() throws Throwable {
        LoginPage.clickLoginButton();
    }

    @When("^the user enters \"([^\"]*)\" in the username field$")
    public void theUserEntersInTheUsernameField(String arg0) throws Throwable {
        LoginPage.enterUsername();
    }
}
