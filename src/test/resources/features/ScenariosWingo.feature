@Cucumber
Feature: Automatizacion del portal Wingo
  Este feature se trata de automatizar la busqueda de tiquetes aereos para la pagina web de la aerolinea Wingo.

  Scenario Outline:Busqueda de tiquetes aereos:
    Given El usuario ingresa al portal web y genera la busqueda de un tiquete aero de <Ciudad Origen> - <Ciudad Destino>
    When El usuario obtiene obtiene el valor de los tiquetes aeros en el mes y selecciona el vuelo más economico.
    Then El usuario da click en “Detalles del vuelo” y valida que aparezca la información del vuelo seleccionado.<Resultado esperado>

    Examples:
      | Ciudad Origen | Ciudad Destino | Resultado esperado                                                                                                 |
      | Cartagena     | Cali           | ONEWAY:Fri,19NovFareGOBASICCTG09:17am.CartagenaAirportRafaelNúñezCLO10:52am.CaliAirportAlfonsoBonillaAragón        |
      | Bogota        | Medellin       | ONEWAY:Tue,09NovFareGOBASICBOG06:55am.BogotáAirportElDoradoMDE07:55am.MedellínAirportJoséMaríaCórdova              |
      | Bogota        | Mexico         | ONEWAY:Sun,21NovFareGOBASICBOG10:00pm.BogotáAirportElDoradoMEX01:51am.CiudaddeMéxicoAirportBenitoJuarez(Terminal2) |






















      
