package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploodPupUp {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://html.com/input-type-file/");

        driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("/Users/mohammadsahkamal/Documents/Screen Shot 2020-05-24 at 6.14.46 AM.png");


    }


}