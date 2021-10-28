package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepsWingo;


public class StepDefinition {


    @Steps
    StepsWingo stepsWingo;

    @Given("^El usuario ingresa al portal web y genera la busqueda de un tiquete aero de (.+) - (.+)$")
    public void el_usuario_ingresa_al_portal_web_y_genera_la_busqueda_de_un_tiquete_aero_de(String cityFrom, String cityTo) {
        stepsWingo.IngresarPortalWingo();
        stepsWingo.SeleccionarTipoVueloOneWay();
        stepsWingo.SeleccionarFechaSalida(cityFrom, cityTo);
    }

    @When("^El usuario obtiene obtiene el valor de los tiquetes aeros en el mes y selecciona el vuelo más economico\\.$")
    public void el_usuario_obtiene_obtiene_el_valor_de_los_tiquetes_aeros_en_el_mes_y_selecciona_el_vuelo_más_economico() throws InterruptedException {
        stepsWingo.SeleccionarVueloMasEconomico();
    }

    @Then("^El usuario da click en “Detalles del vuelo” y valida que aparezca la información del vuelo seleccionado.(.+)$")
    public void el_usuario_da_click_en_Detalles_del_vuelo_y_valida_que_aparezca_la_información_del_vuelo_seleccionado(String expectedResult) {
        stepsWingo.InformaciónDelvueloSeleccionado(expectedResult);
    }


}