package ObjectRepository;

import Helper.accessFile;
import org.openqa.selenium.By;

public class pageBlast {
    accessFile accessFile = new accessFile();
    String dataTeamName = "src/test/resources/File/teamName.txt";
    By btn_blast = By.xpath("//android.widget.ImageView[@content-desc='Blast']");
    By icon_plus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By field_title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    By field_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_switch = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
    By btn_publish = By.xpath("//android.widget.Button[@content-desc='Publish']");

    public By getBtn_blast() {
        return btn_blast;
    }

    public By getIcon_plus() {
        return icon_plus;
    }

    public By getField_title() {
        return field_title;
    }

    public By getField_desc() {
        return field_desc;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getBtn_publish() {
        return btn_publish;
    }

    public By getCtnCurrTeam(String teamName) {
        By ctnCurrTeam = By.xpath("//android.widget.Button[contains(@content-desc, '" + teamName + "')]");
        return ctnCurrTeam;
    }
    public By getPageTeam() {
        By pageTeam = By.xpath("//android.view.View[contains(@content-desc, '" + accessFile.readFromFile(dataTeamName) + "')]");
        return pageTeam;
    }
}
