package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class LoginintoActiTime {

	@Test
	public void LoginToApp()
	{
		// Launch the browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

//		// Step 2: Load the application URL
		driver.get("https://demo.actitime.com/login.do");
		
		//login into application
	    LoginPage lp= new LoginPage(driver);
	    lp.loginToApp("admin", "manager");
	    
	    //alternative method of login 
//	    lp.getUsernameEDT().sendKeys("admin");
//	    lp.getPasswordEDT().sendKeys("manager");
//	    lp.getLoginEDT().click();

	}

}
