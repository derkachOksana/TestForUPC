package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CardPage;
import pages.MainPage;
import pages.PaymentPage;
import pages.ResultPaymentPage;

import java.util.ArrayList;


public class VerifySuccessPaymentTest extends BaseTest {
    public MainPage mainPage;
    public PaymentPage paymentPage;

    public CardPage cardPage;

    public ResultPaymentPage resultPaymentPage;

    private final String cardNumber = "4999999999990011";
    private final String validity = "12/22";
    private final String cvc = "123";


    @BeforeClass
    public void preconditions() {
        mainPage = new MainPage(driver);
        paymentPage = new PaymentPage(driver);
        cardPage = new CardPage(driver);
        resultPaymentPage = new ResultPaymentPage(driver);
    }

    @Test
    public void verifySuccessPayment() {
        mainPage.clickOnButtonTest();
        paymentPage.clickOnBtnPayColumnPaymentPage();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        cardPage.clickOnFieldCardNumber();
        cardPage.fillInFieldCardNumber(cardNumber);
        cardPage.clickOnFieldValidity();
        cardPage.fillInFieldValidity(validity);
        cardPage.clickOnFieldCVC();
        cardPage.fillInFieldCVC(cvc);
        cardPage.clickBtnPay();
        Assert.assertEquals(resultPaymentPage.transCodeInfo(), "000");
    }
}
