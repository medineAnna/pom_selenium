package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBaseCross {
    public WebDriver driver;

    @Parameters("browser")

    @BeforeMethod
    public void setUp(@Optional String browser){
        WebDriverManager.chromedriver().setup();

        driver=CrossDriver.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod
    public void teardown(){
        CrossDriver.closeDriver();
    }
}
