package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HtmlDriverConcept {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        //WebDriver driver = new FirefoxDriver();//lunch chrome
        WebDriver driver = new HtmlUnitDriver();
        //advantage
        //no browser lunching
        //very fast execution
        //we have to download jar
        //not suitable for Action class mousemovent, drag and drop, double clicl
        //its called head less brower
        //gost driver

        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://classic.crmpro.com/login.cfm");//enter url

        System.out.println("Before login title is:=="+driver.getTitle());
        driver.findElement(By.name("username")).sendKeys("nk");
        driver.findElement(By.name("password")).sendKeys("yk");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);;

        System.out.println("after login title is:=="+driver.getTitle());

    }
}
