package ObjectRepository;

import Helper.accessFile;
import org.openqa.selenium.By;

public class pageBlast {
    accessFile accessFile = new accessFile();
    String dataTeamName = "src/test/resources/File/teamName.txt";
    String dataDate = "25 Mar 2023";
    String dataMemberName = "Faldi Silaen";
    String dataVertikal = "Tugas Tambahan";
    By btn_blast = By.xpath("//android.widget.ImageView[@content-desc='Blast']");
    By icon_plus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By field_title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    By field_desc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_switch = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
    By btn_publish = By.xpath("//android.widget.Button[@content-desc='Publish']");
    By btn_at = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.view.View[1]");
    By btn_memberOne = By.xpath("//android.widget.ImageView[@content-desc, '" + dataMemberName + "']");
    By btn_allmember = By.xpath("//android.view.View[@content-desc='mention all']");
    By btn_notice = By.xpath("//android.view.View[@content-desc='Who do you wanna be notified?']");

    By btn_commember = By.xpath("//android.widget.CheckBox[@content-desc, '" + dataMemberName + "']");
    By btn_done = By.xpath("//android.view.View[@content-desc='done']");
    By btn_checkbox = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    By btn_icondudate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
    By btn_duedate = By.xpath("//android.widget.Button[contains(@content-desc,'" +dataDate+ "')]");
    By btn_date = By.xpath("//android.view.View[@content-desc='25, Saturday, March 25, 2023']");
    By btn_ok = By.xpath("//android.widget.Button[@content-desc='OK']");
    By set_time = By.xpath("//android.widget.Button[@content-desc='Switch to text input mode']");
    By btn_hour = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    By btn_minute = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    By btn_am = By.xpath("//android.widget.RadioButton[@content-desc='AM']");
    By btn_pm = By.xpath("//android.widget.RadioButton[@content-desc='PM']");
    By btn_oke = By.xpath("//android.widget.Button[@content-desc='OK']");
    By btn_lastweek = By.xpath("//android.view.View[@content-desc='11, Saturday, March 11, 2023']");
    By btn_edit = By.xpath("//android.widget.Button[@content-desc='Switch to input']");
    By btn_lastmonth = By.xpath("//android.view.View[@content-desc='SELECT DATE\n" +
            "Sat, Mar 25']/android.widget.EditText");
    By icn_bold = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[1]");
    By icn_italic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[2]");
    By icn_undrline = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[3]");
    By icn_dapperwhacks = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[4]");
    By icn_strikethrough = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[5]");
    By icn_vertikal = By.xpath("//android.widget.ImageView[contains(@content-desc,'" +dataVertikal+ "')]/android.view.View");
    By page_edit = By.xpath("//android.view.View[@content-desc='Edit Post\n" +
            "[Blast] - Company 26713']");
    By btn_edite = By.xpath("//android.view.View[@content-desc='Edit']");
    By btn_datetmmrow = By.xpath("//android.view.View[@content-desc='19, Sunday, March 19, 2023']");
    By btn_publishchange = By.xpath("//android.widget.Button[@content-desc='Publish changes']");
    By btn_attach = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.view.View[2]");
    By btn_allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By file_one = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
    By edit_edit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_archive = By.xpath("//android.view.View[@content-desc='Archive']");
    By btn_okee = By.xpath("//android.widget.Button[@content-desc='Ok']");
    By btn_cancel = By.xpath("//android.widget.Button[@content-desc='Cancel']");
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
    public By getBtnCrnBlast(String blastName) {
        By btnCrnBlast = By.xpath("//android.view.View[contains(@content-desc, '" + blastName + "')]");
        return btnCrnBlast;
    }

    public By getBtn_memberOne() {
        return btn_memberOne;
    }

    public By getBtn_at() {
        return btn_at;
    }

    public By getBtn_allmember() {
        return btn_allmember;
    }

    public By getBtn_notice() {
        return btn_notice;
    }

    public By getBtn_commember() {
        return btn_commember;
    }

    public By getBtn_done() {
        return btn_done;
    }

    public By getBtn_checkbox() {
        return btn_checkbox;
    }

    public By getBtn_icondudate() {
        return btn_icondudate;
    }

    public By getBtn_date() {
        return btn_date;
    }

    public By getBtn_ok() {
        return btn_ok;
    }

    public By getSet_time() {
        return set_time;
    }

    public By getBtn_am() {
        return btn_am;
    }

    public By getBtn_hour() {
        return btn_hour;
    }

    public By getBtn_minute() {
        return btn_minute;
    }

    public By getBtn_oke() {
        return btn_oke;
    }

    public By getBtn_pm() {
        return btn_pm;
    }
    public By getBtn_lastweek() {
        return btn_lastweek;
    }
    public By getBtn_edit() {
        return btn_edit;
    }

    public By getBtn_lastmonth() {
        return btn_lastmonth;
    }

    public By getIcn_bold() {
        return icn_bold;
    }

    public By getIcn_italic() {
        return icn_italic;
    }

    public By getIcn_undrline() {
        return icn_undrline;
    }

    public By getIcn_dapperwhacks() {
        return icn_dapperwhacks;
    }

    public By getIcn_strikethrough() {
        return icn_strikethrough;
    }

    public By getIcn_vertikal() {
        return icn_vertikal;
    }

    public By getBtn_edite() {
        return btn_edite;
    }

    public By getPage_edit() {
        return page_edit;
    }

    public By getBtn_datetmmrow() {
        return btn_datetmmrow;
    }

    public By getBtn_duedate() {
        return btn_duedate;
    }

    public By getBtn_publishchange() {
        return btn_publishchange;
    }

    public By getBtn_attach() {
        return btn_attach;
    }

    public By getBtn_allow() {
        return btn_allow;
    }

    public By getEdit_edit() {
        return edit_edit;
    }

    public By getFile_one() {
        return file_one;
    }

    public By getBtn_archive() {
        return btn_archive;
    }

    public By getBtn_okee() {
        return btn_okee;
    }

    public By getBtn_cancel() {
        return btn_cancel;
    }
}
