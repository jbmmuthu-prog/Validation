package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class validate {

    WebDriver driver = new ChromeDriver();

    @Given("Launch Chrome Browser")
    public void launch_chrome_browser() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @When("Enter credential")
    public void enter_credential() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

    }

    @Then("Success")
    public void success() {
        Boolean securePage = driver.findElement(By.id("flash")).isDisplayed();

        Assert.assertTrue(securePage);
    }

}
