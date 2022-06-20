package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class c14assignnmet3explwait {
    public static void main(String[] args) throws InterruptedException {
        String link = "https://rahulshettyacademy.com/loginpagePractise/";
        String username = "rahulshettyacademy";
        String password = "learning";

        cart(link, username, password);
    }

    public static void cart(String link, String username, String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(link);
        driver.findElement(By.cssSelector("#username")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("okayBtn")).click();
        Select select = new Select(driver.findElement(By.cssSelector("select.form-control")));
        select.selectByVisibleText("Consultant");
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-info")));
        List<WebElement> addCart = driver.findElements(By.cssSelector("button.btn.btn-info"));
        for (WebElement each : addCart) {
            each.click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn")));
        driver.findElement(By.cssSelector("a.nav-link.btn")).click();
    }


}
