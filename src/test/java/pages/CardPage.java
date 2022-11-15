package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage {
    private final WebDriver driver;
    public CardPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By fieldCardNumber = By.xpath("//input[@id='cardNumberFormated']");
    private final By fieldValidity = By.xpath("//input[@id='expired']");
    private final By fieldCVC = By.xpath("//input[@id='cardCvc2']");
    private final By btnPay = By.xpath("//button[@id= 'formSubmitBtn']");

    public void clickOnFieldCardNumber() {
        driver.findElement(fieldCardNumber).click();
    }
    public void fillInFieldCardNumber(String cardNumber) {
        driver.findElement(fieldCardNumber).clear();
        driver.findElement(fieldCardNumber).sendKeys(cardNumber);
    }
    public void clickOnFieldValidity() {
        driver.findElement(fieldValidity).click();
    }
    public void fillInFieldValidity(String validity) {
        driver.findElement(fieldValidity).clear();
        driver.findElement(fieldValidity).sendKeys(validity);
    }
    public void clickOnFieldCVC() {
        driver.findElement(fieldCVC).click();
    }
    public void fillInFieldCVC(String cvc) {
        driver.findElement(fieldCVC).clear();
        driver.findElement(fieldCVC).sendKeys(cvc);
    }
    public void clickBtnPay() {
        driver.findElement(btnPay).click();
    }
}
