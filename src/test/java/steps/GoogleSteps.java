package steps;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import io.cucumber.java.en.*;

public class GoogleSteps {
    WebDriver driver = DriverFactory.getDriver();

    @Given("I open the browser")
    public void i_open_the_browser() {
        driver.get("about:blank");
    }

    @When("I go to {string}")
    public void i_go_to(String url) {
        driver.get(url);
    }

    @Then("I see the title contains {string}")
    public void i_see_title_contains(String text) {
        Assert.assertTrue(driver.getTitle().contains(text));
    }
}