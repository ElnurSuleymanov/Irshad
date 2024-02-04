package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.FooterPom;

import java.util.ArrayList;
import java.util.List;

import static driverSession.CucucmberHook.driver;
import static enums.ExpectedConditionType.VISIBLE;

public class FooterSteps extends BaseMethods {


    private static FooterPom footerPom;

    public FooterSteps () {
        footerPom = FooterPom.getInstance();
    }


    @When("Clicks on {string} button on the section {string}")
    public void clicksOnButtonOntheSection(String socialBTN, String s2) throws InterruptedException {
       WebElement element = getElement(By.xpath("//div[@class='footer__contacts__social__icons']//a[@aria-label ='"+socialBTN.toLowerCase()+"']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    @Then("User in on {string} page")
    public void userInOnPage(String expected) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
         Thread.sleep(5000);
        switch (expected) {
            case "Facebook":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Instagram":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Youtube":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Whatsapp":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Telegram":
                String expectedTelegram = "t.me";
                Assert.assertTrue(currentUrl.contains(expectedTelegram));
                break;
            case "Tiktok":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Linkedin":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            case "Twitter":
                Assert.assertTrue(currentUrl.contains(expected.toLowerCase()));
                break;
            default:
                System.out.println("Sosial media düyməsi təyin edilməyib!");
        }
    }
}
