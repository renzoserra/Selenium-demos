package selenium.pages.orangeHrm.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.utils.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement opcionSubMenuDashboard;

    public void visualizoSubMenuDashboard(String txt){
        esperarElemento(opcionSubMenuDashboard,10);
        validateElementText(opcionSubMenuDashboard,txt);
    }


}
