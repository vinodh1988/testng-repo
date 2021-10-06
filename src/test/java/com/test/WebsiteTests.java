package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebsiteTests {
	WebDriver wd;

	
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver",System.getenv("CHROME_DRIVER_PATH"));
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("headless");
	  wd=new ChromeDriver(opt);
	 // wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  
  @Test(priority=1)
  public void titleTest() {
	  wd.get("http://localhost:8880/");
	  Assert.assertEquals(wd.getTitle(), "SampleSite");
	 
  }
  
  @Test(priority=2)
  public void headerTest() {
	  List<WebElement> list=wd.findElements(By.tagName("h1"));
	  Assert.assertEquals(list.get(0).getText(), "Sales Website");
  }
  
  @Test(priority=3)
  public void messageClick() {
	  WebElement btn1=wd.findElement(By.id("btn2"));
	  btn1.click();
	  Assert.assertEquals(wd.findElement(By.id("message2")).getText(),"EUROPE");
  }
  
  @Test(priority=4)
  public void messageClick2() {
	  WebElement btn1=wd.findElement(By.id("btn1"+ ""));
	  btn1.click();
	  //explicit await
	  WebDriverWait wait=new WebDriverWait(wd, 30);
	 /* Wait wait=new FluentWait(wd)
			  .withTimeout(30,TimeUnit.SECONDS)
			  .pollingEvery(3,TimeUnit.SECONDS)
			  .ignoring(Exception.class);*/
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
	  Assert.assertEquals(wd.findElement(By.id("message")).getText(),"INDIA");
  }
}
