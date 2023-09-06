package testNGpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class DataProvider {

	@Test(dataProvider="getData")
	public void sample(String username,String password) {
		System.out.println("username->"+username+"and password->"+password);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		
		//login into application
	    LoginPage lp= new LoginPage(driver);
	    lp.loginToApp(username, password);
	    
	    String exptitle="actiTIME -  Enter Time-Track";
	    String actualtitle=driver.getTitle();
	    Assert.assertEquals(actualtitle, exptitle);
	   // Assert.assertTrue(actualtitle.contains("actiTIME"));
	    System.out.println("validated using assert");
	}
	 @org.testng.annotations.DataProvider
	 public Object[][] getData(){
		 Object[][] data= new Object[3][2];
		 
		 data[0][0]="admin";
		 data[0][1]="manager";
		 
		 data[1][0]="trainee";
		 data[1][1]="trainee";
		 
		 data[2][0]="kfnjvn";
		 data[2][1]="manajvjrvnjnger";
		return data;
		 
	 }
}
