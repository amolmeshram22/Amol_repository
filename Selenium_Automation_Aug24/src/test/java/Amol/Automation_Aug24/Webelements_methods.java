package Amol.Automation_Aug24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_methods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		 
		 WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		// click
		 Searchbox.click();
		// sendkeys
		 Searchbox.sendKeys("Mobiles");
		 Thread.sleep(3000);
		//Remove it use to clear what ever u enter 
		 Searchbox.clear();
		 
		 Searchbox.sendKeys("Books");
		 System.out.println(Searchbox.getAttribute("value"));
		 
		 // get location 
		 System.out.println("the x cordinate of searchbox line"+Searchbox.getLocation().x);
		 System.out.println("the y cordinate of searchbox line"+Searchbox.getLocation().y);
		 
		 // get size 
		 System.out.println("Size of search box is :"+Searchbox.getSize());
		 
		 //get tagname 
		 System.out.println("The tag name is :"+Searchbox.getTagName());
		 
		 // id displayed
		 System.out.println();

		 
		 

		 
		
		
		
		
	}

}
