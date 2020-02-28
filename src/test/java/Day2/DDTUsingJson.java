package Day2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DDTUsingJson {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/swati.kalra/Documents/Selenium-Appium/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void readFromJSON() throws IOException, ParseException {
        FileReader reader = new FileReader("/Users/swati.kalra/Desktop/data.json");
        JSONParser json = new JSONParser();

        Object object = json.parse(reader);
        System.out.println("Object is "+object);

        JSONArray array = (JSONArray)object;
        System.out.println("JSON array is "+array);

        for(int i = 0; i< array.size(); i++){
            JSONObject jsonObject = (JSONObject)array.get(i);

            System.out.println("Username is "+jsonObject.get("username"));
            System.out.println("Password is "+jsonObject.get("password"));

            driver.get("https://www.facebook.com");
            driver.findElement(By.name("email")).sendKeys(jsonObject.get("username").toString());
            driver.findElement(By.name("pass")).sendKeys(jsonObject.get("password").toString());
            //click on sign in
            //assert that error is displayed
        }
    }
}
