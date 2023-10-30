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
public class TestCase04 {
    public void Testcase04(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement mb = driver.findElement(By.cssSelector("a.level0"));
            mb.click();
            WebElement atc = driver.findElement(By.xpath(
            "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
            atc.click();
            WebElement atc1 = driver.findElement(By.xpath(
            "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"));
            atc1.click();
            Thread.sleep(2000);
            WebElement cp = driver.findElement(By.cssSelector(
            "button[title='Compare'] span span"));
            cp.click();
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
            WebElement titleElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("body > div > div.page-title.title-buttons > h1"))));
            assertEquals("COMPARE PRODUCTS", titleElem.getText());
            WebElement firstProduct = driver.findElement(By.cssSelector("h2[class='product-name'] a[title='Sony Xperia']"));
            WebElement secondProduct = driver.findElement(By.cssSelector("h2[class='product-name'] a[title='IPhone']"));
            String firstProductName = firstProduct.getText();
            String secondProductName = secondProduct.getText();

            assertEquals("SONY XPERIA",firstProductName);
            assertEquals("IPHONE",secondProductName);

            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
