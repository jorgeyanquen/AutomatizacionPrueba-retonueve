package com.practicanueve.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DefaultUrl("http://www.paginasamarillas.com.co/.")
public class PaginasAmarillasLinkPage  extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[2]/form/div/div[1]/div/div[3]/input")
    public WebElementFacade txtbancos;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[2]/form/div/div[4]/button")
    public WebElementFacade btnbuscar;

    @FindBy(xpath = "//*[@id=\"listing\"]/div[1]/div[1]/div[1]/div[2]/a")
    public WebElementFacade linkbanco1;

    @FindBy(xpath = "//*[@id=\"block-banrep-page-title\"]/h1")
    public WebElementFacade ValidacionBanRepublica;



    public void buscarbancos(String datoPrueba){
        txtbancos.click();
       txtbancos.clear();
       txtbancos.sendKeys(datoPrueba);
    }
    public void botonbuscar(){
        btnbuscar.click();
    }
    public void bancorepublica(){
        linkbanco1.click();
    }

    public void nombre_sin_errores(){
        assertThat(ValidacionBanRepublica.isCurrentlyVisible(), is(false));
    }
    public void nombre_con_errores(){
        assertThat(ValidacionBanRepublica.isCurrentlyVisible(), is(true));
    }

}
