package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//automated username enter
		
		org.openqa.selenium.WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("nameee");
		Thread.sleep(3000);
		un.clear();
		String tagname = un.getTagName();
		System.out.println(tagname);
		String attname = un.getAttribute(tagname);
		System.out.println(attname);
		
	}

}
