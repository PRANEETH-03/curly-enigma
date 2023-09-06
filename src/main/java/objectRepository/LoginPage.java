package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// step 1 create a separate pom class for a web page 
	
	// rule 2: identify the web  elements using @FindBY annotation
	@FindBy(name="username")
	private WebElement usernameEDT;
	
	@FindBy(name="pwd")
	private WebElement passwordEDT;
	
	@FindBy(id ="loginButton")
	private WebElement loginEDT;
	
	//rule 3 create a constructor for element initialized
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//rule 4: provide the getters n setters

	public WebElement getUsernameEDT() {
		return usernameEDT;
	}

	public WebElement getPasswordEDT() {
		return passwordEDT;
	}

	public WebElement getLoginEDT() {
		return loginEDT;
	}
	
	//Business library
	public void loginToApp(String USERNAME,String PASSWORD) {
		usernameEDT.sendKeys(USERNAME);
		passwordEDT.sendKeys(PASSWORD);
		loginEDT.click();
		
	}
	
	
	
	
	
	

}
