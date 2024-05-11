package selenium.pages.orangeHrm;

import com.aventstack.extentreports.Status;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.utils.BasePage;


public class LoginOrangePage extends BasePage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void inputUserPass(String username, String pass){
        Assert.assertTrue("Campo username esta disponible",esperarElemento(usernameInput,10));
        Assert.assertTrue(esperarElemento(usernameInput,10));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(pass);
    }

    public void botonLogin(boolean onclick){
        if (onclick){
            click(loginButton);
        }else {
            esperarElemento(loginButton,10);
        }
    }

}
