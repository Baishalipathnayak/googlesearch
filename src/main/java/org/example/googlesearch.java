package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googlesearch {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        // Suppress notifications
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@aria-label='Search']")));
        SearchField.sendKeys("apple");
        SearchField.sendKeys(Keys.ENTER);
        WebElement spanElement = driver.findElement(By.xpath("//span[text()='Apple | Official Site']"));

        // Perform actions with the element
        spanElement.click();
    }
}
