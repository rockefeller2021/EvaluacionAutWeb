package com.nttdata.steps;

import com.nttdata.page.LinioMejorPage;
import org.openqa.selenium.WebDriver;

public class LinioMejorCalStep {

    private WebDriver driver;

    //constructor
    public LinioMejorCalStep(WebDriver driver){
        this.driver = driver;
    }

    public void btnMejorCal(){

        try {
            this.driver.findElement(LinioMejorPage.mejorCal).click();
        }catch (Exception e){
        }

    }

    public void linkProducto(){

        try {
            this.driver.findElement(LinioMejorPage.producto).click();
        }catch (Exception e){
        }

    }

    public void linkCarrito(){

        try {
            this.driver.findElement(LinioMejorPage.carrito).click();
        }catch (Exception e){
        }

    }

    public String getTitle(){
        return this.driver.findElement(LinioMejorPage.verifica).getAttribute("alert-text");
    }


}
