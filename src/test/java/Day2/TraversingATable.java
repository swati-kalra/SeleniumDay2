package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TraversingATable {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
        driver.get("file:///Users/swati.kalra/Desktop/table.html");
    }

    @Test
    public void test(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        List<WebElement> headers = driver.findElements(By.xpath("//table/tbody/tr/th"));
        for(WebElement headings: headers){
            System.out.print(headings.getText() + "\t");
        }

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        int rowNum = rows.size();
        int colNum = headers.size();

        System.out.println("");
        for(int i = 1; i < rowNum; i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for(int j = 0; j < colNum; j++){
                System.out.print(cols.get(j).getText() + "\t");
            }
            System.out.println("");
        }

    }
}
