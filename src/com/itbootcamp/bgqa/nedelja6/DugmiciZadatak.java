package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.IOException;

public class DugmiciZadatak {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fane9\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/buttons");

        wd.manage().window().maximize();
        Actions actions = new Actions(wd);

        WebElement doubleClickMe = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
        actions.doubleClick(doubleClickMe).perform();

        WebElement rightClickMe = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        actions.contextClick(rightClickMe).perform();

        WebElement clickMe = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]"));
        actions.click(clickMe).perform();

        Thread.sleep(1000);

        WebElement dClickMess = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
        WebElement rClickMess = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        WebElement cClickMess = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/p[3]"));

        Assert.assertEquals(true, dClickMess.isDisplayed());
        Assert.assertEquals(true, rClickMess.isDisplayed());
        Assert.assertEquals(true, cClickMess.isDisplayed());

        wd.close();
    }
}
