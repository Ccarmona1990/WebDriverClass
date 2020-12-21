import org.testng.annotations.*;

public class TestCaseExample1 {

    @AfterTest
    public void closeDBconnection () {
        System.out.println("Closing DB connection");
    }

    @BeforeTest
    public void createDBconnection(){
        System.out.println("Creating DB connection");
    }

    @BeforeMethod
    public void launchBrowser (){
        System.out.println("Launching browser");
    }
    @AfterMethod
    public void closeBrowser (){
        System.out.println("Closing browser");
    }

    @Test (priority = 2)
    public void doLogin (){
        System.out.println("Executing logging test");
    }

    @Test (priority = 1)
    public void doUserReg (){
        System.out.println("Executing user reg test");
    }

}
