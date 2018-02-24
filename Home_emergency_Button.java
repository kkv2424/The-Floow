package com.example.thakurs.myapplication;

import org.apache.bcel.verifier.exc.StaticCodeInstructionConstraintException;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Home_emergency_Button
{
    WebDriver wd=new WebDriver()
    {
        AndroidDriver driver;
        driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);

        StaticCodeInstructionConstraintException;

        gettext() {
            System.out.println("Need our helpright now?");
            System.out.println("You sleected the Emergency options");
        }

        wd.findElement wd.findElement(By.name("Breakdown")).click();
     wd.findElement(By.name("callnow")).click();

        wd.findElement wd.findElement(By.name("Accident")).click();
     wd.findElement(By.name("callnow")).click();
    }
}
