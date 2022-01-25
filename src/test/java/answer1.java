import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class answer1 {

    private static WebDriver driver;

    @BeforeClass
    public void beforAll() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test01() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("message")).isDisplayed();
    }

    @Test
    public void test02() throws InterruptedException {
        driver.findElement(By.id("hidden")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("render")).isDisplayed();
    }

        @Test
                public void test03() {
            driver.findElement(By.id("rendered")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
            System.out.println("This is a new element");
        }

            @AfterClass
            public static void tearDown() { driver.quit(); }

            }












