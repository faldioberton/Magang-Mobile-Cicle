package ObjectRepository;

import Helper.accessFile;
import org.openqa.selenium.By;

public class pageEditBlast {
    accessFile accessFile = new accessFile();
    String dataTeamName = "src/test/resources/File/teamName.txt";
    String dataDate = "25 Mar 2023";
    String dataMemberName = "Faldi Silaen";
    String dataPost = "07:20";
    String buttonReply = "Reply";
    String dataHorizontal = "7:25 AM";
    String datacoment = "Hebatt";

    By btn_post = By.xpath("//android.widget.ImageView[contains(@content-desc,'" +dataPost+ "')]");
    By btn_edit = By.xpath("//android.view.View[@content-desc='Add new comment...']");
    By field_coment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By btn_submit = By.xpath("//android.widget.Button[@content-desc='submit']");
    By btn_mention = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[1]");
    By mention_all = By.xpath("//android.view.View[@content-desc='mention all']");
    By btn_ok = By.xpath("//android.widget.Button[@content-desc='Ok']");
    By btn_bold = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[1]");
    By btn_italic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[2]");
    By btn_strikthrough = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[3]");
    By btn_plus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[2]");
    By btn_numbering = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[3]");
    By btn_bullets = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
    By btn_image = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
    By btn_upload = By.xpath("//android.view.View[@content-desc='by upload']");
    By image_one = By.xpath("//android.widget.LinearLayout[@content-desc='Screenshot_2023-03-19-07-44-57-10_5a3ae4e1b4503fed48de47c655899392.jpg, 302 kB, 07:44']/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
    By btn_reply = By.xpath("//*(//android.view.View[@content-desc='Reply'])[2]");
    By btn_editcoment = By.xpath("//android.view.View[contains(@content-desc, '" +dataHorizontal+"')]/android.view.View[1]");
    By btn_icnedit = By.xpath("//android.view.View[@content-desc='Edit Comment']");
    By btn_archive = By.xpath("//android.view.View[@content-desc='Archive']");
    By btn_yes = By.xpath("//android.widget.Button[@content-desc='Ok']");
    By btn_no = By.xpath("//android.widget.Button[@content-desc='Cancel']");
    By btn_cheers = By.xpath("//android.view.View[contains(@content-desc, '" +datacoment+ "')]/android.widget.ImageView[2]");
    By btn_checklist = By.xpath("//android.view.View[contains(@content-desc, '" +datacoment+ "')]/android.view.View[2]");
    By btn_ex = By.xpath("//android.view.View[contains(@content-desc, '" +datacoment+ "')]/android.view.View[3]");
    By btn_field = By.xpath("//android.view.View[contains(@content-desc, '" +datacoment+ "')]/android.widget.EditText");
    By field_coments = By.xpath("//android.view.View[@content-desc='Add new comment...']");
    By field_reply = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    public By getBtn_post() {
        return btn_post;
    }

    public By getBtn_edit() {
        return btn_edit;
    }

    public By getBtn_submit() {
        return btn_submit;
    }

    public By getField_coment() {
        return field_coment;
    }

    public By getBtn_plus() {
        return btn_plus;
    }

    public By getBtn_bold() {
        return btn_bold;
    }

    public By getBtn_bullets() {
        return btn_bullets;
    }

    public By getBtn_italic() {
        return btn_italic;
    }

    public By getBtn_mention() {
        return btn_mention;
    }

    public By getMention_all() {
        return mention_all;
    }

    public By getBtn_ok() {
        return btn_ok;
    }

    public By getBtn_numbering() {
        return btn_numbering;
    }

    public By getBtn_strikthrough() {
        return btn_strikthrough;
    }

    public By getBtn_image() {
        return btn_image;
    }

    public By getBtn_upload() {
        return btn_upload;
    }

    public By getImage_one() {
        return image_one;
    }

    public By getBtn_reply() {
        return btn_reply;
    }

    public By getBtn_editcoment() {
        return btn_editcoment;
    }

    public By getBtn_icnedit() {
        return btn_icnedit;
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

    public By getBtn_cheers() {
        return btn_cheers;
    }

    public By getField_coments() {
        return field_coments;
    }

    public By getField_reply() {
        return field_reply;
    }

    public By getBtn_checklist() {
        return btn_checklist;
    }

    public By getBtn_ex() {
        return btn_ex;
    }

    public By getBtn_field() {
        return btn_field;
    }
}
