package driverSession;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CucucmberHook {
    public static WebDriver driver;


    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
        driver.get("https://irshad.az/");
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
