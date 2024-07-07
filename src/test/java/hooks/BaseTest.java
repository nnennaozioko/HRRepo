package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;
    public BrowserDriver BDriver;


    @Before
    public void Setup() {
        BDriver = new BrowserDriver();
        driver = BDriver.BrowserSetUp();
    }
  @After
    public void TearDown() {
      try {
          driver.close();
      } finally {
          driver.quit();
      }

    //driver.quit();

  }
}