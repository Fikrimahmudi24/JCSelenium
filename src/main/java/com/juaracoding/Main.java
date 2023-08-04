package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Open Browser dan Open Google");
        driver.findElement(By.name("q")).sendKeys("JuaraCoding");
        System.out.println("sendKeys");
        driver.findElement(By.name("btnK")).click();
//      driver.findElement(By.name("q")).sendKeys("JuaraCoding"+Keys.ENTER); //jika ingin menambahkan button sebagai executor
        System.out.println("Klik Button Search");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}