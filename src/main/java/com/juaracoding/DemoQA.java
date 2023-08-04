package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {
    public static void main(String[] args) {
        String path = "D:\\MyTools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;// untuk menambahkan scroll
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        //driver.manage().window().fullscreen();
        System.out.println("Open Browser dan Open Google");

        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");//locator
        driver.findElement(By.id("userEmail")).sendKeys("info@Juaracoding.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("window.scrollBy(0, 500)");//scroll vertical 500px
        driver.findElement(By.id("submit")).click();

        System.out.println("Klik Button Search");
        delay();
        driver.quit();
        System.out.println("Quit Browser");
    }
    public static void delay() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
