package selenium.pages.swagLab;

import com.aventstack.extentreports.Status;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.utils.BasePage;

import java.util.ArrayList;
import java.util.List;

public class LoginSwagLabPage extends BasePage {
    @FindBy(xpath = "//input[@data-test=\"username\"]")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[data-test=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@data-test=\"login-button\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement botonHiLo;
    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
    private static List<WebElement> ListaPreciosProductos;

    public void inputUsername(String username) {
//        Assert.assertTrue("Campo username esta disponible",esperarElemento(usernameInput,10));
        if (esperarElemento(usernameInput,10)){
            BasePage.test.log(Status.PASS,"Campo username esta disponible");
            BasePage.test.log(Status.INFO,"INFO: Campo username esta disponible");
        }else {
            BasePage.test.log(Status.PASS,"Campo username NO esta disponible");
            BasePage.test.log(Status.INFO,"Campo username NO esta disponible");
        }
        typeInput(usernameInput, username);
    }

    public void inputPassword(String pass) {
        esperarElemento(passwordInput, 10);
        typeInput(passwordInput, pass);
    }

    public void botonLogin(boolean click) {
        if (click) {
            click(loginButton);
        } else {
            esperarElemento(loginButton, 10);
        }
    }

    public void botonHiLo(boolean click) {
        if (click) {
            click(botonHiLo);
        } else {
            esperarElemento(botonHiLo, 10);
        }
    }

    public static void productosOrdenadosMayorMenor() {
        List<Double> valoresNumericos = new ArrayList<>();
        for (WebElement precio : ListaPreciosProductos) {
            String precioTexto = precio.getText().replace("$", "");
            double valorNumerico = Double.parseDouble(precioTexto);
            valoresNumericos.add(valorNumerico);
        }
    }
}

