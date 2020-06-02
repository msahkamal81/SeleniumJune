package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.nio.ByteBuffered;

import java.util.concurrent.TimeUnit;

public class CustomXpath {
    public static void main(String[] args) {



        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome

        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.alibaba.com/");//enter url
        //driver.findElement(By.xpath("//input[@class='ui-searchbar-keyword']")).sendKeys("Java Book");
        //driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("java");
        driver.findElement(By.xpath("//input[contains(@class,'ui-searchbar-keyword')]")).sendKeys("java");

        //Dynamic id
        //id test-123
        //start with--------
        //id test - 124
        //ends with -------
        //id 123 _test _t
        //driver.findElement(By.xpath("//input[contains(@id,'test-')]")).sendKeys("kamal");
        //driver.findElement(By.xpath("//input[start-with(@id,'test-']")).sendKeys("kamal");
       // driver.findElement(By.xpath("//input[ends-with(@id,'_test_t)]")).sendKeys("kamal");

        //for link: custom xpath
        //all the link are represented  by <a> html tag
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();



    }
}
