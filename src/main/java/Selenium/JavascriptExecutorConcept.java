package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.io.FileUtils.copyFile;

public class JavascriptExecutorConcept {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/IdeaProjects/Sesenium20/src/main/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();//lunch chrome

        driver.manage().window().maximize();//maximaize window
        driver.manage().deleteAllCookies();//delete all the cookies
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://passport.alibaba.com/icbu_login.htm?return_url=https%3A%2F%2Fi.alibaba.com%2Findex.htm%3Fspm%3Da2700.8293689.scGlobalHomeHeader.316.2ce267afDHsPT7%26tracelog%3Dhd_ma");//enter url
        driver.findElement(By.xpath("//*[@id='fm-login-id']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@id='fm-login-password']")).sendKeys("kamal");
        //Thread.sleep(3000);

        //driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
        WebElement SignInBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
        flash(SignInBtn, driver);//highlight the element
        drawBorder(SignInBtn, driver);//draw border
        //take screen shot

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // copy the screen shot to desired location using copy file / method
        FileUtils.copyFile(src, new File("/Users/mohammadsahkamal/IdeaProjects/Sesenium20/element.png"));
        //generate alert
        //generateAlert(driver, "there is an issue with login button");
        //click on any element by javaScript executor
        clickElementByJS(SignInBtn, driver);
        //refresh the page by using selenium
        driver.navigate().refresh();
        //by using JS executor
        refreshBrowserByJS(driver);
        //get the title of the page by JS
        System.out.println(getTitleByJS(driver));
        //get page text
        System.out.println(getPageInnerText(driver));
        //scroll page down
        //scrollPageDown(driver);
        //
        WebElement DingTalk = driver.findElement(By.xpath("//a[contains(text(),'DingTalk')]"));
        scrollIntoView(DingTalk, driver);










    }

    public static void flash(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++){
            changeColor("rgb(0,200,0)", element,driver);
            changeColor(bgcolor, element,driver);
        }
    }

    public static void changeColor(String color, WebElement element,WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
            try {
                Thread.sleep(20);
            }catch (InterruptedException e){

            }

    }
    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid blue'", element);

    }
    public static void generateAlert(WebDriver driver, String message){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("alert('"+message+"')");
    }
    public static void clickElementByJS(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }
    public static void refreshBrowserByJS( WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go()");
    }

    public static String getTitleByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title;").toString();
        return title;

    }
    public static String getPageInnerText(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String pageText = js.executeScript("return document.documentElement.innerText;").toString();
        return pageText;
    }
    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public static void scrollIntoView(WebElement element, WebDriver driver ){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }



}
