package Phase1Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectingProduct {
	
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
		
		//MouseInteraction
		
		WebElement Product = driver.findElement(By.xpath("//a[text()='Toys & Games']"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(Product).click().perform();
		
		driver.navigate().back();
		
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Search.sendKeys("kurtas");
		
		//Keyboard interaction
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Kurta = driver.findElement(By.xpath("(//span[text()='Women Kurta with Pants & Dupatta'])[1]"));
		
		Kurta.click();
		
	//*/CHECKBOX//*/
		
		WebElement CheckBox = driver.findElement(By.xpath("//input[@value='yes']"));
		
		System.out.println(CheckBox.isDisplayed());
		
		System.out.println(CheckBox.isEnabled());
		
		System.out.println(CheckBox.isSelected());
		
		

		}
		

}
