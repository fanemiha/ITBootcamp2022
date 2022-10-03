package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class DemoDohvatanjeElementa {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fane9\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/text-box");

        wd.manage().window().maximize();

        WebElement element = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));

        System.out.println(element.getText());
        System.out.println(element.getAttribute("class"));
        System.out.println(element.getAttribute("id"));
        System.out.println(element.getAttribute("xpath"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getTagName());
        System.out.println(element.getLocation());


        WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        inputName.sendKeys("Zarko");
        Thread.sleep(3000);

        //WebElement submitBtn = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        WebElement submitBtn = wd.findElement(By.id("submit"));

        List<WebElement> listaLabela = wd.findElements(By.tagName("label"));
        System.out.println("Labele:");
        for (WebElement webElement : listaLabela) {
            System.out.println(webElement.getText());
        }

        submitBtn.click();
        Thread.sleep(3000);


        wd.close();

    }
}
