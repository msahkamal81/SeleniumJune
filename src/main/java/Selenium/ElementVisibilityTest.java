package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementVisibilityTest {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/chromedriver 2");
//        WebDriver driver = new ChromeDriver();//lunch chrome

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome


        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://passport.alibaba.com/member/us/reg/fast/union_reg.htm?_regfrom=ICBU_UNION_REG&_lang=en&_regbizsource=main_page");//enter url


        //1 isDisplayed() method : applicable for the all elements
        boolean b1 = driver.findElement(By.name("loginAction")).isDisplayed();//for register button
        System.out.println(b1);//true

        //2 isEnable
        boolean b2 = driver.findElement(By.name("loginAction")).isEnabled();
        System.out.println(b2);//true


        //3 isSelected checkbox dropdown radiobutton
        //not select
        boolean b3 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println(b3);//false

        //select
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        boolean b4 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println(b4);//true





    }
}
