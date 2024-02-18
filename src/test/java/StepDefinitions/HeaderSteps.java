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
import pom.HeaderPom;

import java.util.List;

public class HeaderSteps  extends BaseMethods{

    HeaderPom headerPom;
    public HeaderSteps(){
        headerPom = HeaderPom.getInstance();
    }




   

    @When("Hovers mouse over {string} button")
    public void hoversMouseOverButton(String s1) {
        WebElement element = getElement(headerPom.getLanguageButton());
       actionsMoveToElement(element);
    }

    @Then("Should language options")
    public void shouldLanguageOptions() {
        WebElement element = getElement(headerPom.getSecondLanguageButton());
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Clicks on User profile button")
    public void clicksOnUserProfileButton() {
        WebElement element = getElement(headerPom.getUserProfile());
        element.click();
    }

    @Then("User should be navigated to the sighning page")
    public void userShouldBeNavigatedToTheSighningPage() {
        String expectedText = "Giriş";
        String actualText = getElement(headerPom.getGirisYazisi()).getText();
        Assert.assertEquals(actualText,expectedText);
    }

}

