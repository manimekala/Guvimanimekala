package jira;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * 
 * @author M1041694
 *  Mouse movements
 *  Drag and drop
 *  Resizing an element 
 *  click and hold 
 */
public class MouseMovements {
	@Test
	public void test() throws InterruptedException
	{
	String path="D:\\final software\\ChromeDriver 2.29\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jqueryui.com");

	driver.findElement(By.linkText("Droppable")).click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	 Actions action= new Actions(driver);
	WebElement drag= driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	
	
	//drag and drop
	action.dragAndDrop(drag,drop).build().perform();
   
  	//click and hold 
   // action.clickAndHold(drag).moveToElement(drop).release().build().perform();
    
	Thread.sleep(1000);
    
    //resizing an element
    driver.findElement(By.linkText("Resizable")).click();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.switchTo().frame(0);
   //
  
    //  Actions action= new Actions(driver);
   WebElement resize= driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
  action.clickAndHold(resize).moveByOffset(120,80).release(resize).build().perform();
   
  Thread.sleep(1000);
  
    
    
    
    
    
	
	
	

	}
}
