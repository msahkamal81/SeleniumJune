package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcepts {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome

        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.alibaba.com/");//enter url

        //1. get the total link count on the page
        //2. get the text link on the page
        //3.all the link are represent by <a> html tag

        List <WebElement> linklist = driver.findElements(By.tagName("a"));
        //size of linklist
        System.out.println(linklist.size());

        for (int i = 0; i<linklist.size(); i++){

            String LinkText = linklist.get(i).getText();
            System.out.println(LinkText);
        }


    }
}
