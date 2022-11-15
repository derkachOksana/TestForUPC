package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPaymentPage {
    private final WebDriver driver;
    public ResultPaymentPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By successfulCodeTrans = By.xpath("//tbody/tr[3]/td[2]");
    public String transCodeInfo() {
        return driver.findElement(successfulCodeTrans).getText();
    }
}

