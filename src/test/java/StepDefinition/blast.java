package StepDefinition;

import Helper.formatType;
import Helper.scroll;
import Config.environment;
import Helper.accessFile;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import ObjectRepository.pageBlast;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;


public class blast extends environment{
    pageBlast pageBlast = new pageBlast();

    accessFile accessFile = new accessFile();
    scroll sc = new scroll();
    String dataTeamName = "src/test/resources/file/teamName.txt";
    String dataBlastName = "src/test/resources/file/blastName.txt";

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
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcon_plus())
        );
        driver.findElement(pageBlast.getIcon_plus()).click();
    }
    @Then("user input title")
    public void user_input_title() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "Tugas Tambahan";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input title with number")
    public void user_input_title_with_number() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "1234567890";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input title with special character")
    public void user_input_title_with_special_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "@$&/*~*";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input description with special character")
    public void user_input_description_with_special_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "@$&/*~*&&&&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input title with three character")
    public void user_input_title_with_three_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "TOP";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input description with one character")
    public void user_input_description_with_one_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "TOP";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input title with symbol math")
    public void user_input_title_with_symbol_math() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "+-*/";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input description with symbol math")
    public void user_input_description_with_symbol_math() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "+-*/+++++++*****";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input title with emoji")
    public void user_input_title_with_emoji() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        driver.findElement(pageBlast.getField_title()).sendKeys("⚡");
    }
    @And("user input title with dot")
    public void user_input_title_with_dot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        driver.findElement(pageBlast.getField_title()).sendKeys(".");
    }
    @And("user input title with character and emoji")
    public void user_input_title_with_character_and_emoji() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        driver.findElement(pageBlast.getField_title()).sendKeys("Tugas Tambahan⚡");
    }
    @And("user input description with character and emoji")
    public void user_input_description_with_character_and_emoji() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        driver.findElement(pageBlast.getField_desc()).sendKeys("Project adalah istilah yang sering didengar terutama bagi Anda yang sedang terlibat di dalam suatu perusahaan. Sebagai pekerja tentu Anda sering mendengar kata project dan bahkan seringkali terjun pula ke dalamnya⚡⚡⚡⚡⚡⚡⚡⚡");
    }
    @And("user input description with emoji")
    public void user_input_description_with_emoji() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        driver.findElement(pageBlast.getField_desc()).sendKeys("⚡⚡⚡⚡⚡⚡⚡⚡");
    }
    @And("user input description with dot")
    public void user_input_description_with_dot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        driver.findElement(pageBlast.getField_desc()).sendKeys(".");
    }
    @And("user input description with number")
    public void user_input_description_with_number() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_desc())
        );
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "1234567890";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user click icon At")
    public void user_click_icon_at() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getBtn_at())
        );
        driver.findElement(pageBlast.getBtn_at()).click();
    }
    @And("user click icon Bold")
    public void user_click_icon_bold() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcn_bold())
        );
        driver.findElement(pageBlast.getIcn_bold()).click();
    }
    @And("user click icon Italic")
    public void user_click_icon_italic() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcn_italic())
        );
        driver.findElement(pageBlast.getIcn_italic()).click();
    }
    @And("user click icon underline")
    public void user_click_icon_underline() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcn_undrline())
        );
        driver.findElement(pageBlast.getIcn_undrline()).click();
    }
    @And("user click icon slash through")
    public void user_click_icon_slash_through() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcn_dapperwhacks())
        );
        driver.findElement(pageBlast.getIcn_dapperwhacks()).click();
    }
    @And("user click icon strikethrough")
    public void user_click_icon_strikethrough() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getIcn_strikethrough())
        );
        driver.findElement(pageBlast.getIcn_strikethrough()).click();
    }
    @And("user input description")
    public void user_input_description() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "Project Besar";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input description with bold")
    public void user_input_description_with_bold() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "𝐏𝐫𝐨𝐣𝐞𝐜𝐭 𝐚𝐝𝐚𝐥𝐚𝐡 𝐢𝐬𝐭𝐢𝐥𝐚𝐡 𝐲𝐚𝐧𝐠 𝐬𝐞𝐫𝐢𝐧𝐠 𝐝𝐢𝐝𝐞𝐧𝐠𝐚𝐫 𝐭𝐞𝐫𝐮𝐭𝐚𝐦𝐚 𝐛𝐚𝐠𝐢 𝐀𝐧𝐝𝐚 𝐲𝐚𝐧𝐠 𝐬𝐞𝐝𝐚𝐧𝐠 𝐭𝐞𝐫𝐥𝐢𝐛𝐚𝐭 𝐝𝐢 𝐝𝐚𝐥𝐚𝐦 𝐬𝐮𝐚𝐭𝐮 𝐩𝐞𝐫𝐮𝐬𝐚𝐡𝐚𝐚𝐧. 𝐒𝐞𝐛𝐚𝐠𝐚𝐢 𝐩𝐞𝐤𝐞𝐫𝐣𝐚 𝐭𝐞𝐧𝐭𝐮 𝐀𝐧𝐝𝐚 𝐬𝐞𝐫𝐢𝐧𝐠 𝐦𝐞𝐧𝐝𝐞𝐧𝐠𝐚𝐫 𝐤𝐚𝐭𝐚 𝐩𝐫𝐨𝐣𝐞𝐜𝐭 𝐝𝐚𝐧 𝐛𝐚𝐡𝐤𝐚𝐧 𝐬𝐞𝐫𝐢𝐧𝐠𝐤𝐚𝐥𝐢 𝐭𝐞𝐫𝐣𝐮𝐧 𝐩𝐮𝐥𝐚 𝐤𝐞 𝐝𝐚𝐥𝐚𝐦𝐧𝐲𝐚. 𝐏𝐫𝐨𝐣𝐞𝐜𝐭 𝐬𝐞𝐧𝐝𝐢𝐫𝐢 𝐬𝐞𝐛𝐞𝐧𝐚𝐫𝐧𝐲𝐚 𝐦𝐞𝐫𝐮𝐩𝐚𝐤𝐚𝐧 𝐬𝐮𝐚𝐭𝐮 𝐮𝐬𝐚𝐡𝐚 𝐮𝐧𝐭𝐮𝐤 𝐦𝐞𝐧𝐠𝐡𝐚𝐬𝐢𝐥𝐤𝐚𝐧 𝐩𝐫𝐨𝐝𝐮𝐤 𝐛𝐚𝐫𝐚𝐧𝐠 𝐚𝐭𝐚𝐮 𝐣𝐚𝐬𝐚 𝐝𝐚𝐧 𝐛𝐞𝐫𝐥𝐚𝐧𝐠𝐬𝐮𝐧𝐠 𝐮𝐧𝐭𝐮𝐤 𝐬𝐞𝐦𝐞𝐧𝐭𝐚𝐫𝐚 𝐰𝐚𝐤𝐭𝐮 𝐬𝐚𝐣𝐚. 𝐒𝐮𝐚𝐭𝐮 𝐩𝐫𝐨𝐣𝐞𝐜 𝐭𝐞𝐧𝐭𝐮𝐧𝐲𝐚 𝐦𝐞𝐦𝐢𝐥𝐢𝐤𝐢 𝐚𝐰𝐚𝐥 𝐝𝐚𝐧 𝐚𝐤𝐡𝐢𝐫. 𝐀𝐝𝐚 𝐩𝐫𝐨𝐣𝐞𝐜𝐭 𝐲𝐚𝐧𝐠 𝐛𝐞𝐫𝐥𝐚𝐧𝐠𝐬𝐮𝐧𝐠 𝐝𝐚𝐥𝐚𝐦 𝐰𝐚𝐤𝐭𝐮 𝐲𝐚𝐧𝐠 𝐜𝐮𝐤𝐮𝐩 𝐬𝐢𝐧𝐠𝐤𝐚𝐭";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input description with italic")
    public void user_input_description_with_italic() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "𝘗𝘳𝘰𝘫𝘦𝘤𝘵 𝘢𝘥𝘢𝘭𝘢𝘩 𝘪𝘴𝘵𝘪𝘭𝘢𝘩 𝘺𝘢𝘯𝘨 𝘴𝘦𝘳𝘪𝘯𝘨 𝘥𝘪𝘥𝘦𝘯𝘨𝘢𝘳 𝘵𝘦𝘳𝘶𝘵𝘢𝘮𝘢 𝘣𝘢𝘨𝘪 𝘈𝘯𝘥𝘢 𝘺𝘢𝘯𝘨 𝘴𝘦𝘥𝘢𝘯𝘨 𝘵𝘦𝘳𝘭𝘪𝘣𝘢𝘵 𝘥𝘪 𝘥𝘢𝘭𝘢𝘮 𝘴𝘶𝘢𝘵𝘶 𝘱𝘦𝘳𝘶𝘴𝘢𝘩𝘢𝘢𝘯. 𝘚𝘦𝘣𝘢𝘨𝘢𝘪 𝘱𝘦𝘬𝘦𝘳𝘫𝘢 𝘵𝘦𝘯𝘵𝘶 𝘈𝘯𝘥𝘢 𝘴𝘦𝘳𝘪𝘯𝘨 𝘮𝘦𝘯𝘥𝘦𝘯𝘨𝘢𝘳 𝘬𝘢𝘵𝘢 𝘱𝘳𝘰𝘫𝘦𝘤𝘵 𝘥𝘢𝘯 𝘣𝘢𝘩𝘬𝘢𝘯 𝘴𝘦𝘳𝘪𝘯𝘨𝘬𝘢𝘭𝘪 𝘵𝘦𝘳𝘫𝘶𝘯 𝘱𝘶𝘭𝘢 𝘬𝘦 𝘥𝘢𝘭𝘢𝘮𝘯𝘺𝘢";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input description with underline")
    public void user_input_description_with_underline() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "P̲r̲o̲j̲e̲c̲t̲ ̲a̲d̲a̲l̲a̲h̲ ̲i̲s̲t̲i̲l̲a̲h̲ ̲y̲a̲n̲g̲ ̲s̲e̲r̲i̲n̲g̲ ̲d̲i̲d̲e̲n̲g̲a̲r̲ ̲t̲e̲r̲u̲t̲a̲m̲a̲ ̲b̲a̲g̲i̲ ̲A̲n̲d̲a̲ ̲y̲a̲n̲g̲ ̲s̲e̲d̲a̲n̲g̲ ̲t̲e̲r̲l̲i̲b̲a̲t̲ ̲d̲i̲ ̲d̲a̲l̲a̲m̲ ̲s̲u̲a̲t̲u̲ ̲p̲e̲r̲u̲s̲a̲h̲a̲a̲n̲";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @And("user input description with strikethrough")
    public void user_input_description_with_strikethrough() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = " ̶P̶r̶o̶j̶e̶c̶t̶ ̶a̶d̶a̶l̶a̶h̶ ̶i̶s̶t̶i̶l̶a̶h̶ ̶y̶a̶n̶g̶ ̶s̶e̶r̶i̶n̶g̶ ̶d̶i̶d̶e̶n̶g̶a̶r̶ ̶t̶e̶r̶u̶t̶a̶m̶a̶ ̶b̶a̶g̶i̶ ̶A̶n̶d̶a̶ ̶y̶a̶n̶g̶ ̶s̶e̶d̶a̶n̶g̶ ̶t̶e̶r̶l̶i̶b̶a̶t̶ ̶d̶i̶ ̶d̶a̶l̶a̶m̶ ̶s̶u̶a̶t̶u̶ ̶p̶e̶r̶u̶s̶a̶h̶a̶a̶n̶";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }
    @Then("user scroll down")
    public void user_scroll_down() throws InterruptedException {
//       for (int i=0; i<=1; i++) {
           sc.swipedown(driver, 0.8, 0.5, 0.2, 0.5);
           Thread.sleep(10);
       }
//    }

    @Then("user click switch to private")
    public void user_click_switch_to_private() {
            driver.findElement(pageBlast.getBtn_switch()).click();
        }

    @Then("user click publish")
    public void user_click_publish() {
        driver.findElement(pageBlast.getBtn_publish()).click();
    }
    @And("user open ones blast")
    public void user_open_ones_blast() {
        By btnCurrentBlast = pageBlast.getBtnCrnBlast(accessFile.readFromFile(dataBlastName));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(btnCurrentBlast)
        );
        driver.findElement(btnCurrentBlast).click();
    }
    @And("user choose one member")
    public void user_choose_one_member() {
        driver.findElement(pageBlast.getBtn_memberOne()).click();
    }
    @And("user choose all member")
    public void user_choose_all_member() {
        driver.findElement(pageBlast.getBtn_allmember()).click();
    }
    @And("user input title with character")
    public void user_input_title_with_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "Tugas Tambahan";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user input description with character")
    public void user_input_description_with_character() {
        driver.findElement(pageBlast.getField_desc()).click();
        String input = "Project Besar";
        driver.findElement(pageBlast.getField_desc()).sendKeys(input);
    }

    @And("user input title with more than 200 character")
    public void user_input_title_with_more_than_200_character() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getField_title())
        );
        driver.findElement(pageBlast.getField_title()).click();
        String input = "Namun sesampainya di sebrang sungai, Kancil langsung mengucapkan terima kasih kepada para baya karena mau membantunya menyebrangi sungai kemudian langsung melarikan diri. Hal ini pun membuat para buaya marah karena merasa dibohongi.";
        driver.findElement(pageBlast.getField_title()).sendKeys(input);
    }
    @And("user click icon notice")
    public void user_click_icon_notice() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBlast.getBtn_notice())
        );
        driver.findElement(pageBlast.getBtn_notice()).click();
    }
    @And("user choose all member to notice")
    public void user_choose_all_member_to_notice() {
        driver.findElement(pageBlast.getBtn_commember()).click();
    }
    @And("user unchecklist all member")
    public void user_unchecklist_all_member() {
     MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox"));
//     act.doubleClick(element).perform();
     element.click();
     element.click();
    }
    @And("user click done")
    public void user_click_done() {
        driver.findElement(pageBlast.getBtn_done()).click();
    }
    @And("user click icon due date")
    public void user_click_icon_due_date() {
        driver.findElement(pageBlast.getBtn_icondudate()).click();
    }
    @And("user input next week date")
    public void user_input_next_week_date() {
        driver.findElement(pageBlast.getBtn_date()).click();
    }
    @And("user click button ok")
    public void user_click_button_ok() {
        driver.findElement(pageBlast.getBtn_ok()).click();
    }
    @And("user set due time")
    public void user_set_due_time() {
        driver.findElement(pageBlast.getSet_time()).click();
    }
    @And("user set hour")
    public void user_set_hour() {
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        String hour = "10";
        element.click();
        element.sendKeys(hour);
    }
    @And("user set minute")
    public void user_set_minute() {
        MobileElement el = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        String minute = "50";
        el.click();
        el.sendKeys(minute);
    }
    @And("user choose format time")
    public void user_choose_format_time() {
        driver.findElement(pageBlast.getBtn_pm()).click();
    }
    @And("user click ok")
    public void user_click_ok() {
        driver.findElement(pageBlast.getBtn_oke()).click();
    }
    @And("user input last week date")
    public void user_input_last_week_date() {
        driver.findElement(pageBlast.getBtn_lastweek()).click();
    }
    @And("user click edit")
    public void user_click_edit() {
        driver.findElement(pageBlast.getBtn_edit()).click();
    }
    @And("user input last month")
    public void user_input_last_month() {
        driver.findElement(pageBlast.getBtn_lastmonth()).click();
        String month = "2/25/2023";
        driver.findElement(pageBlast.getBtn_lastmonth()).sendKeys(month);
    }
    @And("user input last year")
    public void user_input_last_year() {
        driver.findElement(pageBlast.getBtn_lastmonth()).click();
        String month = "3/25/2022";
        driver.findElement(pageBlast.getBtn_lastmonth()).sendKeys(month);
    }
    @And("user set invalid hour")
    public void user_set_invalid_hour() {
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        String hour = "25";
        element.click();
        element.sendKeys(hour);
    }
    @And("user set hours that have been passed")
    public void user_set_hours_that_have_been_passed() {
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        String hour = "10";
        element.click();
        element.sendKeys(hour);
    }
    @And("user set invalid minute")
    public void user_set_invalid_minute() {
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        String hour = "61";
        element.click();
        element.sendKeys(hour);
    }

}