package StepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class BaseSteps extends BaseMethods {
    @When("Clicks on {string} button in the {string}")
    public void clicksOnButtonInTheHeader(String expected, String s2) throws InterruptedException {
        WebElement element = getElement(By.xpath("//div[@class='container-fluid']//ul//li//a[@aria-label='" + expected + "']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(5000);


    }
    @Then("Should be navigated to {string} page")
    public void shouldBeNavigatedToPage(String expected) throws InterruptedException {
        String actualUrl = driver.getCurrentUrl();
        String expectedMagazalar = "magazalar";
        String expectedHaqqimizda = "haqqimizda";
        String expectedSertlerimiz = "sertlerimiz";
        String expectedCatdirilmaQaydalari = "catdirilma-qaydalari";
        String expectedBonuslardanIstifadeQaydalari = "bonuslardan-istifade-qaydalari";

        switch(expected) {
            case "Kampaniyalar" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Mağazalar" :
                Assert.assertTrue(actualUrl.contains(expectedMagazalar.toLowerCase()));
                break;
            case "Korporativ" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Samsung" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Apple" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Outlet" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Haqqımızda" :
                Assert.assertTrue(actualUrl.contains(expectedHaqqimizda.toLowerCase()));
                break;
            case "Vakansiyalar":
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Şərtlərimiz":
                Assert.assertTrue(actualUrl.contains(expectedSertlerimiz.toLowerCase()));
                break;
            case "Çatdırılma qaydaları" :
                Assert.assertTrue(actualUrl.contains(expectedCatdirilmaQaydalari.toLowerCase()));
                break;
            case "Bonuslardan istifadə qaydaları" :
                Assert.assertTrue(actualUrl.contains(expectedBonuslardanIstifadeQaydalari.toLowerCase()));
                break;



            case "ŞadKart" :
                break;
            case "Sual-Cavab" :
                break;
            case "Hissə-hissə ödəniş" :
                break;
            case "Məxfilik siyasəti" :
                break;
            case "Korporativ satışlar" :
                break;
            case "İstifadə qaydaları" :
                break;
            case "Bloq" :
                break;
            case "Şikayət və təkliflər" :
                break;
            default:
                System.out.println("Duzgun navigate olunmadi !!!! ");
        }


    }
}












