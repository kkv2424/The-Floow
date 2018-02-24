package com.example.thakurs.myapplication;

import org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Account_creation
{
    AndroidDriver driver;
    driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);

    Public static void main()
{
    WebDriver wd=new WebDriver() {
        @Override
        public void get(String s) {

        }

        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public List<WebElement> findElements(By by) {
            return null;
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public void quit() {

        }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }
    }


    wd.findElement(By.name("username")).sendkeys("kkv");
    wd.findElement(By.name("password")).sendkeys("mickymouse123");
    wd.findElement(By.name("login")).click();

}
    StaticCodeInstructionConstraintException wd;

    @BeforeClass
    Public static void openapp()
{
    System.out.println("Please enter your details below.");
}


}
