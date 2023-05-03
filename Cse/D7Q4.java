package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D7Q4 {
	WebDriver driver;
  @Test
  public void test1() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  String s1 = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  String s2 = driver.getCurrentUrl();
	  
	  Assert.assertEquals(s1,s2);
  }
  
  @Test(dependsOnMethods="test1")
  public void test2() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  
	  String c1 = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  String c2 = driver.getCurrentUrl();
	  
	  Assert.assertEquals(c1, c2);
  }
}
