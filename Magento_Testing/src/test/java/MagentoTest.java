import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest
{
	@Test
    public void positivecredentials()
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHIR\\Desktop\\SeleniumSoftwares\\chromedriver83.exe");
    	WebDriver driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.get("https://www.magento.com");
    	
    	Welcome w=new Welcome(driver);
    	w.clickonMyAccount();
    	
    	Login l=new Login(driver);
    	l.typeEmail("ihassan395@gmail.com");
    	l.typePassword("Welcome@123");
    	l.clickOnLogin();
		
    	Home h=new Home(driver);
        h.clickOnLogout();
	}

}
