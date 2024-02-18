package pom;

import org.openqa.selenium.By;

public class MobilTelefonlarPom {
    private static MobilTelefonlarPom INSTANCE;
    private MobilTelefonlarPom() {

    }
    public static MobilTelefonlarPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MobilTelefonlarPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }


    public By getMobilTelefonlarButton() {return mobilTelefonlarButton;}
    public By getBrandContainer() {return brandContainer;}
    public By getBrandContainerElements() {return brandContainerElements;}
    public By getItemName() {return itemName;}
    public By getNfcContainer() {return nfcContainer;}
    public By getNfcContainerElements() {return nfcContainerElements;}
    public By getItems() {return items;}
    public By getNfcText() {return nfcText;}
    public By getDaxiliyaddasContainer() {return daxiliyaddasContainer;}
    public By getDaxiliyaddasContainerElements() {return daxiliyaddasContainerElements;}
    public By getDaxiliyaddasText() {return daxiliyaddasText;}
    public By getOperativyaddasContainer() {return operativyaddasContainer;}
    public By getOperativyaddasContainerElements() {return operativyaddasContainerElements;}
    public By getOperativyaddasText() {return operativyaddasText;}
    public By getAkkumulyatorunhecmiContainer() {return akkumulyatorunhecmiContainer;}
    public By getAkkumulyatorunhecmiContainerElements() {return akkumulyatorunhecmiContainerElements;}
    public By getAkkumulyatorunhecmiText() {return akkumulyatorunhecmiText;}
    public By getProductDetails() {return productDetails;}
    public By getEkranolcusuContainer() {return ekranolcusuContainer;}
    public By getEkranolcusuContainerElements() {return ekranolcusuContainerElements;}
    public By getEkranolcusuText() {return ekranolcusuText;}
    public By getEmeliyyatSistemiContainer() {return emeliyyatSistemiContainer;}
    public By getEmeliyyatSistemiContainerElements() {return emeliyyatSistemiContainerElements;}
    public By getEmeliyyatsistemiText() {return emeliyyatsistemiText;}
    public By getProsessorContainer() {return prosessorContainer;}
    public By getProsessorContainerElements() {return prosessorContainerElements;}
    public By getProsessorText() {return prosessorText;}
    public By getEmptyPage() {return emptyPage;}





    private final By brandContainerElements = By.tagName("label");
    private final By items = By.cssSelector(".product.first");
    private final By nfcContainerElements = By.tagName("label");
    private final By daxiliyaddasContainerElements = By.tagName("label");
    private final By operativyaddasContainerElements = By.tagName("label");
    private final By akkumulyatorunhecmiContainerElements = By.tagName("label");
    private final By ekranolcusuContainerElements = By.tagName("label");
    private final By emeliyyatSistemiContainerElements = By.tagName("label");
    private final By prosessorContainerElements = By.tagName("label");

    private final By mobilTelefonlarButton = By.xpath("//*[@class='content']//a[@aria-label='Mobil telefonlar']");
    private final By brandContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[3]/div");
    private final By nfcContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[5]/div");
    private final By daxiliyaddasContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[6]/div");

    private final By operativyaddasContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[7]/div");
    private final By akkumulyatorunhecmiContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[8]/div");
    private final By ekranolcusuContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[9]/div");
    private final By emeliyyatSistemiContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[10]/div");
    private final By prosessorContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[11]/div");
    private final By itemName = By.className("product__name");
    private final By emptyPage = By.className(".products__desc");
    private final By nfcText = By.xpath("//*[@aria-label='Şəbəkə']//div[@class='product-view__details__technical-info__item__info']//ul//li[2]");
private final By daxiliyaddasText = By.xpath("//*[@aria-label='Yaddaş']//div[@class='product-view__details__technical-info__item__info']//ul//li[2]");
private final By operativyaddasText = By.xpath("//*[@aria-label='Yaddaş']//div[@class='product-view__details__technical-info__item__info']//ul//li[1]");
private final By ekranolcusuText = By.xpath("//*[@aria-label='Ekran']//div[@class='product-view__details__technical-info__item__info']//ul//li[2]");
private final By emeliyyatsistemiText = By.xpath("//*[@aria-label='Prosessor']//div[@class='product-view__details__technical-info__item__info']//ul//li[1]");
private final By prosessorText = By.xpath("//*[@aria-label='Prosessor']//div[@class='product-view__details__technical-info__item__info']//ul//li[2]");
private final By akkumulyatorunhecmiText =By.xpath("//*[@aria-label='Akkumulyator']//div[@class='product-view__details__technical-info__item__info']//ul//li[1]");
private final By productDetails = By.cssSelector(".tablinks.btn.btn-black-transparent");



}
