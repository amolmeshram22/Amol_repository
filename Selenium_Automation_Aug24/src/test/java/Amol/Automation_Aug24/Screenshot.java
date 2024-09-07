package Amol.Automation_Aug24;

import java.awt.desktop.OpenFilesHandler;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends Dynamic_code {

	public static void main(String[] args) throws IOException {

		launch_browser("chrome");
		hit_url("https://www.snapdeal.com/");
		
		// tel driver to take the screen shot
		// use take screenshot interface (you need to create object)
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// with the help of reference variable of takescreenshot interface use getscreenshot AS method
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		// directly with foldername and file name 
		
		File target = new File("./Selenium_Screenshots/Browser_Launch.png");
		
		org.openqa.selenium.io.FileHandler.copy(Source, target);
	}

}
