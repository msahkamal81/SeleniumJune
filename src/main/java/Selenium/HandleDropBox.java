package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        // handling drop box

          Select select = new Select(driver.findElement(By.id("month")));


          select.selectByVisibleText("Jan");




    }

}
