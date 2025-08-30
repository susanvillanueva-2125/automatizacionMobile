package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceLabsCarritoComprasScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement txtTitulo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private List<WebElement> lista;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnCantidad;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregar;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"View cart\"]")
    private WebElement btnVerCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement txtCantidad;

    public String getTitulo() {
        String nameApp = "";
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(txtTitulo));
        nameApp = txtTitulo.getText();
        return nameApp;
    }

    public int getCountElements(){
        return lista.size();
    }

    public void seleccionarProducto(String producto) {
        WebElement elementoProducto = getDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\""+producto+"\"]"));
        elementoProducto.click();
    }

    public void incrementarCantidad() {
        btnCantidad.click();
    }

    public void agregarProducto() {
        btnAgregar.click();
    }

    public void verCarrito() {
        btnVerCarrito.click();
    }

    public int obtenerCantidad() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(txtCantidad));
        return Integer.parseInt(txtCantidad.getText());
    }
}

