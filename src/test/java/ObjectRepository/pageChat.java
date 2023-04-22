package ObjectRepository;

import org.openqa.selenium.By;

public class pageChat {
    String tab = "Menu";

    By btn_menu = By.xpath("//android.view.View[contains(@content-desc, '" +tab+ "' )]");
    By btn_inbox = By.xpath("//android.view.View[@content-desc='Inbox']");
    By btn_addchat = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_memberchat = By.xpath("//android.widget.ImageView[@content-desc='Faldi Silaen_PQA16']");
    By field_message = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_send = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_tag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
    By btn_member = By.xpath("//android.widget.ImageView[@content-desc='Faldi Silaen_PQA16']");
    By btn_attach = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    By btn_image = By.xpath("//android.view.View[@content-desc='Image from Gallery']");
    By btn_file = By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_2023-03-24-08-41-14-54_a34709e6f7e4a5118b4e645fe0f1c12f.jpg, 306 kB, 08:41\"]/android.widget.RelativeLayout/android.widget.FrameLayout[2]");
    public By getBtn_menu() {
        return btn_menu;
    }
    public By getBtn_inbox() {
        return btn_inbox;
    }
    public By getBtn_addchat() {
        return btn_addchat;
    }

    public By getBtn_memberchat() {
        return btn_memberchat;
    }

    public By getField_message() {
        return field_message;
    }

    public By getBtn_send() {
        return btn_send;
    }

    public By getBtn_tag() {
        return btn_tag;
    }

    public By getBtn_member() {
        return btn_member;
    }

    public By getBtn_image() {
        return btn_image;
    }

    public By getBtn_attach() {
        return btn_attach;
    }

    public By getBtn_file() {
        return btn_file;
    }
}
