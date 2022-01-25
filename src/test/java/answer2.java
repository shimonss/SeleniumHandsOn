import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class answer2 {

    @BeforeClass
    public void BeforAll() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/paul-hammant/ngWebDriver");

    }

        @Test
    public void test01() {
            WebDriver driver = null;
            driver.navigate().to("https://dgotlieb.github.io/AngularJS/main.html");
            new NgWebDriver((JavascriptExecutor) driver).waitForAngularRequestsToFinish();
            webElement firstname = (webElement) driver.findElement(ByAngular.model("firstname"));
            firstname.clear();
            firstname.sendKeys("Shimon");
            assertEquals(driver.findElement(By.xpath("input")));





    }

    private void assertEquals(WebElement input) {

    }


}

