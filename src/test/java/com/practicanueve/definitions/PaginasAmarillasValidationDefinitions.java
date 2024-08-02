package com.practicanueve.definitions;

import com.practicanueve.Steps.PaginasAmarillasLinkValidationStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PaginasAmarillasValidationDefinitions {
    @Steps
    PaginasAmarillasLinkValidationStep paginasAmarillasLinkValidationStep;

    @Given("Go to the yellow pages to search for the banks")
    public void go_to_the_yellow_pages_to_search_for_the_banks() {
        paginasAmarillasLinkValidationStep.linkPaginasAmarillas();
    }

    @When("the information of these is displayed")
    public void the_information_of_these_is_displayed(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();


        for(int i=1; i<cells.size(); i++){
            paginasAmarillasLinkValidationStep.buscarbanco(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }
    }
    @Then("I verify that the link on the web page leads to the Corresponding Bank")
    public void i_verify_that_the_link_on_the_web_page_leads_to_the_corresponding_bank() {
        paginasAmarillasLinkValidationStep.verificar_nombre_banco_exitoso();

    }
 //   @Then("I verify that the link on the web page leads to the Corresponding Bank incorrecto")
   // public void i_verify_that_the_link_on_the_web_page_leads_to_the_corresponding_bank_incorrecto() {
  //  paginasAmarillasLinkValidationStep.verificar_nombre_banco_con_errores();

     //   paginasAmarillasLinkValidationStep.prueba();
   // }

}
