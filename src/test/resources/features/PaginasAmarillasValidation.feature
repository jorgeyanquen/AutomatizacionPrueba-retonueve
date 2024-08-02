@Regresion
  Feature: Perform the query for Banks in the WEB Yellow Pages and verify that the Web page is as expected in the list of the first 10 banks.
    @CasoExitoso
    Scenario: go through the list of the first 10 banks that the page
      Given Go to the yellow pages to search for the banks
      When the information of these is displayed
        | buscar |
        | Bancos |

      Then I verify that the link on the web page leads to the Corresponding Bank

    @Casoalterno1
    Scenario: go through the list of the first 10 banks that the page
      Given Go to the yellow pages to search for the banks
      When the information of these is displayed
        | buscar  |
        | Bancos  |
        | Bancos De Sangre  |
      Then I verify that the link on the web page leads to the Corresponding Bank incorrecto