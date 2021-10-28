package steps;

import java.util.*;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.*;

public class StepsWingo extends ScenarioActor {
    @Steps(shared = true)

    HomePageWingo homepageWingo;
    SearchPageWingo searchPageWingo;
    PersonalizePageWingo personalizePageWingo;

    @Step("Ingresar al portal https://www.wingo.com/en")
    public void IngresarPortalWingo() {
        homepageWingo.setDefaultBaseUrl("https://www.wingo.com/en");
        homepageWingo.open();
    }

    @Step("Seleccionar un tipo de vuelo ”One Way”")
    @Screenshots(disabled = true)
    public void SeleccionarTipoVueloOneWay() {
        homepageWingo.OneWay().click();
    }

    @Step("Seleccionar la fecha de salida")
    public void SeleccionarFechaSalida(String cityFrom, String cityTo) {
        homepageWingo.Fromid().click();
        homepageWingo.From().click();
        homepageWingo.From().sendKeys(cityFrom);
        homepageWingo.FromOption().click();
        Serenity.takeScreenshot();
        homepageWingo.To().click();
        homepageWingo.To().sendKeys(cityTo);
        homepageWingo.ToOption().click();
        Serenity.takeScreenshot();
        homepageWingo.Date().click();
        homepageWingo.ButtonLetsGo().click();
        Serenity.takeScreenshot();
    }

    @Step("Seleccionar el vuelo más economico")
    public void SeleccionarVueloMasEconomico() throws InterruptedException {
        WebDriver Driver = homepageWingo.getDriver();
        Thread.sleep(5000);
        Set<String> windows = Driver.getWindowHandles();
        for (String window : windows) {
            Driver.switchTo().window(window);
        }
        Thread.sleep(3000);
        searchPageWingo.SelectYourBestFare().click();
        searchPageWingo.ButtonModifyYourFlight().click();
        searchPageWingo.MonthView().click();
        searchPageWingo.ButtonLetsGo2().click();
        Thread.sleep(6000);
        Serenity.takeScreenshot();
        List<WebElement> listOfElementsPriceMonth = Driver.findElements(
                By.xpath("/html/body/app-root/div[1]/app-step/main/app-ofertsemanal/div[3]/main/div[1]/div[2]/div[1]/div[2]/ul/li/div/div/div[3]/div[2]"));
        int idBestMonthFare = 0;
        int bestMonthFare = FormatIntPriceMonth(listOfElementsPriceMonth.get(0));
        for (int i = 0; i < listOfElementsPriceMonth.size(); i++) {
            if (FormatIntPriceMonth(listOfElementsPriceMonth.get(i)) < bestMonthFare) {
                idBestMonthFare = i;
                bestMonthFare = FormatIntPriceMonth(listOfElementsPriceMonth.get(i));
            }
        }
        System.out.println("bestMonthFare: " + bestMonthFare);
        Serenity.takeScreenshot();
        listOfElementsPriceMonth.get(idBestMonthFare).click();
        Serenity.takeScreenshot();
        Thread.sleep(4000);
        searchPageWingo.ButtonSelectedFlight().click();
        Thread.sleep(2000);
        searchPageWingo.ButtonContinue().click();
        Thread.sleep(5000);
    }

    @Step("click en “Detalles del vuelo” y validar que aparezca la información del vuelo seleccionado")
    public void InformaciónDelvueloSeleccionado(String expectedResult) {
        personalizePageWingo.Detail().click();
        Assert.assertEquals(personalizePageWingo.PurchaseDetail().getText().replace("\n", "").replace(" ", ""), expectedResult);
        System.out.println("informacion del vuelo:" + personalizePageWingo.PurchaseDetail().getText());


    }

    public int FormatIntPriceMonth(WebElement PriceMonthFormat) {
        return Integer.parseInt(PriceMonthFormat.getText().replace("COP", "")
                .replace("$", "").replace(",", ""));
    }

}
