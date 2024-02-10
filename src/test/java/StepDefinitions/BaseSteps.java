package StepDefinitions;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BaseSteps extends BaseMethods {
 int index ;
 @Given("User is in {string} website")
    public void userIsInWebsite (String website ){

    }


    @When("Clicks on {string} button in the {string}")
    public void clicksOnButtonInTheHeader(String expected, String s2) throws InterruptedException {
        WebElement element = getElement(By.xpath("//div[@class='container-fluid']//ul//li//a[@aria-label='" + expected + "']"));
        javascriptExecutor(element);
        Thread.sleep(5000);


    }
    @Then("Should be navigated to {string} page")
    public void shouldBeNavigatedToPage(String expected) {
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
 @And("Hovers mouse over {string} buttons")
    public void hoversMouseOverButtons(String kataloqElement) throws InterruptedException {
     Thread.sleep(3000);
        WebElement element = getElement(By.xpath("//*[@class='menu-section']//span//img[@alt='"+kataloqElement+"']"));
        actionsMoveToElement(element);


 }

    @And("Puts the value from {string} to {string} the price")
    public void putsTheValueFromToThePrice(String from, String to) throws InterruptedException {
        Thread.sleep(3000);
        WebElement priceFilter = driver.findElement(By.xpath("//div[@class='products__filter__item__price']"));
        Thread.sleep(2000);
        WebElement startPriceInput = priceFilter.findElement(By.xpath("//input[@placeholder='36 AZN']"));
        startPriceInput.clear();
        startPriceInput.sendKeys(String.valueOf(from));
        Thread.sleep(2000);
        WebElement endPriceInput = priceFilter.findElement(By.xpath("//input[@placeholder='4450 AZN']"));
        endPriceInput.clear();
        endPriceInput.sendKeys(String.valueOf(to));
        Thread.sleep(3000);


    }

    @Then("Items in the page should be ordered according from {string} to {string}")
    public void itemsInThePageShouldBeOrderedAccordingFromTo(String from, String to)  {
     List<WebElement> items = new ArrayList<>(getElements(By.cssSelector(".product.first")));
     List<WebElement> productPrice = getElements(By.cssSelector(".new-price"));
     double price ;
     double startPrice = Double.parseDouble(from);
     double endPrice  = Double.parseDouble(to);
     for ( WebElement element : productPrice){
         price = Double.parseDouble(element.getText().replace("AZN",""));

         Assert.assertTrue((startPrice < price) && (price < endPrice));
     }
    }

    @And("Choose {string} in the Brend checkbox")
    public void chooseInTheBrendCheckbox(String expectedBrend) throws InterruptedException {
        Thread.sleep(2000);
        WebElement container = getElement(By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[3]/div"));
        Thread.sleep(2000);
        List<WebElement> productList = container.findElements(By.tagName("label"));
        System.out.println(productList.size());
        Thread.sleep(2000);

        for (WebElement inputElement : productList) {
            Thread.sleep(2000);
            System.out.println(inputElement.getText());
            if (inputElement.getText().equalsIgnoreCase(expectedBrend)) {
                Thread.sleep(2000);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", inputElement);
                System.out.println(inputElement.getText() + " clickləndi");
                Thread.sleep(2000);
                break;
            }
        }


    }

    @And("Clicks on the {string} button in the item's description")
    public void clicksOnTheButtonInTheItemSDescription(String ayliq) throws InterruptedException {
     Thread.sleep(3000); // BU SILINMEYECEK !!!!!!
     List<WebElement> itemsDescription = new ArrayList<>(getElements(By.className("product__flex-right")));
//        Random randomGenerator = new Random();
//        index = randomGenerator.nextInt(itemsDescription.size());
        index = generateRandomNum(itemsDescription.size());
        System.out.println(index + " INDEX");
        WebElement expected = itemsDescription.get(index);
        System.out.println(  " EXPECTED ELEMENT BASLADI " +"\n" + expected.getText() +"\n" + "EXPECTED ELEMENT BITDI");
        WebElement itemsTaksitOptions = expected.findElement(By.xpath("//div[2][@class='product__footer']" +
                        "//div[@class='product__price']//div[@class='product__price__list']" +
                        "//div[@class='product__price__list__taksit']"));

        List<WebElement>taksits = new ArrayList<>(itemsTaksitOptions.findElements(By.tagName("label")));
        System.out.println(taksits.size() + " kredit secim (3)");
        for ( WebElement element : taksits) {
            if(element.getText().contains(ayliq)){
                System.out.println(element.getText() + "---------" + ayliq);
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().perform();
                break;
            }
        }
        Thread.sleep(2000);
    }


    @Then("The monthly payment for the item should be displayed according to taksit {string}.")
    public void theMonthlyPaymentForTheItemShouldBeDisplayedAccordingToTaksit(String ayliq) throws InterruptedException {
     Thread.sleep(2000);
     double taksit = Double.parseDouble(ayliq);
     List<WebElement> oldPrice = new ArrayList<>(getElements(By.className("old-price")));
     List<WebElement> newPrice = new ArrayList<>(getElements(By.className("new-price")));
     List<WebElement>taksitPrice = new ArrayList<>(getElements(By.className("product__price__list__taksit-price")));
      boolean flag = oldPrice.get(index).isDisplayed();
      System.out.println(oldPrice.get(index).getText());
        if(flag){
        double totalPrice  = Double.parseDouble(oldPrice.get(index).getText().replace("AZN",""));
        double expected = (totalPrice/taksit);
        String expectedMountlyPayment = String.valueOf(expected);
        System.out.println(expectedMountlyPayment + " GOZLENILEN AYLIQ");
            System.out.println(taksitPrice.get(index).getText() + " ELDE OLAN AYLIQ ");
            Thread.sleep(20000);
        Assert.assertTrue(taksitPrice.get(index).getText().contains(expectedMountlyPayment));

        }

    }
}













