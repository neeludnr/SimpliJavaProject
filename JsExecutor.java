package Phase1Project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class JsExecutor {
	
	public static void main(String args[]) throws AWTException, IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "./BrowserUtils/chrome.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("window.scrollBy(0,800)","");
		
         Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-300)","");

		
		
		
	}

}
