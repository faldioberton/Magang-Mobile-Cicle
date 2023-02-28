package Helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class formatType {
    public String getFormatType() {
        List<String> givenList = Arrays.asList("AM", "PM");
        Random rdm = new Random();
        String formatType = givenList.get(rdm.nextInt(givenList.size()));

        return formatType;
    }
}
