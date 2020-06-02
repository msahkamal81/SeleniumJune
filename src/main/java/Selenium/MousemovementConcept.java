package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MousemovementConcept {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.alibaba.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Services"))).build().perform();
        //actions.moveToElement(driver.findElement(By.linkText("Categories"))).build().perform();//span xpath 
        //actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Categories)]"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Trade Assurance")).click();




    }
}
