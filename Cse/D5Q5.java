package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D5Q5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Apple");   //search apple in search bar
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER); // click enter key
	    Thread.sleep(3000);
	    String m=driver.getTitle();
	    String n=driver.getWindowHandle();
	    System.out.println(m+" "+n);
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("selenuim");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    String r=driver.getTitle();
	    String a=driver.getWindowHandle();
	    System.out.println(r+" "+a);
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("cucumber");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    String b=driver.getTitle();
	    String c=driver.getWindowHandle();
	    System.out.println(b+" "+c);
	   
	    
	   
	}

}