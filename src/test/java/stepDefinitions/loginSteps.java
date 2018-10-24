package stepDefinitions;
import classes.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class loginSteps {
    @Given("^a user is on my drupal website$")
    public void a_user_is_on_my_drupal_website() throws Exception {
        LoginPage.startDriver();
        LoginPage.visitMyDrupalSite();
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
        Assert.assertTrue("Nav bar is not visible, user is not logged in!", LoginPage.isAdminNavBarPresent());
        LoginPage.stopDriver();
    }
}
