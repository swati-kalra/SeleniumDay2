package Day3;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneratingAllureReports {

    @Severity(SeverityLevel.NORMAL
    )
    @Description("this is to verify 2 is 2")
    @Test
    public void test1(){
        Assert.assertEquals(2, 2);
    }

    @Step("any log goes here")
    public void test2(){
        Assert.assertEquals(4, 2);
    }

    @Test
    public void test3(){
        Assert.assertEquals("abc", "abc");
    }

    @Test
    public void test4(){
        Assert.assertEquals("abc", "bcd");
    }

}
