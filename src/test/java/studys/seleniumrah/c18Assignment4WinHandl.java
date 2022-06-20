package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class c18Assignment4WinHandl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();


        Set<String> window = driver.getWindowHandles();
        List<String> wList=new ArrayList<>();
        for (String each:window){
            wList.add(each);
        }
        driver.switchTo().window(wList.get(1));
       String windowText= driver.findElement(By.cssSelector(".example h3")).getText().split(" ")[1].trim();
        System.out.println(windowText);
        driver.switchTo().window(wList.get(0));
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

    }
}
