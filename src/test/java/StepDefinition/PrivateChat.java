package StepDefinition;

import Config.environment;
import Helper.accessFile;
import Helper.actiontap;
import Helper.tap;
import ObjectRepository.pageChat;
import ObjectRepository.pageCheckIn;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class PrivateChat extends environment{
    pageChat pageChat = new pageChat();

    @When("user click button Menu")
    public void user_click_button_menu() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_menu())
        );
        driver.findElement(pageChat.getBtn_menu()).click();
    }
    @When("user click button Inbox")
    public void user_click_button_inbox() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_inbox())
        );
        driver.findElement(pageChat.getBtn_inbox()).click();
    }
    @When("user click button add chat")
    public void user_click_button_add_chat() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_addchat())
        );
        driver.findElement(pageChat.getBtn_addchat()).click();
    }
    @When("user choose member want to chat")
    public void user_choose_member_want_to_chat() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_memberchat())
        );
        driver.findElement(pageChat.getBtn_memberchat()).click();
    }
    @When("user click field type message")
    public void user_click_field_type_message() {
        String message = "Hi apa kabar?";
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageChat.getField_message())
        );
        driver.findElement(pageChat.getField_message()).click();
        driver.findElement(pageChat.getField_message()).sendKeys(message);
    }
    @When("user click button send")
    public void user_click_button_send() {
        driver.findElement(pageChat.getBtn_send()).click();
    }
    @And("user click field message")
    public void user_click_field_message() {
        driver.findElement(pageChat.getField_message()).click();
    }
    @And("user click icon tag")
    public void user_click_icon_tag() {
        driver.findElement(pageChat.getBtn_tag()).click();
    }
    @And("user click member want to add")
    public void user_click_member_want_to_add() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_member())
        );
        driver.findElement(pageChat.getBtn_member()).click();
    }
    @And("user click button attach file")
    public void user_click_button_attach_file() {
        driver.findElement(pageChat.getBtn_attach()).click();
    }
    @And("user click button image from Gallery")
    public void user_click_button_image_from_gallery() {
    wait.until(
            ExpectedConditions.elementToBeClickable(pageChat.getBtn_image())
    );
        driver.findElement(pageChat.getBtn_image()).click();
    }
    @And("user choose image from gallery")
    public void user_choose_image_from_gallery() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageChat.getBtn_file())
        );
        driver.findElement(pageChat.getBtn_file()).click();
    }
}