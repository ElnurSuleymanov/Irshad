package StepDefinitions;

import StepDefinitions.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MobilTelefonlarSteps  extends BaseMethods {

    @And("Clicks on the {string} button")
    public void clicksOnTheButton(String telefon) throws InterruptedException {
        WebElement element = getElement(By.xpath("//*[@class = 'content']//ul//li//a[@aria-label='" + telefon + "']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(5000);

    }

    @Then("User should be navigated to  {string} page")
    public void userShouldBeNavigatedToPage(String page) {
        String actualPage = getElement(By.xpath("//*[@id ='ProductList']//div//h1")).getText();
        Assert.assertTrue(actualPage.equalsIgnoreCase(page));

    }

    @And("Clicks on the Mobil telefonlar button")
    public void clicksOnTheMobilTelefonlarButton() {
        WebElement element = getElement(By.xpath("//*[@class='content']//a[@aria-label='Mobil telefonlar']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }
}
