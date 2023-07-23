package Phase1Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String args[]) {
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

		WebElement Link1 = driver.findElement(By.linkText("Amazon miniTV"));

		Link1.click();

		WebElement Link2 = driver.findElement(By.partialLinkText("miniTV"));

		Link2.click();

		

	}

}
