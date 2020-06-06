package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleWindowPopUp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome
        driver.get("http://www.popuptest.com/goodpopups.html");
        //1 alert --- javascript popup alert Api (accept, dismiss)
        //2 File upload pop up---Browser Button (Type = file sendkeys (path)
        //3 Browser window popUp  --Advertisment popUp (WindowHandler Api get WindowHandles())

        driver.findElement(By.linkText("Good PopUp #3")).click();
        Thread.sleep(2000);
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        String parentWindowId = it.next();
        System.out.println("parent window id:"+parentWindowId);
        String childWindowId = it.next();
        System.out.println("child window Id:"+childWindowId);
        driver.switchTo().window(childWindowId);
        Thread.sleep(2000);
        System.out.println("child window pop up title"+driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindowId);
        Thread.sleep(2000);
        System.out.println("parent window title"+driver.getTitle());





        }


    }






