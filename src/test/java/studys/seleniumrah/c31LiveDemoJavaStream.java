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

public class c31LiveDemoJavaStream {
    public static void main(String[] arg){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//        List<WebElement>list1=driver.findElements(By.xpath("//table[@class='table table-bordered']//td[1]"));
//        List<String> text1 = list1.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
        driver.findElement(By.xpath("//span[.='Veg/fruit name']")).click();
        List<WebElement>elementlist=driver.findElements(By.xpath("//table[@class='table table-bordered']//td[1]"));
        List<String> listText = elementlist.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> listTextsorted = elementlist.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
    Assert.assertEquals(listText,listTextsorted);
        List<String> price;
        int a=1;
        do {
            List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table table-bordered']//td[1]"));

            price= rows.stream().filter(s->s.getText().contains("Rice"))
                .map(s->getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(s -> System.out.println(s));

            if (price.size()<1){
                a++;
                driver.findElement(By.linkText(""+a+"")).click();
            }}while (price.size()<1);
    }

    private static String getPriceVeggie(WebElement s) {
      return   s.findElement(By.xpath("following-sibling::td[1]")).getText();

    }
}
