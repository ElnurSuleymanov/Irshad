package StepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class HeaderSteps  extends BaseMethods{







    @When("Hovers mouse over {string} button")
    public void hoversMouseOverButton(String s1) {
        WebElement element = getElement(By.className("header__top__list__item__selected"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    @Then("Should language options")
    public void shouldLanguageOptions() {
        WebElement element = getElement(By.xpath("//ul[@class='langs']//li//a[@aria-label]"));
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Clicks on User profile button")
    public void clicksOnUserProfileButton() {
        WebElement element = getElement(By.xpath("//div[@class='container-fluid']//ul[2]//li[3]"));
        element.click();
    }

    @Then("User should be navigated to the sighning page")
    public void userShouldBeNavigatedToTheSighningPage() {
        String expectedText = "Giriş";
        String actualText = getElement(By.className("active")).getText();
        Assert.assertEquals(actualText,expectedText);
    }
}

