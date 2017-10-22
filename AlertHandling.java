package jira;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	@Test
	public void alertHandle() throws InterruptedException
	{
		
		String path="D:\\final software\\ChromeDriver 2.29\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		Thread.sleep(1000);
		Alert ale=driver.switchTo().alert();
		String message=ale.getText();
		ale.accept();
		Thread.sleep(1000);
		
		
		
	}

}
