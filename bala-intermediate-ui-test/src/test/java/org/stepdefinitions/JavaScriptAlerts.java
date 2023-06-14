package org.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptAlerts {

    @Given("user should be able to launch the application")
    public void user_should_be_able_to_launch_the_application() throws InterruptedException {
        String expectedresult = "I am a JS Alert";
        System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Click the "Click for JS Alert" button to trigger an alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
        String actualtext = driver.switchTo().alert().getText();
        System.out.println(actualtext);
        Assert.assertEquals(actualtext, expectedresult);

        //Click the "Click for JS Confirm" button to trigger a confirm dialog
//        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//        driver.switchTo().alert().dismiss();
//        String actualtext = driver.switchTo().alert().getText();
//        System.out.println(actualtext);
//        Assert.assertEquals(actualtext, expectedresult);

        //Create an Junit test: EnterTextInPrompt()

//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//        driver.switchTo().alert().sendKeys("Entering Text in Prompt");
//        String actualtext = driver.switchTo().alert().getText();
//        System.out.println(actualtext);
//        Assert.assertEquals(actualtext, expectedresult);

    }



}
