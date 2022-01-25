import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class answer4 {


    private WebDriver driver;
    private int result;

    @BeforeClass
    public void beforeAll() {
        DriverSingleton.getDriverInstance().get("driver.get(\"https://dgotlieb.github.io/WebCalculator/");
    }

    @Test
    public void Test01(byte[] ExpectedResult) throws InterruptedException {
        this.driver = driver;
        System.out.println(driver.findElement(By.id(Constants.SEVEN)).getSize());
        System.out.println(driver.findElement(By.id("six")).isDisplayed());
        WebCalculatorPage.pressThree();
        WebCalculatorPage.pressPlus();
        WebCalculatorPage.pressFour();
        WebCalculatorPage.pressEqals();
        Thread.sleep(4000);
        String expectedResult = "SEVEN";
        Object page;
        Assert.assertEquals(WebCalculatorPage.readScreenValue(), String.valueOf(result));
    }

    @AfterClass
    public void quit(){


    }

    private static class WebCalculatorPage {
        public static void pressThree() {

        }

        public static void pressPlus() {

        }

        public static void pressFour() {

        }

        public static void pressEqals() {

        }

        public static Object sendTheResult(String seven) {


            Object result = new Object();
            return result;
        }

        public static void getResult() {
        }

        public static int readScreenValue() {
            return 0;
        }
    }
}









