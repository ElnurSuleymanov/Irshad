package StepDefinitions;

import enums.ExpectedConditionType;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
}
