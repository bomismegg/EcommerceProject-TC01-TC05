package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class TestCase01 {
    public void TestCase01() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement titleElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("h2:nth-child(1)"))));
            assertEquals("THIS IS DEMO SITE FOR   ", titleElem.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}