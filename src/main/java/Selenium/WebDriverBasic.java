package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasic {
    public static void main(String[] args) {

        //1gecko driver
        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        //2safari driver
        //WebDriver driver = new SafariDriver();




        driver.get("http://www.google.com");

        String title = driver.getTitle();//get title
        System.out.println(title);


        //validation point

        if(title.equals("Google")) {
            System.out.println("correct title");

        }
        else {
            System.out.println("incorrect title");

        }


        System.out.println(driver.getCurrentUrl());


        //System.out.println(driver.getPageSource());

        driver.quit();//quit the browser


    }
}
