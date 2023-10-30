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
public class TestCase02 {

    public void TestCase02() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            Thread.sleep(2000);
            WebElement out = driver.findElement(
            By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[1]/span/span"));
            WebElement in = driver.findElement(By.xpath("#product-price-1 > span"));
            assertEquals(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
