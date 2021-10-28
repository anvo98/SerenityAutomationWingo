package pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageWingo extends PageObject {

    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/app-header-nav/div/header/nav/div/div/div[3]/div[2]")
    WebElement buttonModifyYourFlight;
    @FindBy(xpath = "//*[@id=\"modulo-modificar-vuelo\"]/div/div/div[1]/div[3]/label")
    WebElement monthView;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/main/app-ofertsemanal/div[3]/main/h3[1]/div/div")
    WebElement selectYourBestFare;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/app-header-nav/div/div[1]/app-modify-flight/div/div/div/div[2]/div/div[2]/div[3]")
    WebElement buttonLetsGo2;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/main/app-ofertsemanal/div[3]/main/div[1]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[3]/button")
    WebElement buttonSelectedFlight;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-step/main/app-ofertsemanal/div[3]/main/div[8]/button")
    WebElement buttonContinue;

    public WebElement ButtonModifyYourFlight() {
        return buttonModifyYourFlight;
    }

    public WebElement MonthView() {
        return monthView;
    }

    public WebElement SelectYourBestFare() {
        return selectYourBestFare;
    }

    public WebElement ButtonLetsGo2() {
        return buttonLetsGo2;
    }

    public WebElement ButtonSelectedFlight() {
        return buttonSelectedFlight;
    }

    public WebElement ButtonContinue() {
        return buttonContinue;
    }
}

