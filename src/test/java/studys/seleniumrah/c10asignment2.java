package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c10asignment2 {
    public static void main(String[] args) {
        String text = "Bora";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("sfa");
//        driver.findElement(By.cssSelector("#name")).sendKeys(text);
//        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
//
//        Alert alert = driver.switchTo().alert();
//        Assert.assertEquals(alert.getText().contains(text), true, "failed");
//        System.out.println(alert.getText());
//        alert.accept();
//        driver.findElement(By.id("confirmbtn")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();

    }
}
