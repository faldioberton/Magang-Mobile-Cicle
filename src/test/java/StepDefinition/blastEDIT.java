package StepDefinition;

import Config.environment;
import Helper.accessFile;
import Helper.tap;
import ObjectRepository.pageBlast;
import ObjectRepository.pageEditBlast;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class blastEDIT extends environment {

    pageBlast pageBlast = new pageBlast();
    pageEditBlast pageEditBlast = new pageEditBlast();

    accessFile accessFile = new accessFile();
    tap tap = new tap();
    String dataTeamName = "src/test/resources/file/teamName.txt";
    String dataBlastName = "src/test/resources/file/blastName.txt";
    TouchAction touchAction=new TouchAction(driver);
    Actions builder = new Actions(driver);

    @And("user click vertikal icon")
    public void user_click_vertikal_icon() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getIcn_vertikal())
        );
        driver.findElement(pageBlast.getIcn_vertikal()).click();
    }
    @And("user click button edit")
    public void user_click_button_edit() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_edite())
        );
        driver.findElement(pageBlast.getBtn_edite()).click();
    }
    @Then("user is on page Edit")
    public void user_is_on_page_edit() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getPage_edit())
        );
        driver.findElement(pageBlast.getPage_edit()).isDisplayed();
    }
    @And("user input due date tommorow")
    public void user_input_due_date_tommorow() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_datetmmrow())
        );
        driver.findElement(pageBlast.getBtn_datetmmrow()).click();
    }
    @And("user click icon due dates")
    public void user_click_icon_due_dates() {
        driver.findElement(pageBlast.getBtn_duedate()).click();
    }
    @Then("user click button publish changes")
    public void user_click_button_publish_changes() {
        driver.findElement(pageBlast.getBtn_publishchange()).click();
    }
    @And("user click field description")
    public void user_click_field_description() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getEdit_edit())
        );
        driver.findElement(pageBlast.getEdit_edit()).click();
    }
    @And("user click icon attach file")
    public void user_click_icon_attach_file() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_attach())
        );
        driver.findElement(pageBlast.getBtn_attach()).click();
    }
    @And("user choose one file picture")
    public void user_choose_one_file_picture() throws InterruptedException{
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getFile_one())
        );
        driver.findElement(pageBlast.getFile_one()).click();
        Thread.sleep(10);
    }
    @And("user click button allow")
    public void user_click_button_allow() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_allow())
        );
        driver.findElement(pageBlast.getBtn_allow()).click();
    }
    @And("user click button archive")
    public void user_click_button_archive() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_archive())
        );
        driver.findElement(pageBlast.getBtn_archive()).click();
    }
    @And("user click Ok to delete")
    public void user_click_ok_to_delete() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_okee())
        );
        driver.findElement(pageBlast.getBtn_okee()).click();
    }
    @And("user click cancel to not delete post")
    public void user_click_cancel_to_not_delete_post() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBlast.getBtn_cancel())
        );
        driver.findElement(pageBlast.getBtn_cancel()).click();
    }
    @And("user open ones post")
    public void user_open_ones_post() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_post())
        );
        driver.findElement(pageEditBlast.getBtn_post()).click();
    }
    @And("user click add new coment")
    public void user_click_add_new_coment() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_edit())
        );
        driver.findElement(pageEditBlast.getBtn_edit()).click();
    }
    @And("user add coment with character")
    public void user_add_coment_with_character() {
        String coment = "Saya pasti bisa";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @Then("user click submit")
    public void user_click_submit() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_submit())
        );
        driver.findElement(pageEditBlast.getBtn_submit()).click();
    }
    @And("user click icon tags")
    public void user_click_icon_tags() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_mention())
        );
        driver.findElement(pageEditBlast.getBtn_mention()).click();
    }
    @And("user click mention all")
    public void user_click_mention_all() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getMention_all())
        );
        driver.findElement(pageEditBlast.getMention_all()).click();
    }
    @And("user click okee")
    public void user_click_okee() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_ok())
        );
        driver.findElement(pageEditBlast.getBtn_ok()).click();
    }
    @And("user click icon bold")
    public void user_click_icon_bold() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_bold())
        );
        driver.findElement(pageEditBlast.getBtn_bold()).click();
    }
    @And("user click icon italic")
    public void user_click_icon_italic() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_italic())
        );
        driver.findElement(pageEditBlast.getBtn_italic()).click();
    }
    @And("user click icon strikthrough")
    public void user_click_icon_strikthrough() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_strikthrough())
        );
        driver.findElement(pageEditBlast.getBtn_strikthrough()).click();
    }
    @And("user add coment character with bold")
    public void user_add_coment_character_with_bold() {
        driver.findElement(pageEditBlast.getField_coment()).click();
        String input = "𝐒𝐚𝐲𝐚 𝐩𝐚𝐬𝐭𝐢 𝐛𝐢𝐬𝐚";
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(input);
    }
    @And("user add coment character with italic")
    public void user_add_coment_character_with_italic() {
        driver.findElement(pageEditBlast.getField_coment()).click();
        String input = "𝑺𝒂𝒚𝒂 𝒑𝒂𝒔𝒕𝒊 𝒃𝒊𝒔𝒂";
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(input);
    }
    @And("user add coment character with strikthrough")
    public void user_add_coment_character_with_strikthrough() {
        driver.findElement(pageEditBlast.getField_coment()).click();
        String input = " ̶S̶a̶y̶a̶ ̶p̶a̶s̶t̶i̶ ̶b̶i̶s̶a̶";
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(input);
    }
    @And("user click icon add")
    public void user_click_icon_add() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_plus())
        );
        driver.findElement(pageEditBlast.getBtn_plus()).click();
    }
    @And("user add file by image")
    public void user_add_file_by_image() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_image())
        );
        driver.findElement(pageEditBlast.getBtn_image()).click();
    }
    @And("user click by upload")
    public void user_click_by_upload() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_upload())
        );
        driver.findElement(pageEditBlast.getBtn_upload()).click();
    }
    @And("user choose one photo")
    public void user_choose_one_photo() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getImage_one())
        );
        driver.findElement(pageEditBlast.getImage_one()).click();
    }
    @And("user add coment character with numbering")
    public void user_add_coment_character_with_numbering() {
        String numbering = "1. Saya pasti bisa";
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(numbering);
    }
    @And("user add coment character with bullet")
    public void user_add_coment_character_with_bullet() {
        String bullet = "• Saya pasti bisa";
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(bullet);
    }
    @And("user click icon numbering")
    public void user_click_icon_numbering() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_numbering())
        );
        driver.findElement(pageEditBlast.getBtn_numbering()).click();
    }
    @And("user click icon bullet")
    public void user_click_icon_bullet() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_bullets())
        );
        driver.findElement(pageEditBlast.getBtn_bullets()).click();
    }
    @And("user add coment with one character")
    public void user_add_coment_with_one_character() {
        String coment = "S";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user add coment simbol math")
    public void user_add_coment_simbol_math() {
        String coment = "+++---////%%%%==";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user add coment character with emoji")
    public void user_add_coment_character_with_emoji() {
        String coment = "Terimakasih infonya🙏";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user add coment character with symbol math")
    public void user_add_coment_character_with_symbol_math() {
        String coment = "Hasil 2+2 =4";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user click button reply")
    public void user_click_button_reply() throws InterruptedException{
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_cheers())
        );
        tap.tapping(driver, 0.873,0.874,0.873,0.874);
        Thread.sleep(30);
    }
    @And("user click add new coments")
    public void user_click_add_new_coments() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coments())
        );
        driver.findElement(pageEditBlast.getField_coments()).click();
    }
    @And("user add reply")
    public void user_add_reply() {
        String reply = "Problem Solved";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_reply())
        );
        driver.findElement(pageEditBlast.getField_reply()).click();
        driver.findElement(pageEditBlast.getField_reply()).sendKeys(reply);
    }
    @And("user click button cheers")
    public void user_click_button_cheers() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_cheers())
        );
        driver.findElement(pageEditBlast.getBtn_cheers()).click();
    }
    @And("user input field coment")
    public void user_input_field_coment() {
        String coment = "Congrats";
        driver.findElement(pageEditBlast.getBtn_field()).click();
        driver.findElement(pageEditBlast.getBtn_field()).sendKeys(coment);
    }
    @And("user click checklist")
    public void user_click_checklist() {
        driver.findElement(pageEditBlast.getBtn_checklist()).click();
    }
    @And("user click button cancel")
    public void user_click_button_cancel() {
        driver.findElement(pageEditBlast.getBtn_ex()).click();
    }
    @And("user click flutter icon")
    public void user_click_flutter_icon() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_editcoment())
        );
        driver.findElement(pageEditBlast.getBtn_editcoment()).click();
    }
    @And("user click Edit coment")
    public void user_click_edit_coment() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_icnedit())
        );
        driver.findElement(pageEditBlast.getBtn_icnedit()).click();
    }
    @And("user add coments with character")
    public void user_add_coments_with_character() {
        String coment = "Hasil 2+2 =4Saya pasti bisa";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user delete coment")
    public void user_delete_coment() {
        String coment = "";
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getField_coment())
        );
        driver.findElement(pageEditBlast.getField_coment()).click();
        driver.findElement(pageEditBlast.getField_coment()).sendKeys(coment);
    }
    @And("user click archive")
    public void user_click_archive() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_archive())
        );
        driver.findElement(pageEditBlast.getBtn_archive()).click();

    }
    @And("user click Okk")
    public void user_click_okk() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_yes())
        );
        driver.findElement(pageEditBlast.getBtn_yes()).click();

    }
    @And("user click cancel")
    public void user_click_cancel() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageEditBlast.getBtn_no())
        );
        driver.findElement(pageEditBlast.getBtn_no()).click();

    }








}
