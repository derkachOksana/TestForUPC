package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By btnTest = By.xpath("//a[@href = '/billing']");
    public void clickOnButtonTest() {
        driver.findElement(btnTest).click();
    }
}
