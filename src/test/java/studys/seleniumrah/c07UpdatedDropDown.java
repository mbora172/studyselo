package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class c07UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
       /* int i=1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for (int i=1;i<5;i++){driver.findElement(By.id("hrefIncAdt")).click();}

        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//        driver.findElement(By.id("ctl00$mainContent$view_date1")).click();
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
          driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

       // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
        System.out.println("enabled");
        Assert.assertTrue(true);
    }else {
        Assert.assertTrue(false);
    }

    }

}
