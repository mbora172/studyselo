package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class c12alertassignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Bora");
        driver.findElement(By.name("email")).sendKeys("bla@bla.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
        driver.findElement(By.id("exampleCheck1")).click();
        Select option=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        option.selectByVisibleText("Male");
       driver.findElement(By.id("inlineRadio1")).click();
       driver.findElement(By.name("bday")).sendKeys("10091990");
       driver.findElement(By.className("btn-success")).click();

       String expectedText="Success! The Form has been submitted successfully!.";
       String actualText=driver.findElement(By.className("alert-success")).getText();
        boolean condition=actualText.contains(expectedText);
        Assert.assertTrue(condition,"failed");
        System.out.println("verification has been passed  " + actualText);


    }
}
