package pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalizePageWingo extends PageObject {

    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/app-header-nav/div/header/nav/div/div/div[4]/div[3]")
    WebElement detail;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/app-header-nav/div/header/nav/div/div/div[4]/div[4]/div/div/div[2]")
    WebElement purchaseDetail;

    public WebElement Detail() {
        return detail;
    }

    public WebElement PurchaseDetail() {
        return purchaseDetail;
    }
}

