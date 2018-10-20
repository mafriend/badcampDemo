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

    @And("^a user is logged in$")
    public void a_user_is_logged_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the user clicks the log out button$")
    public void the_user_clicks_the_log_out_button() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the user will be logged out$")
    public void the_user_will_be_logged_out() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
