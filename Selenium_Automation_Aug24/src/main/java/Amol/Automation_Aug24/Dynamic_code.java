package Amol.Automation_Aug24;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_code {
	
	private static final String Source  = null;
	private static final String Projectpath = null;
	public static WebDriver driver;
	
	// LAUNCH BROWER
	
	public static void launch_browser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
		    driver = new EdgeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
		    driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Launched browser is :"+ browser);
	}
	
	//HIT URL
	
	public static void hit_url(String url)
	{
		driver.get(url);
		System.out.println(driver.getTitle());
	}
	
	// ENTER TEXT USING ACTION CLASS
	
		
		public static void enter_text(WebElement element, String text)
		{
			Actions act = new Actions(driver);
			act.moveToElement(element).click().sendKeys(text).build().perform();
		}
		
		// SELECT AND COPY PASTE
		public static void select_copy()
		{
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		}
		public static void paste()
		{
			Actions act = new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		}
		 
		//RIGHT CLICK
		
		public static void right_click(WebElement Rclick)
		{
			Actions act = new Actions(driver);
			act.moveToElement(Rclick).contextClick().build().perform();
		}
		
		// DOUBLE CLICK
		
		public static void double_click(WebElement Dclick)
		{
			Actions act = new Actions(driver);
			act.moveToElement(Dclick).doubleClick().build().perform();
		}
		
		// DRAG AND DROP 
		
		public static void drag_and_drop(WebElement source , WebElement target)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
		}
		
		// SLIDER MOVE BY OFFSET
		
		public static void slider_move_offset(WebElement elementname , int x , int y)
		{
			Actions act = new Actions(driver);
			act.moveToElement(elementname).dragAndDropBy(elementname, x, y).build().perform();
		}
		
		// SWITCH TO FRAME
		
		public static void switch_frame(WebElement f)
		{
			driver.switchTo().frame(f);
		}
	
	//TAKE SCREENSHOT
	
	public static void takescreenshot(String screenshot_name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Jeevansathi_javascripts/"+screenshot_name+ ".png");
		FileHandler.copy(Source, target);
	}
	
	public static void screenshot2(String ss_name) throws IOException
	{
		String Projectpath = System.getProperty("user.dir");
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File(Projectpath + "\\Selenium_Screenshots\\"+ ss_name + "png");
	    FileHandler.copy(Source2, target2);
	}
	
	// REFRESH
	
	public static void refresh()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.go(0)");
	}
	 
	//FORWARD
	
	public static void forward()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.forward()");
	}
	
	//BACK
	
	public static void back()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
	}
	
	// SCROLL TO BOTTOM
	
	public static void Scroll_Bottom()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	 
	// SCROLL
	
	public static void Scroll(int x , int y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+"("+x+","+y+")");
	}
	
}
