import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginTest {
     WebDriver driver;
     Logger log=Logger.getLogger(LoginTest.class);
     @BeforeMethod
     public void setUp() {
    	 log.info("************************Start of the Program********************");
    	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sivag\\\\Downloads\\\\chromedriver_win32\\\\ChromeDriver\\\\chromedriver.exe");
    	 driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.get("https://www.crmpro.com/");
    	 log.info("This is a informational message");
    	 log.warn("This is a warning message");
    	 log.fatal("This is a fatal message");
    	 log.debug("This is a debug message");
    	 }
     @Test(priority=1)
     public void test1() {
    	 log.info("*******************Start of the TestCase******************");
    	 String title = driver.getTitle();
    	 log.info("The title of the page is "+title);
    	 Assert.assertEquals(title, "CRMPRO", "Title not matching");
    	 log.info("******************End of the TestCase*********************");
     }
     @Test(priority=2)
     public void test2() {
    	 log.info("*******************Start of the TestCase******************");
    	 boolean b = driver.findElement(By.className("navbar-brand")).isDisplayed();
    	 Assert.assertTrue(b);
    	 log.info("******************End of the TestCase*********************");
    	 }
     @AfterMethod
     public void tearDown() {
    	 driver.quit();
    	 log.info("**********************Browser is Closed*********************");
     }
     
}
