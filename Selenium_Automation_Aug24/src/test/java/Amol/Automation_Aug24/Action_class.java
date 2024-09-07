package Amol.Automation_Aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_class  extends Dynamic_code{

	public static void main(String[] args) throws InterruptedException {
// action class : it provide user action like mouse action and keybord
		// step: 
		// create object of action class , it accepts the argument as  reference variable of webdriver interface
		// with the help of ref var of action class object you can perform differnt operations 
		
// mouse action 
		// move to element () : move curser to specific webelement 
		// click : it clicks on current location 
		// contextclick (): right click
		// double click (): double click
		//drag and drop (source , target): 
		// click and hold ()
		// release():
		// dreg and drop (source , x offset , y offset)
		
		//action.movetoelement().click().build.perform();  
		
		launch_browser("chrome");
		hit_url("https://jqueryui.com/slider/");
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
        Actions act = new Actions(driver);
        
       // act.moveToElement(Draggable).click().build().perform();
       //System.out.println("After click on draggable="+ driver.getTitle());
        
       //WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
       // act.moveToElement(Themes).contextClick().build().perform();
        
       //act.moveToElement(Themes).doubleClick().build().perform(); 
        
        WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(frame);
       WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
       act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
       Thread.sleep(3000);
       act.dragAndDropBy(slider, -200, 0).build().perform();

       driver.switchTo().defaultContent();
       
       WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
       act.moveToElement(Droppable).click().build().perform();
       System.out.println("After clinking on droppable="+driver.getTitle());
       
       WebElement frame_1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
       driver.switchTo().frame(frame_1);
       
      WebElement Drag = driver.findElement(By.cssSelector("div#draggable"));
     
      WebElement  drop = driver.findElement(By.cssSelector("div#droppable"));
      act.moveToElement(Drag).clickAndHold().moveToElement(drop).release().build().perform();	
      
	}

}
