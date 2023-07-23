package Phase1Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String args[])

	{

		System.setProperty("WebDriver.chrome.driver", "./BrowserUtils/chrome.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		String PageURL1 = driver.getCurrentUrl();

		String PageTitle1 = driver.getTitle();

		System.out.println("The Page URL Before Login is - " + PageURL1);
		System.out.println("The Page Title Before Login is - " + PageTitle1);

		signin.click();

		WebElement userName = driver.findElement(By.name("email"));

		userName.sendKeys("neelavenidarla@gmail.com");

		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));

		Continue.click();

		WebElement Password = driver.findElement(By.id("ap_password"));

		Password.sendKeys("Neelaveni92");

		WebElement Submit = driver.findElement(By.className("a-button-input"));

		Submit.click();

		String PageURL2 = driver.getCurrentUrl();

		String PageTitle2 = driver.getTitle();

		System.out.println("The Page URL After Login is - " + PageURL2);
		System.out.println("The Page Title After Login is - " + PageTitle2);

		// Navigate to a new URL from the existig browser

		driver.navigate().to("https://www.firstcry.com/");

		// To come to the previous URL

		driver.navigate().back();

		// To go forward to the same web page

		driver.navigate().forward();

		// To refresh a page

		driver.navigate().refresh();
		
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links" +allLinks.size());
		
		for(int i = 0;i<allLinks.size();i++)
		{
			
			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getAttribute("href"));
			
		}
			


		
	}

}
