package epsilon.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();// it will download the updated driver executable
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("flipkart loaded");
		
	//to get the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the current url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to get the page source code
//		String page = driver.getPageSource();
//		System.out.println(page);
		
		//to get the window id {dynamic window id}
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		
//		driver.findElement();
		
		
		//to quit   will close all the existing tabs n browser
		driver.quit();
//		driver.close();//will close current window
		
		
	}
}
