package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome

        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.alibaba.com/");//enter url

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath("//*[@id='fm-login-id']")).sendKeys("Kamal");
        driver.findElement(By.xpath("//*[@id='fm-login-password']")).sendKeys("kamal");
        Thread.sleep(5000);
        driver.switchTo().frame("");
        Thread.sleep(2000);
        //driver.findElement(By.xpath())



    }
}
