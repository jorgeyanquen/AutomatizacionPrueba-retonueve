package com.practicanueve.Steps;

import com.practicanueve.pages.PaginasAmarillasLinkPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PaginasAmarillasLinkValidationStep {
    PaginasAmarillasLinkPage paginasAmarillasLinkPage;

    @Step
    public void linkPaginasAmarillas(){
        paginasAmarillasLinkPage.open();

    }
    @Step
    public void buscarbanco(List<List<String>> data, int id){
        paginasAmarillasLinkPage.buscarbancos(data.get(id).get(0).trim());
        paginasAmarillasLinkPage.botonbuscar();
        paginasAmarillasLinkPage.bancorepublica();

    }

    @Step
    public void verificar_nombre_banco_exitoso(){
        paginasAmarillasLinkPage.nombre_sin_errores();
    }
 //   @Step
  //  public void verificar_nombre_banco_con_errores(){
  //      paginasAmarillasLinkPage.nombre_con_errores();
  //  }

    @Step
    public void prueba(){
        Object getDriver;
        getDriver().get("https://www.banrep.gov.co/es/sucursales/Cartagena%2C%20Bol%C3%ADvar");
        String url = getDriver().getCurrentUrl();
        if(url.equals("https://www.banrep.gov.co/es/sucursales/Cartagena%2C%20Bol%C3%ADvar")){
            paginasAmarillasLinkPage.nombre_sin_errores();
        }else{
            paginasAmarillasLinkPage.nombre_con_errores();
        }

    }
}
