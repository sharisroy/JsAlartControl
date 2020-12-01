package com.ucqat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlartControl {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Switchto");
        alartButton(driver);
        conframButton(driver);
        promtButton(driver);
        Thread.sleep(5000);
        driver.quit();

        System.out.println("Every statement tested !");


    }
    public static void alartButton(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("alert")).click();
        String text = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println(text);
        Thread.sleep(5000);
    }
    public static void conframButton(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='confirm']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);
    }
    public static void promtButton(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Check Test");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
