package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class c24Calendar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://www.path2usa.com/travel-companions");
        driver.findElement(By.name("travel_date")).click();
        driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).click();

        List<WebElement> months= driver.findElements(By.cssSelector("span.month"));
        System.out.println(months.size());
        for (WebElement element :months) {
            System.out.println(element.getText());
            if (element.getText().contains("Jul")){
                element.click();
                break;
            }
        }


        List<WebElement> dates=driver.findElements(By.cssSelector(".day"));
        for (WebElement each:dates){
            if (each.getText().equalsIgnoreCase("23")){
                each.click();
                break;
            }
        }



    }}
