package co.com.gohost.certificacion.pruebasrecorrido.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Utilidades {


    public void cambiarPestana(WebDriver driver ){
        ArrayList<String> newTab = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
    }

    public void esperarExplicitamente(WebDriver driver, String xpath){
        WebDriverWait esperaExplicita;
        esperaExplicita = new WebDriverWait(driver, 40);
        esperaExplicita.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    public void esperarImplicitamente(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
