package com.google.automation.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class OpenBrowserStepDefinitions {



    String user = "Esteban";
    String lastName = "Cosssio";

    public WebDriver driver;


    @Given("^that a web user wants to register in advantage shopping online on chrome$")
    public void that_a_web_user_wants_to_register_in_advantage_shopping_online_on_chrome() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testfaceclub.com/aut-vuelos/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^perform an automation on chrome$")
    public void perform_an_automation_on_chrome() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("from")).click();
        driver.findElement(By.xpath("//*[@id=\"from\"]/option[5]")).click();
        driver.findElement(By.id("to")).click();
        driver.findElement(By.xpath("//*[@id=\"to\"]/option[4]")).click();

        driver.findElement(By.id("classId"));
        driver.findElement(By.xpath("//*[@label='Turista Superior' ]")).click();
        driver.findElement(By.xpath("//*[@ng-model='dateFrom' ]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();
        driver.findElement(By.xpath("//*[@ng-model='dateto' ]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"passenger\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@ng-click='search()' ]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("cards"));
        driver.findElement(By.xpath("//*[@id=\"cards\"]/option[2]")).click();
        driver.findElement(By.id("cardNumber")).sendKeys("1231-2313-2333-3333");
        driver.findElement(By.id("code")).sendKeys("348");
        driver.findElement(By.id("cards")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@ng-model='name']")).sendKeys(user);
        driver.findElement(By.xpath("//*[@ng-model='lastName']")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@ng-click='book()']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@ng-click='gotoHome()']")).click();

    }

    @Then("^close browser on chrome$")
    public void close_browser_on_chrome() {


    }

    @Given("^that a web user wants to register in advantage shopping online on firefox$")
    public void that_a_web_user_wants_to_register_in_advantage_shopping_online_on_firefox() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.get("https://www.testfaceclub.com/aut-vuelos/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^perform an automation on firefox$")
    public void perform_an_automation_on_firefox() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("from")).click();
        driver.findElement(By.xpath("//*[@id=\"from\"]/option[5]")).click();
        driver.findElement(By.id("to")).click();
        driver.findElement(By.xpath("//*[@id=\"to\"]/option[4]")).click();

        driver.findElement(By.id("classId"));
        driver.findElement(By.xpath("//*[@label='Turista Superior' ]")).click();
        driver.findElement(By.xpath("//*[@ng-model='dateFrom' ]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();
        driver.findElement(By.xpath("//*[@ng-model='dateto' ]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"passenger\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@ng-click='search()' ]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("cards"));
        driver.findElement(By.xpath("//*[@id=\"cards\"]/option[2]")).click();
        driver.findElement(By.id("cardNumber")).sendKeys("1231-2313-2333-3333");
        driver.findElement(By.id("code")).sendKeys("348");
        driver.findElement(By.id("cards")).click();
        driver.findElement(By.xpath("//*[@id=\"year\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@ng-model='name']")).sendKeys(user);
        driver.findElement(By.xpath("//*[@ng-model='lastName']")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@ng-click='book()']")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@ng-click='gotoHome()']")).click();

    }

    @Then("^close browser on firefox$")
    public void close_browser_on_firefox() {
        // Write code here that turns the phrase above into concrete actions

    }
}
