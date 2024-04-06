package selenium.utils.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\Renzo\\Desktop\\Git\\Selenium-demos\\app\\src\\main\\resources\\geckoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
