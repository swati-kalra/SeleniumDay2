package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeGridTest {

    @Test
    public static void test() throws MalformedURLException {

        System.setProperty("webdriver.gecko.driver", "/Users/swati.kalra/Documents/Selenium-Appium/geckodriver");
        DesiredCapabilities cap= DesiredCapabilities.firefox();
//        ChromeOptions options = new ChromeOptions();
//        cap.setCapability(ChromeOptions.CAPABILITY,options);
        WebDriver driver = new RemoteWebDriver(new URL("http://10.129.26.67:4444/wd/hub"), cap);

        driver.get("https://www.google.com/");

        System.out.println("Title is "+driver.getTitle());

        driver.close();


    }
}
