package com.itbootcamp.bgqa.nedelja6;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class DomaciSelenium1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fane9\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/text-box");

        //https://demoqa.com/text-box dohvatit sve elemente i submit formu, + proveriti sa equals da li sabmitovanox`
        //Thread.sleep(1000)

        wd.manage().window().maximize();

        WebElement element1 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));
        System.out.println(element1.getText());
        System.out.println(element1.getTagName());
        System.out.println(element1.getAttribute("class"));
        System.out.println(element1.getAttribute("xpath"));
        System.out.println(element1.getAttribute("id"));
        System.out.println(element1.getCssValue("color"));
        System.out.println(element1.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element2 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        System.out.println(element2.getText());
        System.out.println(element2.getTagName());
        System.out.println(element2.getAttribute("class"));
        System.out.println(element2.getAttribute("xpath"));
        System.out.println(element2.getAttribute("id"));
        System.out.println(element2.getCssValue("color"));
        System.out.println(element2.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element3 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]"));
        System.out.println(element3.getText());
        System.out.println(element3.getTagName());
        System.out.println(element3.getAttribute("class"));
        System.out.println(element3.getAttribute("xpath"));
        System.out.println(element3.getAttribute("id"));
        System.out.println(element3.getCssValue("color"));
        System.out.println(element3.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element4 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        System.out.println(element4.getText());
        System.out.println(element4.getTagName());
        System.out.println(element4.getAttribute("class"));
        System.out.println(element4.getAttribute("xpath"));
        System.out.println(element4.getAttribute("id"));
        System.out.println(element4.getCssValue("color"));
        System.out.println(element4.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element5 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/label[1]"));
        System.out.println(element5.getText());
        System.out.println(element5.getTagName());
        System.out.println(element5.getAttribute("class"));
        System.out.println(element5.getAttribute("xpath"));
        System.out.println(element5.getAttribute("id"));
        System.out.println(element5.getCssValue("color"));
        System.out.println(element5.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element6 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        System.out.println(element6.getText());
        System.out.println(element6.getTagName());
        System.out.println(element6.getAttribute("class"));
        System.out.println(element6.getAttribute("xpath"));
        System.out.println(element6.getAttribute("id"));
        System.out.println(element6.getCssValue("color"));
        System.out.println(element6.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element7 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/label[1]"));
        System.out.println(element7.getText());
        System.out.println(element7.getTagName());
        System.out.println(element7.getAttribute("class"));
        System.out.println(element7.getAttribute("xpath"));
        System.out.println(element7.getAttribute("id"));
        System.out.println(element7.getCssValue("color"));
        System.out.println(element7.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element8 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        System.out.println(element8.getText());
        System.out.println(element8.getTagName());
        System.out.println(element8.getAttribute("class"));
        System.out.println(element8.getAttribute("xpath"));
        System.out.println(element8.getAttribute("id"));
        System.out.println(element8.getCssValue("color"));
        System.out.println(element8.getLocation());

        System.out.println("----------SLEDECI ELEMENT----------");

        WebElement element9 = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        System.out.println(element9.getText());
        System.out.println(element9.getTagName());
        System.out.println(element9.getAttribute("class"));
        System.out.println(element9.getAttribute("xpath"));
        System.out.println(element9.getAttribute("id"));
        System.out.println(element9.getCssValue("color"));
        System.out.println(element9.getLocation());

        System.out.println("----------KRAJ GET.ELEMENATA----------");

        WebElement inputName = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));

        inputName.sendKeys("Stefan");

        WebElement inputEmail = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));

        inputEmail.sendKeys("mojEmail@gmail.com");

        WebElement inputCAddress = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));

        inputCAddress.sendKeys("Terazije");

        WebElement inputPAddress = wd.findElement
                (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));

        inputPAddress.sendKeys("beogradska");

        WebElement submitBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        submitBtn.click();

        Thread.sleep(1000);

        wd.close();

        assert submitBtn.isDisplayed();

    }
}
