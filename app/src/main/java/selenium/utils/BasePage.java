package selenium.utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.steps.Hooks;
import java.time.Duration;
public class BasePage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    public static ExtentTest test;
    public BasePage() {
            this.driver = Hooks.getDriver();
    }

    public boolean esperarElemento(WebElement elemento, int tiempoMaximoSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoMaximoSegundos));
        boolean present = false;
        try {
            wait.until(ExpectedConditions.visibilityOf(elemento));
            System.out.println("El elemento se encuentra disponible");
             present = true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
        return present;
    }

    public static void typeInput(WebElement element,String txtType) {
        try{
            element.sendKeys(txtType);
            System.out.println("Se escribe correctamente el texto: "+ txtType);
        }catch (Exception e){
            System.out.println("Ocurrió un error, no se encuentra el elemento disponible" + e.getMessage());
        }
    }
    public static void click(WebElement element) {
        try{
            element.click();
            System.out.println("Se hizó click correctamente en el elemento");
        }catch (Exception e){
            System.out.println("Ocurrió un error, no se encuentra el elemento disponible" + e.getMessage());
        }
    }
    public static void validateElementText(WebElement element, String txt) {
        try{
            if (element.getText().equals(txt)){
                System.out.println("El elemento contiene el texto esperado. \n"+
                         "Texto obtenido: " + element.getText() +"\n"
                        + "Texto esperado: " + txt);
            }else{
                System.out.println("El texto del elemento no coincide con lo esperado." +"Texto obtenido:" +
                        element.getText() + "\n"+ "Texto esperado: " + txt);
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error, no se encuentra el elemento disponible" + e.getMessage());
        }
    }
    public static void validateUrl(String txtURL) {
        String urlCurrent = driver.getCurrentUrl();
        if (urlCurrent.contains(txtURL)) {
            System.out.println("La URL contiene el texto esperado:\n" +
                    "URL actual:" + urlCurrent+"\n"
                    + "Texto esperado: " + txtURL);
        }else {
            System.out.println("La URL no contiene el texto\n" +
                    "URL actual:" + urlCurrent+"\n"
                    + "Texto esperado: " + txtURL);
        }


    }
}
