package pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageWingo extends PageObject {

    @FindBy(id = "btnIda")
    WebElement oneWay;
    @FindBy(id = "inputOrigen")
    WebElement from;
    @FindBy(xpath = "/html/body/div[1]/main/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div")
    WebElement fromid;
    @FindBy(xpath = "/html/body/div[1]/main/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div/div/ul/li")
    WebElement fromOption;
    @FindBy(id = "inputDestino")
    WebElement to;
    @FindBy(xpath = "/html/body/div[1]/main/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div[3]/div[2]/div/div/ul/li[1]")
    WebElement toOption;
    @FindBy(xpath = "/html/body/div[1]/main/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div/table[2]/tbody/tr[2]/td[1]/div")
    WebElement date;
    @FindBy(xpath = "/html/body/div[1]/main/section/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/div/div[2]/div/div[5]/div")
    WebElement buttonLetsGo;

    public WebElement OneWay() {
        return oneWay;
    }

    public WebElement From() {
        return from;
    }

    public WebElement Fromid() {
        return fromid;
    }

    public WebElement FromOption() {
        return fromOption;
    }

    public WebElement To() {
        return to;
    }

    public WebElement ToOption() {
        return toOption;
    }

    public WebElement Date() {
        return date;
    }

    public WebElement ButtonLetsGo() {
        return buttonLetsGo;
    }
}

