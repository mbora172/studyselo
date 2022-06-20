package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class c02locator {
    public static void main(String[] args) throws InterruptedException {
        //8 locators
        //id tag-name classname name
        //css xpath link plink

        //favori cssSelector input[type*='pass']  xpath //button[contains(@class,'submit')
        // //*[text()='Log Out'] //input[.='Log Out']

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("bor");
        driver.findElement(By.name("inputPassword")).sendKeys("3242");
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.cssSelector("p.error")).getText();
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("me");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("daf@daf.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("a.@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("345354353");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("bora");
       // ***************
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();



      //loc333

        // Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());






    }
}

