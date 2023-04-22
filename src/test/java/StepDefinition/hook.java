package StepDefinition;

import Config.environment;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hook extends environment{
    login login = new login();
    @Before
    public void before() throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Realme");
        capabilities.setCapability("udid", "bfb80eb1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:/Users/asus/Desktop/stagging.apk");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
        login.user_in_home_page();
        login.user_click_skip();
//        login.user_click_yes();
//        login.scroll.swiperight();
        login.user_found_button_sign_in();
        login.user_click_check_box();
        login.user_click_sign_in();
        login.user_click_sign_in_with_google_account();
        login.user_click_account_1_to_sign_in();
    }

     @After
     public void after(Scenario scenario) throws IOException {
         File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         if (scenario.isFailed()){
             FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/failed/" + scenario.getName() + ".png"));
         } else {
             FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/success/" + scenario.getName() + ".png"));
         }

         driver.quit();
     }
}
