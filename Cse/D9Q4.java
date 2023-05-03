package com.selenium.Cse;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class D9Q4 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement user = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	  WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	  user.sendKeys("Admin");
	  pass.sendKeys("admin123");
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  login.click();
	  String m = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  String n = driver.getCurrentUrl();
	  Assert.assertEquals(m,n);
  }
  
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String b1) 
  {
	  if(b1.equals("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
  	}
	  else if(b1.equals("edge"))
	  {		WebDriverManager.edgedriver().setup();
		  	driver=new EdgeDriver();
			driver.manage().window().maximize();
			String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(url);
			driver.manage().window().maximize();  
	  }
}

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

