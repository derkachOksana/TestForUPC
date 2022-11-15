package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private final WebDriver driver;
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By btnPayColumnPaymentPage = By.xpath("//a[@id ='widgetSubmit']");
    public void clickOnBtnPayColumnPaymentPage() {
        driver.findElement(btnPayColumnPaymentPage).click();
    }
}
