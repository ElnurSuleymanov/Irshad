package StepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class BaseSteps extends BaseMethods {

 @Given("User is in {string} website")
    public void userIsInWebsite (String website ){

    }


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
        switch(expected) {
            case "Kampaniyalar" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Mağazalar" :
                String expectedMagazalar = "magazalar";
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
                String expectedHaqqimizda = "haqqimizda";
                Assert.assertTrue(actualUrl.contains(expectedHaqqimizda.toLowerCase()));
                break;
            case "Vakansiyalar":
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Şərtlərimiz":
                String expectedSertlerimiz = "sertlerimiz";
                Assert.assertTrue(actualUrl.contains(expectedSertlerimiz.toLowerCase()));
                break;
            case "Çatdırılma qaydaları" :
                String expectedCatdirilmaQaydalari = "catdirilma-qaydalari";
                Assert.assertTrue(actualUrl.contains(expectedCatdirilmaQaydalari.toLowerCase()));
                break;
            case "Bonuslardan istifadə qaydaları" :
                String expectedBonuslardanIstifadeQaydalari = "bonuslardan-istifade-qaydalari";
                Assert.assertTrue(actualUrl.contains(expectedBonuslardanIstifadeQaydalari.toLowerCase()));
                break;
            case "ŞadKart" :
                String expectedSadKart = "sadkart";
                Assert.assertTrue(actualUrl.contains(expectedSadKart.toLowerCase()));
                break;
            case "Sual-Cavab" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Hissə-hissə ödəniş" :
                String expectedHisseHisseOdenis = "hisse-hisse-odenis";
                Assert.assertTrue(actualUrl.contains(expectedHisseHisseOdenis.toLowerCase()));
                break;
            case "Məxfilik siyasəti" :
                String expectedMexfilikSiyaseti = "mexfilik-siyaseti";
                Assert.assertTrue(actualUrl.contains(expectedMexfilikSiyaseti.toLowerCase()));
                break;
            case "Korporativ satışlar" :
                String expectedKorporativSatislar = "korporativ-satislar";
                Assert.assertTrue(actualUrl.contains(expectedKorporativSatislar.toLowerCase()));
                break;
            case "İstifadə qaydaları" :
                String expectedIstifadeGaydalari = "istifade-qaydalari";
                Assert.assertTrue(actualUrl.contains(expectedIstifadeGaydalari.toLowerCase()));
                break;
            case "Bloq" :
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Şikayət və təkliflər" :
                String expectedSikayetVeTeklifler ="sikayet-ve-teklifler";
                Assert.assertTrue(actualUrl.contains(expectedSikayetVeTeklifler.toLowerCase()));
                break;
            default:
                System.out.println("Duzgun navigate olunmadi !!!! ");
                break;
        }
    }
}












