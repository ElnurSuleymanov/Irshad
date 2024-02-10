package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.BodyPom;
import pom.HeaderPom;

import java.util.ArrayList;

public class BodySteps extends BaseMethods {
    BodyPom bodyPom;
    public BodySteps(){
        bodyPom = BodyPom.getInstance();
    }
    @When("Clicks on Ayliq Odenish button")
    public void clicksOnButton(){
        WebElement element = getElement(bodyPom.getAylıqOdənisButton());
        element.click();
    }


    @And("Clicks on {string} button")
    public void clicksOnButton(String expected) {
        WebElement element = getElement(By.xpath("//*[@class='row']//div//a[@aria-label='"+expected+"']"));
       javascriptExecutor(element);

    }

    @Then("Should be navigated to the {string} page")
    public void shouldBeNavigatedToThePage(String expected) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String currentUrl = driver.getCurrentUrl();
        switch (expected) {
            case "Million" :
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
            case "E-pul" :
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
            case "Hesab.az":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
        }

    }
}
