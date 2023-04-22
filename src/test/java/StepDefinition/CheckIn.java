package StepDefinition;

import Config.environment;
import Helper.accessFile;
import Helper.actiontap;
import Helper.tap;
import ObjectRepository.pageCheckIn;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class CheckIn extends environment{
    pageCheckIn pageCheckIn = new pageCheckIn();

    accessFile accessFile = new accessFile();
    actiontap tap = new actiontap();

    @Then("user click feature Check In")
    public void user_click_feature_check_in() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_checkIn())
        );
        driver.findElement(pageCheckIn.getBtn_checkIn()).click();
    }
    @Then("user is on page Check In")
    public void user_is_on_page_check_in() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_iconplus())
        );
        driver.findElement(pageCheckIn.getBtn_iconplus()).isDisplayed();
    }
    @And("user click button plus")
    public void user_click_button_plus() {
        driver.findElement(pageCheckIn.getBtn_iconplus()).click();
    }
    @And("user input field question")
    public void user_input_field_question() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_fieldquest())
        );
        driver.findElement(pageCheckIn.getBtn_fieldquest()).click();
        driver.findElement(pageCheckIn.getBtn_fieldquest()).sendKeys("Hari ini ngapain aja gaes?");
    }
    @And("user choose the day want to ask question")
    public void user_choose_the_day_want_to_ask_question() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_mon())
        );
        driver.findElement(pageCheckIn.getBtn_mon()).click();
        driver.findElement(pageCheckIn.getBtn_tue()).click();
        driver.findElement(pageCheckIn.getBtn_wed()).click();
        driver.findElement(pageCheckIn.getBtn_thu()).click();
        driver.findElement(pageCheckIn.getBtn_fri()).click();
    }
    @And("user set time")
    public void user_set_time() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_settime())
        );
        driver.findElement(pageCheckIn.getBtn_settime()).click();
        driver.findElement(pageCheckIn.getBtn_ok()).click();
    }
    @And("user tag all member")
    public void user_tag_all_member() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_addmember())
        );
        driver.findElement(pageCheckIn.getBtn_addmember()).click();
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_done())
        );
        driver.findElement(pageCheckIn.getBtn_done()).click();
    }
    @And("user click button start collecting answer")
    public void user_click_button_start_collecting_answer() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_start())
        );
        driver.findElement(pageCheckIn.getBtn_start()).click();
    }
    @And("user click button switch private")
    public void user_click_button_switch_private() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_private())
        );
        driver.findElement(pageCheckIn.getBtn_private()).click();
    }
    @And("user input field question with character and emoji")
    public void user_input_field_question_with_character_and_emoji() {
        String question = "Hari ini ngapain aja gaes🙏?";
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_fieldquest())
        );
        driver.findElement(pageCheckIn.getBtn_fieldquest()).click();
        driver.findElement(pageCheckIn.getBtn_fieldquest()).sendKeys(question);
    }
    @And("user input every day to ask")
    public void user_input_every_day_to_ask() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_mon())
        );
        driver.findElement(pageCheckIn.getBtn_mon()).click();
        driver.findElement(pageCheckIn.getBtn_tue()).click();
        driver.findElement(pageCheckIn.getBtn_wed()).click();
        driver.findElement(pageCheckIn.getBtn_thu()).click();
        driver.findElement(pageCheckIn.getBtn_fri()).click();
        driver.findElement(pageCheckIn.getBtn_sat()).click();
        driver.findElement(pageCheckIn.getBtn_sun()).click();
    }
    @And("user input field question with only emoji")
    public void user_input_field_question_with_only_emoji() {
        String question = "🙏🙏🙏🙏🙏🙏🙏🙏?";
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_fieldquest())
        );
        driver.findElement(pageCheckIn.getBtn_fieldquest()).click();
        driver.findElement(pageCheckIn.getBtn_fieldquest()).sendKeys(question);
    }
    @And("user input field question less than 5 character")
    public void user_input_field_question_less_than_5_character() {
        String quest = "halo";
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_fieldquest())
        );
        driver.findElement(pageCheckIn.getBtn_fieldquest()).click();
        driver.findElement(pageCheckIn.getBtn_fieldquest()).sendKeys(quest);
    }
    @Then("user open ones check in")
    public void user_open_ones_check_in() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_onescheckin())
        );
        driver.findElement(pageCheckIn.getBtn_onescheckin()).click();
    }
    @And("user click icon elipsis")
    public void user_click_icon_elipsis() throws InterruptedException{
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_random())
        );
        tap.tapps(driver, 0.945,0.180,0.945,0.180);
        Thread.sleep(30);
    }
    @And("user click button Edit")
    public void user_click_button_edit() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_edit())
        );
        driver.findElement(pageCheckIn.getBtn_edit()).click();
    }
    @Then("user is on page Edit Check In")
    public void user_is_on_page_edit_check_in() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_save())
        );
        driver.findElement(pageCheckIn.getBtn_save()).isDisplayed();
    }
    @Then("user open ones posts")
    public void user_open_ones_posts() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_oneposts())
        );
        driver.findElement(pageCheckIn.getBtn_oneposts()).click();
    }

    @Then("user click save changes")
    public void user_click_save_changes() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_save())
        );
        driver.findElement(pageCheckIn.getBtn_save()).click();
    }
    @And("user input three day to ask")
    public void user_input_three_day_to_ask() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_mon())
        );
        driver.findElement(pageCheckIn.getBtn_mon()).click();
        ;
        driver.findElement(pageCheckIn.getBtn_wed()).click();
        driver.findElement(pageCheckIn.getBtn_fri()).click();
    }
}
