package stepDefinitions;

import hooks.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AboutUsPage;

public class AboutUsStepdefs extends BrowserDriver {
    AboutUsPage aboutUsPage = new AboutUsPage(driver);
    @Given("I navigate to the website")
    public void iNavigateToTheWebsite() {
        aboutUsPage.Navigate("https://graphnet.com/");
    }

    @When("I click about us")
    public void iClickAboutUs() {
        aboutUsPage.clickAboutUs();
    }

    @Then("successful massage displayed")
    public void successfulMassageDisplayed() {
    }
}

