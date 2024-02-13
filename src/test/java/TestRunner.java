import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

//@CucumberOptions(
////        features = "classpath:features",
////        tags = "@basket"
//)
public class TestRunner extends AbstractTestNGCucumberTests  {
    @BeforeClass
    public void beforeClass(){System.out.println("TEST BASLADI");}

    @AfterClass
    public void afterClass(){System.out.println("TEST BITDI");}
}
