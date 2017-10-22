package jira;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	public static String driverPath = "D:\\final software\\ChromeDriver 2.29\\chromedriver.exe";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String s=driver.getCurrentUrl();
		WebElement search=driver.findElement(By.id("lst-ib"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);		
		System.out.println(s);

		getscreenshot(driver);
		Thread.sleep(2000);
		driver.close();

	}
	 public static void getscreenshot(WebDriver driver) throws Exception 
     {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
     }
}
