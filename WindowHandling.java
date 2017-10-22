package jira;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WindowHandling
{
 
@Test
public void windows() throws InterruptedException
{

	String path="D:\\final software\\ChromeDriver 2.29\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	driver.findElement(By.id("button1")).click(); 
	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	driver.switchTo().window(tabs.get(1));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	 driver.close();
	driver.switchTo().window(tabs.get(0));
	driver.quit();
 
	
	
}
}