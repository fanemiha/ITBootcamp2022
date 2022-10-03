/*package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.tests;

import com.itbootcamp.bgqa.nedelja6.PropertiesReader;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.HomePage;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogout {

    private WebDriver webDriver;
    private Login login;
    private HomePage homePage;


    @BeforeMethod
    public void configure() {
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = new Login(webDriver);
        homePage = new HomePage(webDriver);
        webDriver.get("https://www.automationexercise.com");
        webDriver.manage().window().maximize();
    }

    @Test
    public void testLogout() {

        Assert.assertEquals(webDriver.getTitle(), "Automation Exercise", "Home page is not opened ");
        homePage.clickOnSignupLogin();
        Assert.assertEquals(login.getModalTitle1(), "Login to your account", "Login to your account should be displayed");
        login.inputSignInEmailField("petar.petrovic@email.com");
        login.inputSignInPasswordField("87654321");
        login.clickLogin();
        Assert.assertEquals(homePage.getModalTitle2(), "Logged in as Petar Petrovic", "Logged in as Petar Petrovic should be displayed");
        homePage.clickLogout();
        Assert.assertEquals(webDriver.getTitle(), "Automation Exercise - Signup / Login", "Automation Exercise - Signup / Login page is not opened ");
    }
}*/
