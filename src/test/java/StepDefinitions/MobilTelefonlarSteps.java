package StepDefinitions;

import StepDefinitions.BaseMethods;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.KataloqPom;
import pom.MobilTelefonlarPom;

import java.util.List;

public class MobilTelefonlarSteps  extends BaseMethods {

    MobilTelefonlarPom mobilTelefonlarPom;
    public MobilTelefonlarSteps(){
        mobilTelefonlarPom = mobilTelefonlarPom.getInstance();
    }


    @And("Clicks on the Mobil telefonlar button")
    public void clicksOnTheMobilTelefonlarButton() throws InterruptedException {
        WebElement element = getElement(mobilTelefonlarPom.getMobilTelefonlarButton());
        javascriptExecutor(element);
        Thread.sleep(3000);

    }
    @And("Choose {string} in the Brend checkbox")
    public void chooseInTheBrendCheckbox(String expectedBrend) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getBrandContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getBrandContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(expectedBrend)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);


    }

    @Then("Items in the {string} page should be ordered according to the {string} checkbox")
    public void itemsInThePageShouldBeOrderedAccordingToTheCheckbox(String page, String brand) {
        List<WebElement> itemTitles = getElements(mobilTelefonlarPom.getItemName());
        if(page.equalsIgnoreCase("Telefon Ve Aksesuarlar") && brand.equalsIgnoreCase("Apple")) {
            brand = "iPhone";
            for (WebElement element : itemTitles) {
                Assert.assertTrue(element.getText().contains(brand));

            }
        }else{
            for (WebElement element : itemTitles) {
                Assert.assertTrue(element.getText().contains(brand));

            }


        }
    }

    @When("Choose {string} in the NFC checkbox")
    public void chooseInTheNFCCheckbox(String NFC) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getNfcContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getNfcContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(NFC)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);


    }

    @And("Clicks on any product in the page")
    public void clicksOnAnyProductInThePage() throws InterruptedException {
        List<WebElement> textList = getElements(mobilTelefonlarPom.getItemName());
        if (textList.isEmpty()) {
            WebElement emptyPage = getElement(mobilTelefonlarPom.getEmptyPage());
            Assert.assertTrue(emptyPage.isDisplayed());
        } else {
            int randomNum = getRandomNum(textList.size());
            WebElement element = textList.get(randomNum);
            javascriptExecutor(element);
            Thread.sleep(3000);
        }
    }

    @Then("In product details NFC should be {string}")
    public void inProductDetailsNFCShouldBe(String NFC) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }
        WebElement nfc = getElement(mobilTelefonlarPom.getNfcText());
        Assert.assertTrue(nfc.getText().contains(NFC));
    }

    @When("Choose {string} in the DaxiliYaddas checkbox")
    public void chooseInTheDaxiliYaddasCheckbox(String  daxiliYaddas) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getDaxiliyaddasContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getDaxiliyaddasContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(daxiliYaddas)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);
    }

    @Then("In product details DaxiliYaddas should be {string}")
    public void inProductDetailsDaxiliYaddasShouldBe(String ExpectedDaxiliYaddas) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }
        WebElement actualDaxiliYaddas = getElement(mobilTelefonlarPom.getDaxiliyaddasText());
        Assert.assertTrue(actualDaxiliYaddas.getText().contains(ExpectedDaxiliYaddas));
    }

    @When("Choose {string} in the OperativYaddas checkbox")
    public void chooseInTheOperativYaddasCheckbox(String operativYaddas) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getOperativyaddasContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getOperativyaddasContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(operativYaddas)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);
    }

    @Then("In product details OperativYaddas should be {string}")
    public void inProductDetailsOperativYaddasShouldBe(String expectedOperativYaddas) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }
        WebElement actualOperativYaddas = getElement(mobilTelefonlarPom.getOperativyaddasText());
        Assert.assertTrue(actualOperativYaddas.getText().contains(expectedOperativYaddas));
    }

    @When("Choose {string} in the Akkumulyatorunhecmi checkbox")
    public void chooseInTheAkkumulyatorunhecmiCheckbox(String akkumulyatorunhecmi) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getAkkumulyatorunhecmiContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getAkkumulyatorunhecmiContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(akkumulyatorunhecmi)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);

    }

    @Then("In product details Akkumulyatorunhecmi should be {string}")
    public void inProductDetailsAkkumulyatorunhecmiShouldBe(String expectedAkkumulyatorunhecmi) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }
        String expectedAkkumulyatorunhecmiText = expectedAkkumulyatorunhecmi.replace(" mAh","");
        WebElement actualAkkumulyatorunhecmi = getElement(mobilTelefonlarPom.getAkkumulyatorunhecmiText());
        String actualAkkumulyatorunhecmiText = actualAkkumulyatorunhecmi.getText().replace(" mAh","");
        Assert.assertTrue(actualAkkumulyatorunhecmiText.contains(expectedAkkumulyatorunhecmiText));

    }

    @When("Choose {string} in the Ekranölçüsü checkbox")
    public void chooseInTheEkranolcusuCheckbox(String ekranölçüsü ) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getEkranolcusuContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getEkranolcusuContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(ekranölçüsü)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);

    }

    @Then("In product details Ekranölçüsü should be {string}")
    public void inProductDetailsEkranolcusuShouldBe(String expectedEkranolcusu) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }

        WebElement actualEkranOlcusu = getElement(mobilTelefonlarPom.getEkranolcusuText());
        Assert.assertTrue(actualEkranOlcusu.getText().contains(expectedEkranolcusu));
    }

    @When("Choose {string} in the Əməliyyatsistemi checkbox")
    public void chooseInTheƏməliyyatsistemiCheckbox(String emeliyyatsistemi ) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getEmeliyyatSistemiContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getEmeliyyatSistemiContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(emeliyyatsistemi)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);

    }

    @Then("In product details Əməliyyatsistemi should be {string}")
    public void inProductDetailsƏməliyyatsistemiShouldBe(String emeliyyatsistemi ) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }

        WebElement actualEkranOlcusu = getElement(mobilTelefonlarPom.getEmeliyyatsistemiText());
        Assert.assertTrue(actualEkranOlcusu.getText().contains(emeliyyatsistemi));
    }

    @When("Choose {string} in the Prosessor checkbox")
    public void chooseInTheProsessorCheckbox(String prosessor ) throws InterruptedException {
        WebElement container = getElement(mobilTelefonlarPom.getProsessorContainer());
        List<WebElement> productList = container.findElements(mobilTelefonlarPom.getProsessorContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(prosessor)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);

    }

    @Then("In product details Prosessor should be {string}")
    public void inProductDetailsProsessorShouldBe(String expectedProssesor) {
        List<WebElement> productDetailElements = getElements(mobilTelefonlarPom.getProductDetails());
        for (WebElement element : productDetailElements ){
            if (element.getText().equals("Texniki xüsusiyyətləri")){
                element.click();
                break;
            }
        }

        WebElement actulProsessor = getElement(mobilTelefonlarPom.getProsessorText());
        Assert.assertTrue(actulProsessor.getText().contains(expectedProssesor));
    }
    }






