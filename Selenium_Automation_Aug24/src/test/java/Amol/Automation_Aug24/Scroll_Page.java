package Amol.Automation_Aug24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_Page extends Dynamic_code {

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		takescreenshot("Browser launch");
		
		hit_url("https://www.jeevansathi.com/");
		takescreenshot("Jeevansathi Webpage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		takescreenshot("After Scroll");
		
		js.executeScript("window.scrollBy(0,-500)");
		takescreenshot("Scroll Up");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takescreenshot("Scroll to Bottom");
		
		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		System.out.println("Title After Click="+driver.getTitle());
		takescreenshot("After clicking about us ");
		
		js.executeScript("window.history.back()");
		takescreenshot("back to jeevansathi");
		
		js.executeScript("window.history.forward()");
		takescreenshot("forward to about us");
		
		//js.executeScript("window.history.go(0)");
		//takescreenshot("After Refresh the page ");
		refresh();
		
		driver.close();
		
		
		
		
	}

}
