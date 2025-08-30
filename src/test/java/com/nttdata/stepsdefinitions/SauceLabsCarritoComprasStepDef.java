package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SuaceLabsCarritoComprasSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SauceLabsCarritoComprasStepDef {
    @Steps
    SuaceLabsCarritoComprasSteps steps;

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCargueCorrectamenteLosProductosEnLaGaleria() {
        steps.validacionInicio();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoProducto(int cantidad, String producto) {
        steps.seleccionarProducto(producto);
        steps.ponerCantidad(cantidad);
        steps.agregarProducto();
    }

    @Then("valido el carrito de compra actualice correctamente {int}")
    public void validoElCarritoDeCompraActualiceCorrectamente(int cantidadIngresada) {
        steps.verCarrito();
        Assert.assertEquals(steps.validarCantidad(cantidadIngresada), true);
    }
}
