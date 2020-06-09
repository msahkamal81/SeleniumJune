package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DynamicWebTableHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome


        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/WebTable.html");




    }
}
