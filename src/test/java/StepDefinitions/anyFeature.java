package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class anyFeature {
    WebDriver driver;

    @Given("^selenium is added to your pom\\.xml file$")
    public void selenium_is_added_to_your_pom_xml_file() throws Throwable {
        System.out.println("Added");

    }

    @When("^you execute the script$")
    public void you_execute_the_script() throws Throwable {
        System.setProperty("webdriver.chrome.driver","/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();

    }

    @Then("^the browser should be launched$")
    public void the_browser_should_be_launched() throws Throwable {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());

    }

    @Then("^the script should be executed$")
    public void the_script_should_be_executed() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("test automation");

    }

    @Then("^another verification$")
    public void testverification(){

    }
}
