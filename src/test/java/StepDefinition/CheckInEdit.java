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

public class CheckInEdit extends environment{
    pageCheckIn pageCheckIn = new pageCheckIn();

    accessFile accessFile = new accessFile();
    tap tapping = new tap();

    @And("user click field question")
    public void user_click_field_question() throws InterruptedException{
        Thread.sleep(50);
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_fieldques())
        );
        driver.findElement(pageCheckIn.getBtn_fieldques()).click();
    }

    @And("user change to new question in field question")
    public void user_change_to_new_question_in_field_question() {
        String question = "Ada kabar baik hari ini?";
         MobileElement el = (MobileElement) driver.findElement(pageCheckIn.getBtn_fieldques());
         el.click();
         el.sendKeys(question);
    }
    @And("user click set time")
    public void user_click_set_time(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_edittime())
        );
        driver.findElement(pageCheckIn.getBtn_edittime()).click();
    }
    @And("user click switch")
    public void user_click_switch(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_switc())
        );
        driver.findElement(pageCheckIn.getBtn_switc()).click();
    }
    @And("user set hours")
    public void user_set_hours(){
        String hour = "10";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_jam())
        );
        driver.findElement(pageCheckIn.getBtn_jam()).click();
        driver.findElement(pageCheckIn.getBtn_jam()).sendKeys(hour);
    }
    @And("user set minutes")
    public void user_set_minutes(){
        String minute = "10";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_menit())
        );
        driver.findElement(pageCheckIn.getBtn_menit()).click();
        driver.findElement(pageCheckIn.getBtn_menit()).sendKeys(minute);
    }
    @And("user click button okks")
    public void user_click_button_okks(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_oks())
        );
        driver.findElement(pageCheckIn.getBtn_oks()).click();
    }

    @And("user input field questions")
    public void user_input_field_questions(){
        String quest = "Hari ini ngapain aja gaes?";
        driver.findElement(pageCheckIn.getBtn_fieldquest()).click();
        driver.findElement(pageCheckIn.getBtn_fieldquest()).sendKeys(quest);
    }
    @And("user change the day want to ask")
    public void user_change_the_day_want_to_ask() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_save())
        );
        driver.findElement(pageCheckIn.getBtn_mon()).click();
        driver.findElement(pageCheckIn.getBtn_tue()).sendKeys(Keys.DELETE);
        driver.findElement(pageCheckIn.getBtn_wed()).click();
        driver.findElement(pageCheckIn.getBtn_thu()).sendKeys(Keys.DELETE);
        driver.findElement(pageCheckIn.getBtn_fri()).click();
    }
    @And("user click button Archive")
    public void user_click_button_archive(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_archive())
        );
        driver.findElement(pageCheckIn.getBtn_archive()).click();
    }
    @And("user click yes")
    public void user_click_yes(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_yes())
        );
        driver.findElement(pageCheckIn.getBtn_yes()).click();
    }
    @And("user click Cancel")
    public void user_click_cancel(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_no())
        );
        driver.findElement(pageCheckIn.getBtn_no()).click();
    }
    @And("user click ad new coment")
    public void user_click_ad_new_coment(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_addcoment())
        );
        driver.findElement(pageCheckIn.getBtn_addcoment()).click();
    }
    @And("user add new coment")
    public void user_add_new_coment(){
        String comentar = "Hari ini baik";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getField_coment())
        );
        driver.findElement(pageCheckIn.getField_coment()).click();
        driver.findElement(pageCheckIn.getField_coment()).sendKeys(comentar);
    }
    @And("user click button Reply coment")
    public void user_click_button_reply_coment() throws InterruptedException{
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCheckIn.getBtn_cheers())
        );
        tapping.tapping(driver, 0.865,0.600,0.865,0.600);
        Thread.sleep(30);
    }
    @And("user click button add new coments")
    public void user_click_button_add_new_coments(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_addcoment())
        );
        driver.findElement(pageCheckIn.getBtn_addcoment()).click();
    }
    @And("user add coment in field reply")
    public void user_add_coment_in_field_reply(){
        String comentaring = "Terimakasih";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getField_coment())
        );
        driver.findElement(pageCheckIn.getField_coment()).click();
        driver.findElement(pageCheckIn.getField_coment()).sendKeys(comentaring);
    }
    @And("user click ad new coment with emoji")
    public void user_click_ad_new_coment_with_emoji(){
        String comentar = "Hari ini baik😁😁";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getField_coment())
        );
        driver.findElement(pageCheckIn.getField_coment()).click();
        driver.findElement(pageCheckIn.getField_coment()).sendKeys(comentar);
    }
    @And("user click icon at to tag member")
    public void user_click_icon_at_to_tag_member(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_at())
        );
        driver.findElement(pageCheckIn.getBtn_at()).click();
    }

    @And("user click mentions all")
    public void user_click_mentions_all(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_mention())
        );
        driver.findElement(pageCheckIn.getBtn_mention()).click();
    }
    @And("user click buton ok")
    public void user_click_button_ok(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_oke())
        );
        driver.findElement(pageCheckIn.getBtn_oke()).click();
    }
    @And("user click icon elipsis horizontal")
    public void user_click_icon_elipsis_horizontal(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_eliphorizontal())
        );
        driver.findElement(pageCheckIn.getBtn_eliphorizontal()).click();
    }

    @And("user click button edit coment")
    public void user_click_button_edit(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_editcoment())
        );
        driver.findElement(pageCheckIn.getBtn_editcoment()).click();
    }
    @And("user directed to field edit coment")
    public void user_directed_to_field_edit_coment(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_field())
        );
    }

    @And("user edit coment")
    public void user_edit_coment(){
        String coment = "Hebatt Bagus dan lanjutkan";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_field())
        );
        driver.findElement(pageCheckIn.getBtn_field()).click();
        driver.findElement(pageCheckIn.getBtn_field()).sendKeys(coment);
    }
    @And("user click button submit")
    public void user_click_button_submit(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_submit())
        );
        driver.findElement(pageCheckIn.getBtn_submit()).click();
    }
    @And("user click button at")
    public void user_click_button_at(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_att())
        );
        driver.findElement(pageCheckIn.getBtn_att()).click();
    }
    @And("user click button mention all")
    public void user_click_button_mention_all(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_mentionall())
        );
        driver.findElement(pageCheckIn.getBtn_mentionall()).click();
    }
    @And("user click buton oke")
    public void user_click_button_oke(){
        wait.until(
                ExpectedConditions.elementToBeClickable(pageCheckIn.getBtn_oke())
        );
        driver.findElement(pageCheckIn.getBtn_oke()).click();
    }
}


