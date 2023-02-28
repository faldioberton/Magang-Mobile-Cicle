package StepDefinition;

import Helper.accessFile;
import com.github.javafaker.Faker;
import Config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ObjectRepository.pageHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class home extends environment{

    pageHome pageHome = new pageHome();
    accessFile accessFile = new accessFile();
    Faker faker = new Faker();
    String dataCompanyName = "src/test/resources/File/companyName.txt";

    @Given("user in page Home")
    public void user_in_page_home() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPageHome())
        );
    }
    @When("user click Create New Company")
    public void user_click_create_new_company() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getBtn_createcompany())
        );
        driver.findElement(pageHome.getBtn_createcompany()).click();
    }
    @And("user input field name")
    public void user_input_field_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getField_name())
        );
        WebElement txt_companyName = driver.findElement(pageHome.getField_name());
        txt_companyName.click();
        String companyName = "Company " + faker.number().numberBetween(111, 99999);
        txt_companyName.sendKeys(companyName);
        accessFile.writeToFile(dataCompanyName, companyName);
    }
    @And("user input field description")
    public void user_input_field_description() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getField_desc())
        );
        driver.findElement(pageHome.getField_desc()).click();
        String Description = "Belajar";
        driver.findElement(pageHome.getField_desc()).sendKeys(Description);
    }
    @And("user click create")
    public void user_click_create() {
        driver.findElement(pageHome.getBtn_create()).click();
    }
    @Then("user successfully create company")
    public void user_successfully_create_company() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getBtn_notif())
        );
        driver.findElement(pageHome.getBtn_notif()).isDisplayed();
        driver.findElement(pageHome.getBtn_cancel()).click();
    }
}

