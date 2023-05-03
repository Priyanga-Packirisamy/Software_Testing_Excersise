package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4Q4 {
 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,1000)",""); //enables scrolling
  		
  		
    	driver.findElement(By.linkText("Clothing (5)")).click();
    	driver.navigate().back(); //click back button
    	Thread.sleep(3000);  //loading
    	driver.navigate().forward(); //click forward button
    	Thread.sleep(3000); //loading
    	driver.navigate().refresh(); //refresh button
    	driver.quit();
		
	}
	
}