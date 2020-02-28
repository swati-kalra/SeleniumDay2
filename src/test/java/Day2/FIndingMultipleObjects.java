package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FIndingMultipleObjects {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/practice-form.html");
    }

    @Test
    public void test(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(100));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));

        List<WebElement> ele1 = driver.findElements(By.id("swati"));
        System.out.println(ele1.size());
       // System.out.println(ele1.get(0).getText());

//        List<WebElement> allInputs = driver.findElements(By.tagName("input"));
//
//        for(WebElement ele: allInputs){
//            System.out.println(ele.getAttribute("type"));
//        }

        //or
//        for(int i = 0; i<allInputs.size(); i++){
//            System.out.println(allInputs.get(i).getAttribute("type"));
//        }


    }


}
