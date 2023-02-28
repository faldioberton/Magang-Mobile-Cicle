package Helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class scroll {

    public static void swipedown(AppiumDriver driver, double start_xd, double start_yd, double end_xd, double end_yd) {
        Dimension size = driver.manage().window().getSize();
        int start_x = (int) (size.width * start_xd);
        int start_y = (int) (size.height * start_yd);
        int end_x = (int) (size.width * end_xd);
        int end_y = (int) (size.height * end_yd);

        new TouchAction(driver).press(PointOption.point(start_x, end_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(start_y, end_x))
                .release()
                .perform();
    }
}
