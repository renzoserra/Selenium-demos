package selenium.utils.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeDriverManager extends DriverManager{
    private static WebDriverWait wait;
    protected void createDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Renzo\\Desktop\\Git\\Selenium-demos\\app\\src\\main\\resources\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
