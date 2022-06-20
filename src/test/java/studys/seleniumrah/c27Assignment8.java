package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class c27Assignment8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://qaclickacademy.com/practice.php");
        String expectedText="Turkey";

        driver.findElement(By.cssSelector("[id=\"autocomplete\"]")).sendKeys("Tur");
        Actions actions=new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//div[text()='Turkey'][1]")));
        actions.moveToElement(driver.findElement(By.xpath("//li//div[text()='Turkey'][1]"))).click().build().perform();
        Thread.sleep(2000);

        //like a king!!!!
        int size=driver.findElements(By.xpath("//body[1]/div[8]/div")).size(); //63
        System.out.println(driver.findElement(By.xpath("//body[1]/div[8]/div[" + size + "]")).getText()); //div[63]worked!
        String actualText=driver.findElement(By.xpath("//body[1]/div[8]/div[" + size + "]")).getText();
        Assert.assertTrue(actualText.contains(expectedText),"failed");
        System.out.println("passed");
    }
}
//    WebDriver driver = new ChromeDriver();
//    driver.get("http://qaclickacademy.com/practice.php");
//            driver.findElement(By.id("autocomplete")).sendKeys("ind");
//            Thread.sleep(2000);
//            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//            System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

