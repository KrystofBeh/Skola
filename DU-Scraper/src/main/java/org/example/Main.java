package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://praha.educanet.cz/teachers/pedagogicky-sbor/");

        for(WebElement e : driver.findElements(By.className("post-box-bellow"))) {

            WebElement nameDiv = e.findElement(By.cssSelector(".post-box-title-inner"));
            String name = nameDiv.findElement(By.tagName("a")).getText();
            System.out.println(name);

            if(!e.findElements(By.cssSelector(".contact-mail")).isEmpty()){
                WebElement emailDiv = e.findElement(By.cssSelector(".contact-mail"));
                String email = emailDiv.findElement(By.tagName("a")).getText();
                System.out.println(email);
            }else{
                System.out.println("No email");
            }

            System.out.println();
        }

        driver.quit();
    }
}