package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Launch the browser
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();

				driver.manage().window().maximize();

//				// Step 2: Load the application URL
//				driver.get("https://amazon.com");
//				
//				//Mouse Hovering action
//				WebElement element = driver.findElement(By.xpath("//div[text()='EN']"));
//				
//				Actions act = new Actions(driver);
//				act.moveToElement(element).perform();
//				
//				System.out.println("mouse hoviering done");
//				
				
				//Double Click
//				driver.get("https://demoqa.com/buttons");
//				
//				WebElement ele = driver.findElement(By.id("doubleClickBtn"));
//				
//				Actions act = new Actions(driver);
//				act.doubleClick(ele).perform();
//				
//				System.out.println("double click done");
		//
//				WebElement rytEle = driver.findElement(By.id("rightClickBtn"));
//				act.contextClick(rytEle).perform();
//				System.out.println("right click done");
				
				
				//Drag and Drop operation
//				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//				
//				WebElement srcElement = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
//				
//				WebElement targetElement = driver.findElement(By.xpath("//div[text()='United States']"));
//				
//				Actions act = new Actions(driver);
//				act.dragAndDrop(srcElement, targetElement).perform();
				
				
				

	}

}
