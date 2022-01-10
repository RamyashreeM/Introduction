import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramyashreem\\Documents\\Agile\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/#/index");
		//WebElement element = driver.findElement(null);
		//element.
		
		
		//Webelement class and driver class
		
		//Get the title of the web page
		System.out.println(driver.getTitle());
		
		//Get the current URL 
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		//Running in Firefox browser
		
		//WebDriver driver = new FirefoxDriver();
		
		
		
	}

}
