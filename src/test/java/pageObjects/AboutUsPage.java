package pageObjects;

import hooks.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {
    public WebDriver driver; // Webdriver is an instance here, so we need to create an object for it
     public BaseTest baseTest;
    public AboutUsPage(WebDriver driver){ // This is not standalone. This WebDriver driver is synchrinize with browserDriver driver
                                         // Without constructor, we cannot create an object
        this.driver = driver;
        baseTest = new BaseTest();
                                         //class is a big room while method is a small locked box, keys to enter the room
                                      // method is a local variable. Eg London is a local variable to UK.
                                      // this.driver is a class variable and driver is a local variable. To get class variable, you need to use (this keyword)
                                    // i.e class variable is assigned to local variable by (this key word)

    }
         By AboutUs = By.xpath("(//a[text()='About'])[1]");
         By aboutUsDisplayed = By.xpath("");


    public void Navigate(String url){
        driver.navigate().to(url);

    }

    public void clickAboutUs(){

        driver.findElement(AboutUs).click();
    }

}
