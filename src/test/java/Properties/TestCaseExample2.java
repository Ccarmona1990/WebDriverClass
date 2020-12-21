package Properties;

import SeleniumMavenPractice.Config;
import SeleniumMavenPractice.WebBrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseExample2 {

    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void launchBrowser (){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Config.element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));


    }

    @Test
    public void checkTittle (){

        String tittleObtained = "yahoo.com";
        String tittleExpected = "gmail.com";

        // We use the Assert class to validate certain conditions
        softAssert.assertEquals(tittleExpected,tittleObtained);

        softAssert.assertAll();
    }

    @Test
    public void elementIsDisplaying (){

        softAssert.assertTrue(Config.element.isDisplayed(),"Element is not displaying");
    }

    @AfterMethod
    public void closeBrowser (){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.close();

    }

}
