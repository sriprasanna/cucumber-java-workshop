package skeleton;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleStepDefs {
    private FirefoxDriver browser;

    @Before
    public void setUp() throws Exception {
        browser = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        browser.quit();
    }

    @When("^I visit the homepage$")
    public void i_visit_the_homepage() throws Throwable {
        browser.get("https://google.com");
    }

    @Then("^I should see an input box$")
    public void i_should_see_an_input_box() throws Throwable {
        browser.findElementByCssSelector("#lst-ib");
    }
}
