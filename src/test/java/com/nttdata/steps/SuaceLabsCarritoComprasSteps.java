package com.nttdata.steps;
import com.nttdata.screens.SauceLabsCarritoComprasScreen;
import org.junit.Assert;

public class SuaceLabsCarritoComprasSteps {
    SauceLabsCarritoComprasScreen screen;

    public void validacionInicio() {
        Assert.assertEquals("PRODUCTS",screen.getTitulo().toUpperCase() );
        Assert.assertTrue(screen.getCountElements()>1);
    }

    public void seleccionarProducto(String producto) {
        screen.seleccionarProducto(producto);
    }

    public void ponerCantidad(int cantidad) {
        for (int i = 1; i < cantidad; i++) {
            screen.incrementarCantidad();
        }
    }

    public void agregarProducto() {
        screen.agregarProducto();
    }

    public void verCarrito() {
        screen.verCarrito();
    }

    public boolean validarCantidad(int cantidadIngresada) {
        int cantidadCarrito = screen.obtenerCantidad();
        return cantidadIngresada==cantidadCarrito;
    }

}

