package ObjectRepository;

import Helper.accessFile;
import org.openqa.selenium.By;

public class pageCheckIn {

    String acountone = "Hari ini ngapain aja gaes?";
    String button_name = "Asking 1 people every  Mon, Tue, Sat, at 09:00 AM";
    String datacomentar = "Hebatt";
    String datacomen = "Bagus";
    By btn_checkIn = By.xpath("//android.widget.ImageView[@content-desc='Check-Ins']");
    By btn_iconplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_fieldquest = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_mon = By.xpath("//android.view.View[@content-desc='Mon']");
    By btn_tue = By.xpath("//android.view.View[@content-desc='Tue']");
    By btn_wed = By.xpath("//android.view.View[@content-desc='Wed']");
    By btn_thu = By.xpath("//android.view.View[@content-desc='Thu']");
    By btn_fri = By.xpath("//android.view.View[@content-desc='Fri']");
    By btn_sat = By.xpath("//android.view.View[@content-desc='Sat']");
    By btn_sun = By.xpath("//android.view.View[@content-desc='Sun']");
    By btn_settime = By.xpath("//android.view.View[@content-desc='set time']");
    By btn_setting = By.xpath("//android.widget.Button[@content-desc='Switch to text input mode']");
    By btn_hour = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    By btn_minute = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    By btn_am = By.xpath("//android.widget.RadioButton[@content-desc='AM']");
    By btn_pm = By.xpath("//android.widget.RadioButton[@content-desc='PM']");
    By btn_cancel = By.xpath("//android.widget.Button[@content-desc='CANCEL']");
    By btn_ok = By.xpath("//android.widget.Button[@content-desc='OK']");
    By btn_addmember = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[14]");
    By btn_done = By.xpath("//android.view.View[@content-desc='done']");
    By btn_private = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Switch");
    By btn_start = By.xpath("//android.widget.Button[@content-desc='Start collecting answer!']");
    By btn_onescheckin = By.xpath("//android.view.View[contains(@content-desc, '" +acountone+ "' )]");
    By btn_oneposts = By.xpath("//android.view.View[contains(@content-desc, '" +acountone+ "' )]");
    By btn_elipsis = By.xpath("");
    By btn_random = By.xpath("//android.widget.Button[contains(@content-desc, '" +button_name+ "' )]");
    By btn_edit = By.xpath("//android.view.View[@content-desc='Edit']");
    By btn_archive = By.xpath("//android.view.View[@content-desc='Archive']");
    By btn_yes = By.xpath("//android.widget.Button[@content-desc='Yes']");
    By btn_no = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    By btn_save = By.xpath("//android.widget.Button[@content-desc='Save changes']");
    By btn_cansel = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    By btn_fieldques = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_edittime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[12]");
    By btn_switc = By.xpath("//android.widget.Button[@content-desc='Switch to text input mode']");
    By btn_jam = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    By btn_menit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    By btn_oks = By.xpath("//android.widget.Button[@content-desc='OK']");
    By btn_addcoment = By.xpath("//android.view.View[@content-desc='Add new comment...']");
    By field_coment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_cheers = By.xpath("//android.view.View[contains(@content-desc, '" +datacomentar+ "' )]/android.widget.ImageView[2]");
    By btn_at = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[1]");

    By btn_mention = By.xpath("//android.view.View[@content-desc='mention all']");
    By btn_oke = By.xpath("//android.widget.Button[@content-desc='Ok']");
    By btn_cancels = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    By btn_eliphorizontal = By.xpath("//android.view.View[contains(@content-desc, '" +datacomen+ "')]/android.view.View[1]");
    By btn_editcoment = By.xpath("//android.view.View[@content-desc='Edit Comment']");
    By btn_field = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_submit = By.xpath("//android.widget.Button[@content-desc='submit']");
    By btn_att = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[1]");
    By btn_mentionall  = By.xpath("//android.view.View[@content-desc='mention all']");
    public By getBtn_checkIn() {
        return btn_checkIn;
    }

    public By getBtn_iconplus() {
        return btn_iconplus;
    }

    public By getBtn_fieldquest() {
        return btn_fieldquest;
    }

    public By getBtn_fri() {
        return btn_fri;
    }

    public By getBtn_mon() {
        return btn_mon;
    }
    public By getBtn_sat() {
        return btn_sat;
    }

    public By getBtn_sun() {
        return btn_sun;
    }

    public By getBtn_thu() {
        return btn_thu;
    }

    public By getBtn_tue() {
        return btn_tue;
    }

    public By getBtn_wed() {
        return btn_wed;
    }

    public By getBtn_settime() {
        return btn_settime;
    }

    public By getBtn_addmember() {
        return btn_addmember;
    }

    public By getBtn_cancel() {
        return btn_cancel;
    }

    public By getBtn_pm() {
        return btn_pm;
    }

    public By getBtn_ok() {
        return btn_ok;
    }

    public By getBtn_minute() {
        return btn_minute;
    }

    public By getBtn_hour() {
        return btn_hour;
    }

    public By getBtn_am() {
        return btn_am;
    }

    public By getBtn_setting() {
        return btn_setting;
    }

    public By getBtn_private() {
        return btn_private;
    }

    public By getBtn_start() {
        return btn_start;
    }

    public By getBtn_done() {
        return btn_done;
    }

    public By getBtn_onescheckin() {
        return btn_onescheckin;
    }

    public By getBtn_random() {
        return btn_random;
    }

    public By getBtn_edit() {
        return btn_edit;
    }

    public By getBtn_archive() {
        return btn_archive;
    }

    public By getBtn_yes() {
        return btn_yes;
    }

    public By getBtn_no() {
        return btn_no;
    }

    public By getBtn_save() {
        return btn_save;
    }

    public By getBtn_cansel() {
        return btn_cansel;
    }

    public By getBtn_oneposts() {
        return btn_oneposts;
    }

    public By getBtn_fieldques() {
        return btn_fieldques;
    }

    public By getBtn_edittime() {
        return btn_edittime;
    }

    public By getBtn_switc() {
        return btn_switc;
    }

    public By getBtn_jam() {
        return btn_jam;
    }

    public By getBtn_menit() {
        return btn_menit;
    }

    public By getBtn_oks() {
        return btn_oks;
    }

    public By getField_coment() {
        return field_coment;
    }

    public By getBtn_addcoment() {
        return btn_addcoment;
    }

    public By getBtn_cheers() {
        return btn_cheers;
    }

    public By getBtn_at() {
        return btn_at;
    }

    public By getBtn_mention() {
        return btn_mention;
    }

    public By getBtn_oke() {
        return btn_oke;
    }

    public By getBtn_cancels() {
        return btn_cancels;
    }

    public By getBtn_editcoment() {
        return btn_editcoment;
    }

    public By getBtn_eliphorizontal() {
        return btn_eliphorizontal;
    }

    public By getBtn_field() {
        return btn_field;
    }

    public By getBtn_submit() {
        return btn_submit;
    }

    public By getBtn_att() {
        return btn_att;
    }

    public By getBtn_mentionall() {
        return btn_mentionall;
    }
}
