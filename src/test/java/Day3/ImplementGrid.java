package Day3;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ImplementGrid {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        String hubURL = "http://172.29.228.57:4444/wd/hub";
        WebDriver driver;
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL(hubURL), cap);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();

    }


}
