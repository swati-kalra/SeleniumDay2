package Day3;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GeneratingExtentReports {
    WebDriver driver;
    ExtentReports extentReports;
    ExtentTest extentTest;
    String reportPath = "/Users/swati.kalra/Documents/Projects/SeleniumDay2/ExtentReports/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();

        extentReports = new ExtentReports(reportPath+this.getClass().getSimpleName()+".html");

    }

    @Test
    public void execute(){
        extentTest = extentReports.startTest("This is generating extent reports");
        extentTest.log(LogStatus.INFO, "Opening google.com");
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        extentTest.log(LogStatus.INFO, "The url opened is "+driver.getCurrentUrl());
        extentReports.endTest(extentTest);
    }

    @Test
    public void execute1(){
        extentTest = extentReports.startTest("This is generating extent reports 2");
       Assert.fail();
        extentReports.endTest(extentTest);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

        extentReports.flush();
        extentReports.close();

    }


}
