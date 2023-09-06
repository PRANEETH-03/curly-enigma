package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//automated username enter
		
		WebElement usernameTF = driver.findElement(By.id("username"));
		System.out.println("username id identified");
		
		usernameTF.sendKeys("trainee");
		
		//automated password enter
		
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		System.out.println("password id identified");
		
		//passwordTF.sendKeys("trainee");
		
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("trainee");
		
		//automated login click
		
//		WebElement clicklogin = driver.findElement(By.id("loginButton"));
//		System.out.println("login button is clicked");
//		clicklogin.click();
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//linktext
		WebElement linktext = driver.findElement(By.partialLinkText("password"));
		System.out.println("forgot password");
//		linktext.click();
		// alternative way driver().findElement(By.linkText("forgotpassword)).click();
		
		
		
		
		
	}

}