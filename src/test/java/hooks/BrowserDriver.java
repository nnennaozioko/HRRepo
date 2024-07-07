package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserDriver {

    public static WebDriver driver;

    public WebDriver BrowserSetUp(){

    //        if(Browser.equalsIgnoreCase("fireFoxDriver")) {
//           // driver = new FirefoxDriver();
//          //  driver.manage().window().maximize();
//
//        }
       //Browser.equalsIgnoreCase("chrome");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        return driver;
    }



}
