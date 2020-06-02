package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        //1 xpath

        // absolute xpath should not used
        //relative xPath use

//        driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Tom");
//        driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Kamal");
//        driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("1234567");

        //2 ID
        //driver.findElement(By.id("u_0_r")).sendKeys("kamal");


        //3 name:
        //driver.findElement(By.name("firstname")).sendKeys("kamal");
       // driver.findElement(By.name("lastname")).sendKeys("sah");

        //4 linktext

        //driver.findElement(By.linkText("Create a Page")).click();

        //partial linktext
       // driver.findElement(By.partialLinkText("How to pick")).click();

        //css selector
        // if id is there -- #{id}
        //if class is there -- .class
        //driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Kamal");

        //class not useful
        driver.findElement(By.className("_8esh")).click();

        //





        







    }

}
