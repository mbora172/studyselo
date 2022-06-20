package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class c23Assignment6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.id("checkBoxOption2")).click();
        String selected=driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println(selected);
        Select select=new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(selected);
        driver.findElement(By.id("name")).sendKeys(selected);
        driver.findElement(By.id("alertbtn")).click();
        Alert alert=driver.switchTo().alert();
        Assert.assertEquals(alert.getText().contains(selected),true,"failed");
        System.out.println("alert contains " + selected);
    }
}
