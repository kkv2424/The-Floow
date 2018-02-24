package com.example.thakurs.myapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

public class First_TC {

    AndroidDriver driver;
    driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);

    public static final String USERNAME = "YOUR_USERNAME";
    public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Samsung Galaxy J7 Emulator");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("app", "http://flowdrive.floowapp.io.apk");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.5.3");

        WebDriver driver = new AndroidDriver<>(new URL(URL), capabilities);

        /**
         * Test Actions here...
         */

        driver.quit();
    }
}
