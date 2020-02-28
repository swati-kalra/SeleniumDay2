package Day2.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepo {
    WebDriver driver;

    public ObjectRepo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    String url = "https://www.facebook.com";

    @FindBy(how = How.NAME, name = "email")
    //@androidfindby()
    private WebElement email;
    //private WebElement email = driver.find

    @FindBy(how = How.NAME, name = "pass")
    private WebElement password;

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
