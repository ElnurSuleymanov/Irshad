package StepDefinitions;

public class FooterSteps {
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
