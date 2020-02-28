import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/java/Features",
glue={"StepDefinitions"})
public class TestRunner{

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass
    public void setup(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")
    public void execute(CucumberFeatureWrapper cucumberFeatureWrapper){
        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());

    }

    @DataProvider(name = "features")
    public Object[][] thisIsDataProvider(){
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass
    public void tearDown(){
        testNGCucumberRunner.finish();
    }



}
