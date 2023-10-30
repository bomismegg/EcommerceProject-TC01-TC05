package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class TestCase03 {
    public void TestCase03(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement mb = driver.findElement(By.cssSelector("a.level0"));
            mb.click();
            WebElement btnatc = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button"));
            btnatc.click();
            WebElement qtyin = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > input"));
            qtyin.sendKeys("000");
            WebElement btnup = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > button"));
            btnup.click();
            Thread.sleep(2000);
            WebElement empty = driver.findElement(By.cssSelector("#empty_cart_button > span > span"));
            empty.click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
