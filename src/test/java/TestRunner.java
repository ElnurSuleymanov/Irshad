import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestRunner extends AbstractTestNGCucumberTests  {
    @BeforeClass
    public void beforeClass(){System.out.println("TEST BASLADI");}

    @AfterClass
    public void afterClass(){System.out.println("TEST BITDI");}
}
