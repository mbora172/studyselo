package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class c17WindowHandle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        //*******
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowlist = new ArrayList<>();
        for (String each : windowHandles) {
            windowlist.add(each);
        }
        driver.switchTo().window(windowlist.get(1));
        //******

        String at = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(windowlist.get(0));
        driver.findElement(By.id("username")).sendKeys(at);


    }
}
