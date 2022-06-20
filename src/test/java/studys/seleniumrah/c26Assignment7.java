package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class c26Assignment7 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("http://qaclickacademy.com/practice.php");
        WebElement driverWebtable=driver.findElement(By.name("courses"));
        System.out.println(driverWebtable.findElements(By.cssSelector("td:nth-child(2)")).size());
        System.out.println(driverWebtable.findElements(By.xpath("//table[@name='courses']//tr[2]//td")).size());
        List<WebElement> secondColumn = driverWebtable.findElements(By.xpath("//table[@name='courses']//tr[3]//td"));
        for (WebElement each:secondColumn){
            System.out.println(each.getText());
        }
    }
}
