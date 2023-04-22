package ObjectRepository;

import org.openqa.selenium.By;


public class pageHome {

    By btn_createcompany = By.xpath("//android.widget.Button[@content-desc='Create New Company']");
    By pageHome = By.xpath("//android.widget.ImageView[@content-desc='logo']");
    By field_name = By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");
    By field_desc = By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[2]");
    By btn_create = By.xpath("//android.widget.Button[@content-desc='Create']");
    By btn_notif = By.xpath("//android.view.View[@content-desc='Successfully create company user']");
    By btn_cancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    By icon_home = By.xpath("//android.widget.ImageView[@content-desc=\"Cicle Logo\"]");

    public By getBtn_cancel() {
        return btn_cancel;
    }

    public By getBtn_create() {
        return btn_create;
    }

    public By getBtn_createcompany() {
        return btn_createcompany;
    }

    public By getBtn_notif() {
        return btn_notif;
    }

    public By getField_desc() {
        return field_desc;
    }

    public By getField_name() {
        return field_name;
    }

    public By getPageHome() {
        return pageHome;
    }

    public By getIcon_home() {
        return icon_home;
    }
}
