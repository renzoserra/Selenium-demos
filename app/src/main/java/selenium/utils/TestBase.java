package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.pages.orangeHrm.Dashboard.DashboardPage;
import selenium.pages.orangeHrm.LoginOrangePage;
import selenium.pages.swagLab.LoginSwagLabPage;
import selenium.steps.Hooks;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected LoginOrangePage loginOrangeHrmPage = PageFactory.initElements(driver, LoginOrangePage.class);
    protected DashboardPage DashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    protected LoginSwagLabPage loginSwagLabPage =  PageFactory.initElements(driver, LoginSwagLabPage.class);

}
