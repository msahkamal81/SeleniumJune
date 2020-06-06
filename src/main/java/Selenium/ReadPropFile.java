package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    static WebDriver driver;
    public static void main(String[] args) throws IOException {


        Properties  prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/java/Selenium/config.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        System.out.println(prop.getProperty("Url"));
        System.out.println(prop.getProperty("Browser"));

        //another way

        String url = prop.getProperty("Url");
        System.out.println(url);
        String browsername = prop.getProperty("Browser");
        System.out.println(browsername);

        if (browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/chromedriver 2");
            driver = new ChromeDriver();
        }else if (browsername.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        }else if (browsername.equals("IE")){
            System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/InternetExploredriver");
            driver = new InternetExplorerDriver();
        }

        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("Email_Xpath"))).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath(prop.getProperty("Password_Xpath"))).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.xpath(prop.getProperty("ConfirmPassword_Xpath"))).sendKeys(prop.getProperty("ConfirmPassword"));


    }
}
