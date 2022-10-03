package com.itbootcamp.bgqa.nedelja6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class ZadatakAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/alerts");

        WebElement webElement = wd.findElement(By.id("alertButton"));
        webElement.click();

        Thread.sleep(1000);

        wd.switchTo().alert().accept();

        WebElement webElement1 = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/button[1]"));
        webElement1.click();

        new WebDriverWait(wd, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());

        wd.switchTo().alert().accept();

        WebElement confirmButton = wd.findElement(By.id("confirmButton"));
        confirmButton.click();
        wd.switchTo().alert().accept();
        confirmButton.click();
        wd.switchTo().alert().dismiss();

        WebElement promptBoxBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/button[1]"));

        promptBoxBtn.click();

        wd.switchTo().alert().sendKeys("text");
        wd.switchTo().alert().accept();

        WebElement confirmationMess = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/span[2]"));

        System.out.println(confirmationMess.getText().contains("Ok"));
        System.out.println(confirmationMess.getText().contains("Cancel"));

        WebElement textBox = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[1]/span[2]"));

        Assert.assertEquals(true, textBox.isDisplayed());




        wd.close();

    }
}
