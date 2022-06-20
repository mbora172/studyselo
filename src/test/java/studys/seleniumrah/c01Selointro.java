package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class c01Selointro {
    public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



//Firefox
        WebDriverManager.safaridriver().setup();
        WebDriver drivera = new SafariDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

        WebDriverManager.edgedriver().setup();
        WebDriver driver2 = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.close();

//driver.quit();



    }



}



