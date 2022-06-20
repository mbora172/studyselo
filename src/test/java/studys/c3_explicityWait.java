package studys;

//import code.utilities.DriverUtil;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

public class c3_explicityWait {
      /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception
         */

/*
        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */
//    WebDriverWait driverWait;
//    @Test
//    public void TC_1impl(){
//        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        DriverUtil.getDriver().get("https://www.google.com");
//     DriverUtil.getDriver().findElement(By.id("gbqfbb")).click();
//    }
//    @Test
//
//    public void TC2_exp() throws InterruptedException {
//
//
//      WebDriverWait driverWait=new WebDriverWait(DriverUtil.getDriver(),Duration.ofSeconds(2));
//        DriverUtil.getDriver().get("https://www.google.com");
//        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfbb")));
//        DriverUtil.getDriver().findElement(By.id("gbqfbb")).click();
//    }
}
