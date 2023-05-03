package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D5Q2 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Actions c=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement des=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        c.clickAndHold(source).release(des).build().perform();
        c.dragAndDrop(source, des).build().perform();
	}

}
