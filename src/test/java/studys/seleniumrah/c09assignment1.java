package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c09assignment1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());

        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());

    }
}
