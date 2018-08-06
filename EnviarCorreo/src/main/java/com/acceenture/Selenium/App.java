package com.acceenture.Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Optional, if not specified, WebDriver will search your path for chromedriver.
    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	  WebDriver driver;
    	  driver = new ChromeDriver();
    	  
    	  
  		driver.navigate().to("http://google.com");
  		WebElement searchBox = driver.findElement(By.name("q"));
  	  searchBox.sendKeys("gmail");
  	  searchBox.submit();
  	
  	WebElement clickgmail = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a"));
  	//*[@id="rso"]/div[1]/div/div/div/div/h3/a
  	  clickgmail.click();
  	  
  	WebElement clicksign = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
  	clicksign.click();
  	
  	WebElement clickUser = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
  	clickUser.sendKeys("andresprueba.selenium@gmail.com \n");
    try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}  // Let the user actually see something!

  	WebElement clickpss = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
  	clickpss.sendKeys("prueba123\n");
  	
    try {
  		Thread.sleep(6000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    
    
  	WebElement clickredactar = driver.findElement(By.className("z0"));
  	clickredactar.click();

  	try {
  		Thread.sleep(3000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} 
  	
  	
  	WebElement clickremitente = driver.findElement(By.name("to"));
  	clickremitente.sendKeys("andresprueba.selenium@gmail.com");
  	try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} 
  	
	WebElement clickasunto = driver.findElement(By.name("subjectbox"));
	clickasunto.sendKeys("prueba123\tholaxDz\t\n");
	
	try {
  		Thread.sleep(1000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} 
  	
	
//	WebElement clickmensaje = driver.findElement(By.id("9o"));
//	clickmensaje.sendKeys("prueba123");
//	
//	try {
//  		Thread.sleep(1000);
//  	} catch (InterruptedException e) {
//  		// TODO Auto-generated catch block
//  		e.printStackTrace();
//  	} 
  	
//	WebElement clickenviar = driver.findElement(By.xpath("//*[@id=\":89\"]"));
//	clickenviar.click();
	
	try {
  		Thread.sleep(5000);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} 

//	driver.quit();
    }
}
