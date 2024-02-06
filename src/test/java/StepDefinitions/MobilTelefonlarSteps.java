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
