package com.nttdata.stepsdefinitions;

import com.nttdata.page.LinioMejorPage;
import com.nttdata.page.LoginLinioPage;
import com.nttdata.steps.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinioMejoCalSD {

    private WebDriver driver;
    private Scenario scenario;


    private LinioMejorCalStep linioMejorCalStep;

    private LinioMejorCalStep producto;

    private LinioMejorCalStep carro;

    private LinioMejorCalStep validar;



    @Before(order = 0)
    public void setUp() {
        //setUp
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Given("que estoy logeado en la pagina de linio")
    public void queEstoyLogeadoEnLaPaginaDeLinio() {
        driver.get("https://www.linio.com.co/");
        screenShot();
    }

    @And("doy clic en el enlace mejor calificados")
    public void doyClicEnElEnlaceMejorCalificados() {

        linioMejorCalStep = new LinioMejorCalStep(driver);
        linioMejorCalStep.btnMejorCal();
        screenShot();

    }

    @When("ingreso a la pagina mejor calificado")
    public void ingresoALaPaginaMejorCalificado() {


        }

    @And("doy clic en producto")
    public void doyClicEnProducto() {

        producto = new LinioMejorCalStep(driver);
        producto.linkProducto();
        screenShot();

    }

    @Then("ingreso a pagina de compras")
    public void ingresoAPaginaDeCompras() {

    }

    @And("doy click en boton carrito de compras")
    public void doyClickEnBotonCarritoDeCompras() {

        carro = new LinioMejorCalStep(driver);
        carro.linkCarrito();
        screenShot();


    }

    @And("valido mensaje de confirmacion")
    public void validoMensajeDeConfirmacion() {

        validar = new LinioMejorCalStep(driver);
        validar.getTitle();
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
