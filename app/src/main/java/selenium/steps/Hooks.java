package selenium.steps;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import selenium.utils.browser_manager.DriverManager;
import selenium.utils.browser_manager.DriverManagerFactory;
import selenium.utils.browser_manager.DriverType;

public class Hooks {
    public static WebDriver driver;
    public DriverManager driverManager;
    public static String Tag_ID_Running;

    @Before
    public void setup() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();;
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterStep
    public static void takeScreenshot(Scenario scenario) {
        if (driver instanceof TakesScreenshot) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","image" );
        }
    }
    @Before
    public void beforeScenario(Scenario scenario) {
        Tag_ID_Running = obtenerTagDelEscenario(scenario);
    }
    private String obtenerTagDelEscenario(Scenario scenario) {
        return String.join(", ", scenario.getSourceTagNames());
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
