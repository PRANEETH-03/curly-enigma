package epsilon.WebDriver;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentdate {
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
//		driver.findElement(By.id("fsw_inputBox dates inactiveWidget activeWidget")).click();
//		driver.findElement(By.id("makeFlex hrtlCenter column active")).click();
		
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("first");
		
		Thread.sleep(2000);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("second");
		
//		driver.findElement(By.className("fsw_inputBox dates inactiveWidget ")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("MakeMyTrip"));
		System.out.println("donnnrrr");
	}

}
