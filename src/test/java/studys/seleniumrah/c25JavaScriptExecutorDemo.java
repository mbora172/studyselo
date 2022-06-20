package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class c25JavaScriptExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for (WebElement element:values){
         sum+=Integer.parseInt(element.getText());
        }
        System.out.println(sum);
        String s=driver.findElement(By.cssSelector(".totalAmount")).getText().split(": ")[1];
        int i = Integer.parseInt(s);
        Assert.assertEquals(i,sum,"failed");
        System.out.println("passed "+i+" = "+sum );
    }}
