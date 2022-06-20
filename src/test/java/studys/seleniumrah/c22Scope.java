package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class c22Scope {
    public static void main(String[] args) {
        //link amount
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
       //footer link amount
       WebElement footDriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footDriver.findElements(By.tagName("a")).size());
        //first coloumn link amount
       WebElement coloumnDriver=footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
        //click each link check if working

        List<WebElement> webElementList = coloumnDriver.findElements(By.tagName("a"));
        for (WebElement element:webElementList){
            String clickonlinktab= Keys.chord(Keys.COMMAND,Keys.ENTER);
            element.sendKeys(clickonlinktab);
        }

        Set<String> windows = driver.getWindowHandles();
        for (String each:windows){
            driver.switchTo().window(each);
            System.out.println(driver.getTitle());

        }

    }}
