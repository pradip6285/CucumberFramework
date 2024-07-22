package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    @Given("Launch the url")
    public void launch_the_url() {
        System.out.println("Launch url");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("enter valid creds");
    }

    @When("Click on the login button")
    public void click_on_the_login_button() {
        System.out.println("Click on login button");
    }

    @Then("User should be land on dashboard page")
    public void user_should_be_land_on_dashboard_page() {
        System.out.println("Verified dashboard");
    }

    @When("User enters invalid credentials")
    public void user_enters_invalid_credentials() {
        System.out.println("enter invalid creds");
    }

    @Then("User should get validation message")
    public void user_should_get_validation_message() {
        System.out.println("user get validation");
    }

}
