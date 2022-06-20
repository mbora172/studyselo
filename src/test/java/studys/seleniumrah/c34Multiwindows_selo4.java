package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class c34Multiwindows_selo4  {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //selo4 window handle new tab
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        List<String> windows=handles.stream().collect(Collectors.toList());
        driver.switchTo().window(windows.get(1));
        driver.get("https://rahulshettyacademy.com/");
        Thread.sleep(3000);
        String a=driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText();
        driver.switchTo().window(windows.get(0));
        WebElement name=driver.findElement(By.name("name"));
        name.sendKeys(a);

        //driver screenshoot
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));

        //get height width
        System.out.println(name.getRect().getDimension().getHeight());
name.getRect().getDimension().getWidth();    }

}
