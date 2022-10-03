package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DomaciForm {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fane9\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/automation-practice-form");

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement firstName = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        firstName.sendKeys("Stefan");
        //Thread.sleep(1000);


        WebElement lastName = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[4]/input[1]"));
        lastName.sendKeys("Mihailovic");
        //Thread.sleep(1000);

        WebElement email = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        email.sendKeys("mojmejl@gmail.com");
        //Thread.sleep(1000);

        WebElement femaleBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]"));
        femaleBtn.click();
        //Thread.sleep(1000);

        WebElement otherBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]"));
        otherBtn.click();
        //Thread.sleep(1000);

        WebElement maleBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        maleBtn.click();
        //Thread.sleep(1000);

        WebElement mobileNumber = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/input[1]"));
        mobileNumber.sendKeys("0123456789");
        //Thread.sleep(1000);

        WebElement date = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]"));
        date.click();
        //Thread.sleep(1000);

        WebElement dateYear = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        dateYear.click();
        Thread.sleep(1000);
        Select select = new Select(dateYear);
        select.selectByVisibleText("1991");
        dateYear.click();
        //Thread.sleep(1000);

        WebElement dateMonth = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
        dateMonth.click();
        Thread.sleep(1000);
        Select select1 = new Select(dateMonth);
        select1.selectByVisibleText("May");
        dateMonth.click();
        //Thread.sleep(1000);

        WebElement dateDay = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[3]"));
        dateDay.click();
        //Thread.sleep(1000);

        /*WebElement subjects = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]"));
          subjects.sendKeys("e");
          subjects.sendKeys(Keys.ENTER);*/



        WebElement sports = wd.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isSelected1 = sports.isSelected();
        if(isSelected1 == false) {
            sports.click();
        }
        WebElement reading = wd.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) form:nth-child(2) div.mt-2.row:nth-child(7) div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(2) > label.custom-control-label"));
        boolean isSelected2 = reading.isSelected();
        if(isSelected2 == false) {
            reading.click();
        }
        WebElement music = wd.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) form:nth-child(2) div.mt-2.row:nth-child(7) div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(3) > label.custom-control-label"));
        boolean isSelected3 = music.isSelected();
        if(isSelected3 == false) {
            music.click();
        }
        //Na mom je racunaru slika pa zato komentar
        WebElement chooseFileBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[8]/div[2]/div[1]/input[1]"));
        chooseFileBtn.sendKeys("C:\\Users\\fane9\\OneDrive\\Desktop\\selenium-logo-DB9103D7CF-seeklogo.com.png");

        WebElement cAddress = wd.findElement(By.cssSelector("#currentAddress"));
        cAddress.sendKeys("Beogradska");
        cAddress.sendKeys(Keys.ENTER);

        WebElement state = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]"));
        Select selectState = new Select(state);
        selectState.selectByIndex(0);


        WebElement submitBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[11]/div[1]/button[1]"));
        submitBtn.click();

    }
}
