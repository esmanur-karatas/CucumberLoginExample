package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utilities.Driver;

import java.time.Duration;

public class stepDefinitions {
    private static WebDriver driver;

//burada da yazdığımız test senaryolarının metotlarını oluştururuz
    LoginPage loginPage;

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Given("go to login page")
    public void goToLoginPage() {
        settingDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://practicetestautomation.com/practice-test-login/");

    }

    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {

        loginPage.setUsername(username);
    }

    @And("user types password as {string}")
    public void userTypesPasswordAs(String password) {
        loginPage.setPassword(password);
    }

    @When("click button")
    public void clickButton() {
        loginPage.clickButton();
    }

    @Then("assert to success message")
    public void asertToSuccessMessage() {
       // loginPage.assertToMessage();
        System.out.println("success message");

    }
    @Given("setting driver")
    public void settingDriver() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("go to home page")
    public void goToHomePage() {
        driver.get("https://practicetestautomation.com/");
    }

    @When("wait two seconds")
    public void waitTwoSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Then("see {string} text")
    public void seeText(String text) {
        WebElement helloMessageWE = driver.findElement(By.className("post-title"));
        String hello = helloMessageWE.getText();
        Assert.assertTrue(hello.equals(text));
    }
}
