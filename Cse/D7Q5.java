package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D7Q5 {
  
  WebDriver driver;
  
  @Test(groups = {"SmokeTest"})
  public void test1() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  String s1 = driver.getTitle();
	  String s2 = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(s1,s2);
	  driver.quit();

	  
  }
  
  @Test(groups = {"RegressionTest"})
  public void test2() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  
	  String s1 = "https://www.godaddy.com/en-in/domains";
	  String s2 = driver.getCurrentUrl();
	  Assert.assertEquals(s1,s2);
  }
  
  @Test(groups= {"RegressionTest"})
  public void Test3() {
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("hello");
	  
  }
  
  @Test(groups= {"SmokeTest"})
  public void Test11() throws Exception {
	  	System.out.println("in smoke test");
  }
  @Test(groups= {"RegressionTest"})
  public void Test22() throws Exception {
	  	System.out.println("in RegressionTest");
  }
  
}
