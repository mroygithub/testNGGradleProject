package stepDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    WebDriver driver = null;

    @Given("user launch google application")
    public void user_launch_google_application() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("User can launch Google");
    }
    @Then("user validate google Logo")
    public void user_validate_google_logo() {
        System.out.println("Google logo is displayed");
    }
    @Then("user validate google title")
    public void user_validate_google_title() {
        System.out.println("Google Title is ===> Google");
    }
    @Then("user close google app")
    public void user_close_google_app() {
        System.out.println("Driver instance closed ....");
        driver.quit();
    }
}
