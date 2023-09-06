package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopups {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		// 1. cleck the alert and press ok

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        

        // 2. click alert and fetch the text displayed and select ok or cancel
        driver.findElement(By.id("confirmButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
       
        

        // 3.click the prompt and enter something and press ok
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("praneeth");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        

        
	}

}
