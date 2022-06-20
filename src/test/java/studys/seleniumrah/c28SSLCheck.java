package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class c28SSLCheck {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        Proxy proxy=new Proxy();
        proxy.setHttpProxy("ipadress:4444");
        options.setCapability("proxy",proxy);
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
    }
}
