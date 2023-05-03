package com.selenium.Cse;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class D9Q1 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  
	  System.out.println(n+s);
	  
	  if(n==1 && s==4)
		  Assert.assertEquals(5, n+s);
	  else if(n==2 && s==5)
		  Assert.assertEquals(7, n+s);
	  else if(n==3 && s==6)
		  Assert.assertEquals(9, n+s); 
  }
  
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	  
	  System.out.println(s-n);
	  
	  if(n==1 && s==4)
		  Assert.assertEquals(3, s-n);
	  else if(n==2 && s==5)
		  Assert.assertEquals(3, s-n);
	  else if(n==3 && s==6)
		  Assert.assertEquals(3, s-n); 
  }
  
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) {
	  
	  System.out.println(n*s);
	  
	  if(n==1 && s==4)
		  Assert.assertEquals(4, s*n);
	  else if(n==2 && s==5)
		  Assert.assertEquals(10, s*n);
	  else if(n==3 && s==6)
		  Assert.assertEquals(18, s*n); 
  }
  
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  
	  System.out.println(s/n);
	  
	  if(n==1 && s==4)
		  Assert.assertEquals(4, s/n);
	  else if(n==2 && s==5)
		  Assert.assertEquals(2, s/n);
	  else if(n==3 && s==6)
		  Assert.assertEquals(2, s/n); 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 4 },
      new Object[] { 2, 5 },
      new Object[] { 3, 6 },
      
    };
  }
}
