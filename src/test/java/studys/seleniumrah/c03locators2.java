package studys.seleniumrah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class c03locators2 {
    public static void main(String[] args) throws InterruptedException {

        String user="Bora";
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        String password=getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(user);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+user+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
        //You are successfully logged in.

    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(1000);
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray=passwordText.split("'");
       // String[] pss=passwordArray[1].split("'");
       // String password=pss[0];
      String password=passwordArray[1].split("'")[0];
      return password;
    }



}
