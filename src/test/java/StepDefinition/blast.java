package StepDefinition;

import com.github.javafaker.Faker;
import Config.environment;
import org.junit.Assert;
import org.openqa.selenium.By;
import Helper.accessFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import ObjectRepository.pageBlast;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class blast extends environment{
    pageBlast pageBlast = new pageBlast();
    accessFile accessFile = new accessFile();
    Faker faker = new Faker();
    String dataCompanyName = "src/test/resources/file/companyName.txt";
    String dataTeamName = "src/test/resources/file/teamName.txt";
    @And("user open ones team")
    public void user_open_ones_team() {
        By btnCurrentTeam = pageBlast.getCtnCurrTeam(accessFile.readFromFile(dataTeamName));
        wait.until(
                ExpectedConditions.elementToBeClickable(btnCurrentTeam)
        );
        driver.findElement(btnCurrentTeam).click();
    }
    @Then("user in page Team")
    public void user_in_page_team() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getPageTeam())
        );
    }
    @Then("user click feature Blast")
    public void user_click_feature_blast() {
        driver.findElement(pageBlast.getBtn_blast()).click();
    }
    @Then("user create new post")
    public void user_create_new_post() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getPageTeam())
        );
    }
    @Then("user input title")
    public void user_input_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user input description")
    public void user_input_description() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click switch to public or private")
    public void user_click_switch_to_public_or_private() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user click publish")
    public void user_click_publish() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
