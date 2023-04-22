package ObjectRepository;

import org.openqa.selenium.By;

public class pageGroupChat {

    By btn_groupchat = By.xpath("//android.widget.ImageView[@content-desc='Group Chat']");
    By btn_fieldmessage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_tag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    By btn_attach = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]");
    By btn_fromgalery = By.xpath("//android.view.View[@content-desc='Image from Gallery']");
    By btn_file = By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_2023-03-24-08-41-14-54_a34709e6f7e4a5118b4e645fe0f1c12f.jpg, 306 kB, 08:41\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
    By btn_mentionall = By.xpath("//android.view.View[@content-desc='mention all']");
    By btn_send = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_fromcamera = By.xpath("//android.view.View[@content-desc='Image from Camera']");
    By btn_tap = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.ImageView[3]");
    By btn_checklist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.ImageView[2]");
    By btn_allow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By btn_docandvideo = By.xpath("//android.view.View[@content-desc='Document & Video']");
    By btn_doc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[4]");
    By file_doc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
    By btn_tapvideo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CompoundButton[3]");
    By btn_filevideo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
    By btn_view = By.xpath("//android.widget.ImageView[@content-desc=\"VID-20230323-WA0012.mp4\n" +
            "11:58 AM\"]/android.view.View");
    public By getBtn_groupchat() {
        return btn_groupchat;
    }

    public By getBtn_fieldmessage() {
        return btn_fieldmessage;
    }

    public By getBtn_tag() {
        return btn_tag;
    }

    public By getBtn_attach() {
        return btn_attach;
    }

    public By getBtn_file() {
        return btn_file;
    }

    public By getBtn_fromgalery() {
        return btn_fromgalery;
    }

    public By getBtn_mentionall() {
        return btn_mentionall;
    }

    public By getBtn_send() {
        return btn_send;
    }

    public By getBtn_fromcamera() {
        return btn_fromcamera;
    }

    public By getBtn_tap() {
        return btn_tap;
    }

    public By getBtn_checklist() {
        return btn_checklist;
    }

    public By getBtn_allow() {
        return btn_allow;
    }

    public By getBtn_tapvideo() {
        return btn_tapvideo;
    }

    public By getBtn_filevideo() {
        return btn_filevideo;
    }

    public By getBtn_view() {
        return btn_view;
    }

    public By getBtn_doc() {
        return btn_doc;
    }

    public By getFile_doc() {
        return file_doc;
    }

    public By getBtn_docandvideo() {
        return btn_docandvideo;
    }
}
