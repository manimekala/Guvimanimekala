package jira;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
/**
 * 
 * @author M1041694
 * Keyboard actions
 *
 */
public class Keyboard {
	@Test
	public void test()
	{
	
		String path="D:\\final software\\ChromeDriver 2.29\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		
		//To perfrom single action
		Actions action = new Actions(driver);
		//To combine all the single operation and build it as a one
		action.keyDown(firstname, Keys.SHIFT).sendKeys(firstname, "manimekala").keyUp(firstname, Keys.SHIFT).build().perform();
		action.sendKeys(firstname,Keys.TAB);
		action.keyDown(lastname,Keys.SHIFT).sendKeys(lastname,"subramaniyan").keyUp(lastname,Keys.SHIFT).build().perform();
		
		
		//driver.quit();
		driver.close();
	}

}
