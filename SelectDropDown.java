package Phase1Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String args[]) throws AWTException {
		System.setProperty("WebDriver.chrome.driver", "./BrowserUtils/chrome.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		signin.click();

		WebElement userName = driver.findElement(By.name("email"));

		userName.sendKeys("neelavenidarla@gmail.com");

		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));

		Continue.click();

		WebElement Password = driver.findElement(By.id("ap_password"));

		Password.sendKeys("Neelaveni92");

		WebElement Submit = driver.findElement(By.className("a-button-input"));

		Submit.click();
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Search.sendKeys("kurtas");
		
		//Keyboard interaction
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Kurta = driver.findElement(By.xpath("(//span[text()='Women Kurta with Pants & Dupatta'])[1]"));
		
		Kurta.click();
		
		/*	//Select DropDown
		
		WebElement Quan = driver.findElement(By.className("a-native-dropdown a-declarative"));
		
		Select Quantity = new Select(Quan);
		
		Quantity.selectByIndex(2);
		Quantity.selectByValue("4");
		Quantity.selectByVisibleText("9");//*/
		
		WebElement Cart = driver.findElement(By.id("add-to-cart-button"));
		
	     Cart.submit();
		
		
		
		
		
		
		
		
	}
	
		
}

	