package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class Demo1 {
		WebDriver driver= null;
  
  public void open() throws IOException, InterruptedException, AWTException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	  
	  driver.findElement(By.name("submit")).click();
	  
	  Thread.sleep(1000);
	  
	  Alert alert= driver.switchTo().alert();
	  
	  System.out.println(alert.getText());
	  
	  Thread.sleep(1000);
	 	
	  	alert.accept();
		  
		  
		 
	 
		  alert.dismiss();
	  		Thread.sleep(1000);
	  		driver.findElement(By.xpath("//input[@value='Reset']")).click();
	  		
	  		
	  		/*Alert alert1= driver.switchTo().alert();
			  
			  System.out.println(alert1.getText());
			  
			  Thread.sleep(1000);
			  
			  alert1.dismiss();*/
	 
	  
	  
	  
	  
	  
	  
	// driver.close();  
	  
  }
  }