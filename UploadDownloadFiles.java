package jira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 
 * @author M1041694
 *Upload files
 */
public class UploadDownloadFiles {

	public static void main(String[] args) {
	
		  String driverPath ="D:\\final software\\Selenium\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe";
		  //Internet explorer
		  System.setProperty("webdriver.ie.driver", driverPath);
		  WebDriver driver=new InternetExplorerDriver();
		  driver.get("http://demo.guru99.com/selenium/upload/");
		  driver.manage().window().maximize();
		  WebElement upload= driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		  upload.sendKeys("C:\\Users\\M1041694\\Documents\\display dao.txt");
		  driver.findElement(By.id("terms")).click();
		  driver.findElement(By.id("submitbutton")).click();
		  driver.quit();
		  driver.close();

	}

}
