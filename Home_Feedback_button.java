package com.example.thakurs.myapplication;

import android.os.Bundle;

import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Home_Feedback_button
{
    WebDriver wd=new WebDriver()
    {
        AndroidDriver driver;
        driver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), capabilities);

        getoptions();

        public static Home_Feedback_button newInstance() {

            Bundle args = new Bundle();

            Home_Feedback_button fragment = new Home_Feedback_button();
            fragment.setArguments(args);
            return fragment;

            //To select Option in the list
            newSelect(wd.findElement(By.id("spinner_categories"))).selectByValue("text1");

            //To display all options in the list(which will display in console)
            Select List= new Select(wd.findElement(By.id("spinner_categories")));
            List <WebElement>alloptions=List.getoptions;
            int x=alloptions.size();
            for (WebElement WebElement:alloptions)
            {
                System.out.println(WebElement.getText());
            }

        }
    }
}
