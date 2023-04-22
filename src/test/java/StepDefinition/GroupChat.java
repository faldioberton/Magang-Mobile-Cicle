package StepDefinition;

import Config.environment;
import Helper.accessFile;
import Helper.actiontap;
import Helper.tap;
import ObjectRepository.pageChat;
import ObjectRepository.pageCheckIn;
import ObjectRepository.pageGroupChat;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;


public class GroupChat extends environment{

    pageGroupChat pagein = new pageGroupChat();

    @And("user click Group Chat")
    public void user_click_group_chat() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pagein.getBtn_groupchat())
        );
        driver.findElement(pagein.getBtn_groupchat()).click();
    }
    @Then("user in page Group Chat")
    public void user_in_page_group_chat() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_fieldmessage())
        );
        driver.findElement(pagein.getBtn_fieldmessage()).isDisplayed();
    }
    @And("user click field type mesage")
    public void user_click_field_type_mesage() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_fieldmessage())
        );
        driver.findElement(pagein.getBtn_fieldmessage()).click();
    }
    @And("user ad coment in field type mesage")
    public void user_ad_coment_in_field_type_mesage() {
        String message = "Halo apa kabar?";
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_fieldmessage())
        );
        driver.findElement(pagein.getBtn_fieldmessage()).sendKeys(message);
    }
    @And("user click send")
    public void user_click_send() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_send())
        );
        driver.findElement(pagein.getBtn_send()).click();
    }
    @And("user click button attach")
    public void user_click_button_attach() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_attach())
        );
        driver.findElement(pagein.getBtn_attach()).click();
    }
    @And("user click button image from galery")
    public void user_click_button_image_from_galery() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_fromgalery())
        );
        driver.findElement(pagein.getBtn_fromgalery()).click();
    }
    @And("user choose image to send")
    public void user_choose_image_to_send() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_file())
        );
        driver.findElement(pagein.getBtn_file()).click();
    }
    @And("click button image from camera")
    public void click_button_image_from_camera() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_file())
        );
        driver.findElement(pagein.getBtn_file()).click();
    }
    @And("user click button image from camera")
    public void user_click_button_image_from_camera() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_fromcamera())
        );
        driver.findElement(pagein.getBtn_fromcamera()).click();
    }
    @And("user click ceklist")
    public void user_click_ceklist() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_checklist())
        );
        driver.findElement(pagein.getBtn_checklist()).click();
    }
    @And("user click button tap")
    public void user_click_button_tap() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_tap())
        );
        driver.findElement(pagein.getBtn_tap()).click();
    }
    @And("user click button document and video")
    public void user_click_button_document_and_video() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_docandvideo())
        );
        driver.findElement(pagein.getBtn_docandvideo()).click();
    }
    @And("user click button alow")
    public void user_click_button_alow() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_allow())
        );
        driver.findElement(pagein.getBtn_allow()).click();
    }
    @And("user choose document")
    public void user_choose_document() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getBtn_doc())
        );
        driver.findElement(pagein.getBtn_doc()).click();
    }
    @And("user choose one file to upload")
    public void user_choose_one_file_to_upload() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pagein.getFile_doc())
        );
        driver.findElement(pagein.getFile_doc()).click();
    }
}