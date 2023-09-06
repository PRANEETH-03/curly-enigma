package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hiddendivision {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTF = driver.findElement(By.id("username"));
		
		usernameTF.sendKeys("admin");
		
		//automated password enter
		
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		
		passwordTF.sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		//navigate to the task
		Thread.sleep(6000);
		driver.findElement(By.id("container_tasks")).click();
		
		//check box
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		
		//click on copy to
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
		
		//click on cancel in hidden division pop up
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ok button']/following-sibling::div[@class='cancel button'])[5]")).click();
		System.out.println("canceled hidden popup page");
		
		
		
		
	}

}
