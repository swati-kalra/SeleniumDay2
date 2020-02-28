package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UsingTestNGDataProviders {
    WebDriver driver;

    @DataProvider(name = "data")
    public Object[][] thisProvidesData(){
        return new Object[][]{{"abc","def"}, {"ghi", "jkl"}};
    }

    @Test(dataProvider = "data")
    public void getTestData(String email, String password){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("pass")).sendKeys(password);
    }

}
