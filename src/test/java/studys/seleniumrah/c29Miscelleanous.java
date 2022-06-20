package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class c29Miscelleanous {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.manage().deleteCookieNamed("sessionKey");
        driver.get("http://google.com");

       File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(src,new File("/Users/bor/Desktop/screenshot.png"));
        System.out.println(getDesktopFolder().getAbsolutePath());
    }
    public static File getDesktopFolder() {
        return new File(System.getProperty("user.home"), "Desktop");
    }
}
