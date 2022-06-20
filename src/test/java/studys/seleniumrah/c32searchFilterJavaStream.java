package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class c32searchFilterJavaStream {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebElement element=driver.findElement(By.id("search-field"));
        String search="Ric";
        element.sendKeys(search);
        List<WebElement> elementlist=driver.findElements(By.xpath("//table[@class='table table-bordered']//td[1]"));
        List<WebElement> filtel = elementlist.stream().filter(s -> s.getText().contains(search)).collect(Collectors.toList());
        Assert.assertEquals(elementlist.size(),filtel.size());

    }
}
