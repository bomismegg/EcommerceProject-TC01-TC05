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
public class TestCase05 {
    public void TestCase05(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement acclink = driver.findElement(By.cssSelector("div[class='footer'] a[title='My Account']"));
            acclink.click();
            Thread.sleep(2000);
            WebElement caa = driver.findElement(By.cssSelector("a[title='Create an Account']"));
            caa.click();
            Thread.sleep(2000);
            WebElement fn = driver.findElement(By.cssSelector("#firstname"));
            fn.sendKeys("Nam");
            Thread.sleep(1000);
            WebElement mn = driver.findElement(By.cssSelector("#middlename"));
            mn.sendKeys("Duc");
            Thread.sleep(1000);
            WebElement ln = driver.findElement(By.cssSelector("#lastname"));
            ln.sendKeys("Nguyen");
            Thread.sleep(1000);
            WebElement ed = driver.findElement(By.cssSelector("#email_address"));
            ed.sendKeys("namnam1245134hihi@gmail.com");
            Thread.sleep(1000);
            WebElement pw = driver.findElement(By.cssSelector("#password"));
            pw.sendKeys("123456");
            Thread.sleep(1000);
            WebElement cpw = driver.findElement(By.cssSelector("#confirmation"));
            cpw.sendKeys("123456");
            Thread.sleep(1000);
            WebElement re = driver.findElement(By.cssSelector("button[title='Register'] span span"));
            re.click();
            Thread.sleep(2000);

            WebElement tv = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > " +
            "header:nth-child(2) > div:nth-child(1) > div:nth-child(4) > nav:nth-child(1) > " +
            "ol:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
            tv.click();
            Thread.sleep(2000);
            WebElement wl = driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]"));
            wl.click();
            Thread.sleep(2000);
            WebElement swl = driver.findElement(By.cssSelector("button[title='Share Wishlist']"));
            swl.click();
            Thread.sleep(2000);

            WebElement emsh = driver.findElement(By.xpath("//textarea[@id='email_address']"));
            emsh.sendKeys("namndpse173699@gmail.com");
            Thread.sleep(1000);
            WebElement msg = driver.findElement(By.xpath("//textarea[@id='message']"));
            msg.sendKeys("Hello nam nha");
            Thread.sleep(1000);
            WebElement shwl = driver.findElement(By.cssSelector("button[title='Share Wishlist']"));
            shwl.click();
            Thread.sleep(3000);
        } catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
