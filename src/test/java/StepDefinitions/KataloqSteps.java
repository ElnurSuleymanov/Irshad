public class KataloqSteps extends BaseMethods{
    
    @When("Clicks on Kataloq button")
    public void userClicksInKataloqButton() throws InterruptedException {
        getElement(By.className("burger-menu")).click();
        Thread.sleep(3000);
    }

    @Then("Dropdown menu should be shown")
    public void dropdownMenuShouldBeShown() {
       WebElement element =  getElement(By.className("menu"));
        Assert.assertTrue(element.isDisplayed());

    }



    @Then("{string} items dropdown menu should be shown")
    public void itemsDropdownMenuShouldBeShown(String kataloqSection) {

        WebElement element = getElement(By.className("menu__item__sub"));
        Assert.assertTrue(element.isDisplayed());
    }

    @And("Clicks on {string} button in the Kataloq dropdown")
    public void clicksOnButtonInTheKataloqDropdown(String element2) {
        WebElement element = getElement(By.xpath("//*[@class='menu-section']//span//img[@alt='"+element2+"']"));
        element.click();

    }

    @Then("User should be navigated to the {string} page")
    public void userShouldBeNavigatedToThePage(String page) {
        Assert.assertTrue(getElement(By.className("campaigns-inner__body")).isDisplayed());
    }