package com.itbootcamp.bgqa.nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.IOException;


public class DragNDrop {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\fane9\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://demoqa.com/droppable");

        Actions actions = new Actions(wd);

        WebElement draggable = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));

        WebElement droppable = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]"));


        actions.dragAndDrop(draggable, droppable).perform();

        WebElement droppedText = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]"));

        System.out.println(droppedText.getText().contains("Dropped!"));

        //**************************************************************************************************************

        WebElement acceptTab = wd.findElement(By.id("droppableExample-tab-accept"));
        acceptTab.click();

        WebElement acceptable = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        WebElement dropAreaA = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]"));
        WebElement notAcceptable = wd.findElement(By.id("notAcceptable"));

        actions.dragAndDrop(acceptable,dropAreaA).perform();

        System.out.println(dropAreaA.getText().contains("Dropped!"));

        actions.dragAndDrop(notAcceptable,dropAreaA).perform();


        //**************************************************************************************************************


        WebElement preventTab = wd.findElement(By.id("droppableExample-tab-preventPropogation"));
        preventTab.click();

        Thread.sleep(1000);

        WebElement dragBtn = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]"));

        WebElement outerDroppableA = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]"));

        actions.dragAndDrop(dragBtn,outerDroppableA).perform();

        Thread.sleep(1000);

        WebElement notGreedy = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));

        actions.dragAndDrop(dragBtn,notGreedy).perform();

        Thread.sleep(1000);

        WebElement outerDroppableB = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]"));

        actions.dragAndDrop(dragBtn,outerDroppableB).perform();

        Thread.sleep(1000);

        WebElement greedy = wd.findElement(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]"));

        actions.dragAndDrop(dragBtn,greedy).perform();

        Thread.sleep(1000);

        actions.dragAndDrop(dragBtn,outerDroppableB).perform();

        Thread.sleep(1000);

        System.out.println(outerDroppableA.getText().contains("Dropped!"));




























    }
}
