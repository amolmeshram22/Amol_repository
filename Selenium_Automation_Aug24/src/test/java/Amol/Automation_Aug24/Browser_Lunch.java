package Amol.Automation_Aug24;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Lunch {

	public static void main(String[] args) {
		
		
		// WebDriver driver = new FirefoxDriver();
		
		// WebDriver driver = new  EdgeDriver();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.amazon.in/");
		 
		/* driver.findElement(By.id("gw-ftGr-desktop-hero-1"));	
		 driver.findElement(By.className("skip-link"));
		 driver.findElement(By.linkText("Mobiles"));
		 driver.findElement(By.tagName("option"));
		 driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']"));*/
		 
		 
		 
		 
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		// FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
			//	 pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);		 
		 System.out.println(driver.getTitle());
		 
		 driver.close();
		 
		 
		
		
				
	}

}
