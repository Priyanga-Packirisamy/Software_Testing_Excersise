package com.selenium.Cse;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class D7Q1 {
	
  WebDriver driver;
  
  @Test
  public void f() {
	 String t1 = driver.getTitle();
	 System.out.println(t1);
	 String t2 = "Guest Registration Form – User Registration";
	 Assert.assertEquals(t1,t2);

  }
  
  @BeforeTest
  public void beforeTest() {

	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
